import java.sql.SQLOutput;

public class Multithreading {
    public static void main(String[] args) {
        //Multithreading - enables a program to run multiple threads concurrently
        //                 (thread - a set of instructions that run independently)
        //                 useful for background tasks or time-consuming operations

        //MyRunnable runnable1 = new MyRunnable();
        Thread thread1 = new Thread(new MyRunnable1("PING"));
        Thread thread2 = new Thread(new MyRunnable1("PONG"));

        thread1.start();
        thread2.start();

        System.out.println("GAME START");

        try{
            thread1.join();
            thread2.join();
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }

        System.out.println("GAME OVER");
    }
}
