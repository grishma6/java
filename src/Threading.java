import java.util.Scanner;

public class Threading {
    public static void main(String[] args){
        //Threading - allows a program to run multiple tasks simultaneously
        //            Helps improve performance with time-consuming operations
        //            File(I/O, network communications, or any background tasks)

        //How to create a thread
        //Option 1: Extend the thread class(simpler) [limited]
        //option 2: Implement the Runnable interface(better)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name in 10 seconds:");

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.setDaemon(true); //ends when the main thread is over
        thread.start();

        System.out.print("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);


        scanner.close();
    }
}
