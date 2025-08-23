import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args){
        //How to PLAY AUDIO in java (.wav, .au, .diff)

        String filepath = "/Users/grishmagolla/IdeaProjects/gri/src/Nebula - The Grey Room _ Density & Time.wav";
        File file = new File(filepath);
//Autoclose Interface
        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = " ";

            while(!response.equals("Q")){
                System.out.println("Play: P");
                System.out.println("Reset: R");
                System.out.println("Quit: Q");
                System.out.println("Stop: S");

                System.out.print("Enter your choice: ");
                response = scanner.next().toUpperCase();

                switch(response){
                    case "P" -> clip.start();
                    case "R" -> clip.getMicrosecondPosition();
                    case "S" -> clip.stop();
                    case "Q" -> clip.close();
                    default -> System.out.println("INVALID CHOICE");
                }

            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Unsupported Audio File");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("Janu!!");
        }



    }
}
