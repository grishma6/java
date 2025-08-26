import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        //Array List - A resizable array that stores objects (autoboxing)
        //             Arrays are fixed in size, ArrayList can change
        //add is a built method of array list

        //for storing an integer
        ArrayList<Integer> list = new ArrayList<>();

        list.add(8);
        list.add(6);
        list.add(5);
        list.add(4);

        System.out.println(list);

//for storing a string
        ArrayList<String> fruits = new ArrayList<>();// <> called diamond operator

        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("blueberries");

        //fruits.remove("apple");
        // fruits.set(1, "raspberry");

        //System.out.println(fruits.get(3));

        //System.out.println(fruits.size());

        //to sort the array will use collections method
        Collections.sort(fruits);
        //System.out.println(fruits);

        //enhanced for loop
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the arraylist: ");
        int sizeOfArray = scanner.nextInt();
        scanner.nextLine();


        for (int i = 1; i <= sizeOfArray; i++) {
            System.out.print("Enter the food" + i + ": ");
            String food = scanner.nextLine();
            list.add(Integer.valueOf(food));
        }
        System.out.println(list);


        scanner.close();


    }
}
