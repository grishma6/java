import java.util.Scanner;

public class Enumeration {
    public static void main(String[] args){
        //enums - (enumeration) a special kind of class that
        //        represents a fixed type of constants
        //        they improve code readability and are easy to maintain
        //        rather than comparing strings



        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Day:");
        String response = scanner.nextLine().toUpperCase();



        //System.out.println(day);
        //System.out.println(day.getDayNumber());

        try {
            Day day = Day.valueOf(response);

            switch (day) {
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It is a Week day");

                case SATURDAY, SUNDAY -> System.out.println("It is a Week End");

            };
        }catch(IllegalArgumentException e){
            System.out.println("Please enter a valid Day");
        }


        scanner.close();
    }
}
