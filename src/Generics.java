public class Generics {
    public static void main(String[] args) {

        //Generics - A concept where you can write a class, interface or a method
        //           that is compatible with different data types
        //           <T> type parameter(placeholder that gets replaced with a real type)
        //           <String> type argument specifies the type
        //           <T, U> we can have more than two types; [<T,U,V>]

        /*Box<String> box = new Box<>();

        box.setItem("banana");

        System.out.println(box.getItem());*/

        Product<String, Double> product = new Product<>("apple", 3.45);
        Product<String, Integer> product1 = new Product<>("ticket", 20);


        System.out.println(product.getItem());
        System.out.println((product.getPrice()));


        System.out.println(product.getItem());
        System.out.println(product1.getPrice());
    }
}
