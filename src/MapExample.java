import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        //HashMap = A data structure that holds key value pair
        //          keys are unique, but can be duplicated
        //          Doesn't maintain any order, but memory is different
        //          HashMap<key,pair>

        HashMap<String, Double> map = new HashMap<>();

        map.put("Apple", 5.5);
        map.put("Banana", 3.6);
        map.put("Orange", 1.2);
        map.put("Coconut", 1.0);

        //map.remove("Banana");
        //map.put("Orange", 10); //when value duplicates it overrides
        //System.out.println(map);
        //System.out.println(map.get("Coconut"));
        //System.out.println(map.containsKey("Orange"));
        //System.out.println(map.containsValue(1.0));
        //System.out.println(map.size());

        if(map.containsKey("Apple")){
            System.out.println(map.get("Apple"));
        }
        else{
            System.out.println("Key NOT found");
        }

        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key)) ;
        }
    }
}
