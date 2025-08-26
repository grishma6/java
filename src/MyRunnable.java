public class MyRunnable implements Runnable{


    @Override
    public void run(){
        for(int i = 0; i <= 10; i++) {
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Something went wrong");
            }
            if (i == 10) {
                System.out.println("Time's UP");
                System.exit(0);  //program will end at 10 seconds
            }
        }
    }
}
