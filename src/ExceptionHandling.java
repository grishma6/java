import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandling {
    public static void main(String[] args) {
        //Exception - An exception that interrupts the normal flow of a program
        //            (Dividing by zero, file not found, mismatch input type)
        //            surround any dangerous code with a try{} block
        //            try{}, catch{}, finally{}
        //finally - used for cleaning up the program, when the programmer is done with it and it always executes



        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        }
        catch(InputMismatchException e){
            System.out.println("INVALID INPUT");
        }

        catch(ArithmeticException  e){ // e is a nickname
            System.out.print("you CAN'T divide by zero");
        }
        catch(Exception e){
            //SAFETY NET
            System.out.println("something went WRONG");
        }
        finally{
            //scanner.close();
            System.out.println("This always executes");
        }


    }
}
