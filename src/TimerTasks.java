import java.util.Timer;
import java.util.TimerTask;

public class TimerTasks {
    public static void main(String[] args) {
        //Timer - class that schedule tasks at specific times or periodically
        //        useful for - sending notifications, scheduled updates and repetitive actions

        //TimerTask - Represents the task that will be executed by the timer
        //            you will extend the TimeTask class to define your task
        //            create a subclass of TimerTask and @override run()


        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            int count = 3;

            @Override
            public void run(){
                System.out.println("JANU!");
                count--;

                if(count <= 0){
                    System.out.println("TASK completed!!");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task,0,3000);


    }
}
