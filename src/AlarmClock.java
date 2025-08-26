import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

import static java.time.LocalTime.now;

public class AlarmClock implements Runnable {


    public final LocalTime alarmTime;
    public final String filepath;
    public final Scanner scanner;

    AlarmClock(LocalTime alarmTime, String filepath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filepath = filepath;
        this.scanner = scanner;
    }

    @Override
    public void run(){

        while(LocalTime.now().isBefore(alarmTime)){
            try{
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();


                System.out.printf("%02d:%02d:%02d\n",
                                    now.getHour(),
                                    now.getMinute(),
                                    now.getSecond());
            }
            catch(InterruptedException e){
                System.out.println("thread was interrupted");
            }
        }
        System.out.println("**Alarm Noises**");
        playSound(filepath);
    }

    public void playSound(String filepath){
        File audioFile = new File(filepath);


        try(AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            System.out.println("Enter * to stop Alarm");
            scanner.nextLine();
            clip.stop();
            scanner.close();
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file format is mot supported");
        }
        catch(LineUnavailableException e){
            System.out.println("Audio is Unavailable");
        }
        catch(IOException e){
            System.out.println("Error reading audio file");
        }
    }
}
