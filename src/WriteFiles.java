import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args){
        //How to write a file using java(4 options)

        //FileWriter - Good for small or medium size text files
        //BufferedWriter - Better performer for large amount of text
        //PrintWriter - best for structured data like reports or logs
        //FileOutputStream - best for binary files(eg - images, audio files)

        String fileName = "/Users/grishmagolla/Downloads/janu.txt";
        String fileContent = """
                ROSES are red
                VIOLETS are blue
                AND my love for you is true
                """;

        try(FileWriter writer = new FileWriter(fileName)){
            writer.write(fileContent);
            System.out.println("The file is written");
        }
        catch(FileNotFoundException e){
            System.out.println("File not Found");
        }
        catch(IOException e){
            System.out.println("The file is NOT written");
        }


    }
}
