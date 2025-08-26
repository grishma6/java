import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {
    public static void main(String[] args){
        //How to read files using Java(3 popular options)

        //BufferedReader + FileReader = best for reading text files line by line
        //FileInputStream = Best for binary files(e.g: images, audio files)
        //RandomAccessFile = Best for read/write for specific portions of a large file

        String filePath = "/Users/grishmagolla/Downloads/janu.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Files NOT found");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }

    }
}
