import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {

        String filePath = "/Users/grishmagolla/IdeaProjects/gri/src/words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                words.add(line.trim());
            }

        }
        catch(FileNotFoundException e){
            System.out.println("File NOT found");
        }
        catch(IOException e){
            System.out.println("Something is wrong");
        }
        System.out.println(words);
        Random random = new Random();

        String wordName = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);

        ArrayList<Character> guessWord = new ArrayList<>();
        int wrongGuess = 0;

        for(int i = 0; i < wordName.length(); i++) {
            guessWord.add('_');
        }

        System.out.println("****Welcome to The Hungman Game****");
        System.out.print("word:" );

        while(wrongGuess < 6){
            for(char c : guessWord) {
                System.out.print(" " + c);
            }
            System.out.println();

            System.out.print("Guess a word: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if(wordName.indexOf(guess) >= 0){
                System.out.println("Correct Guess! \n");

                for(int i = 0; i < wordName.length(); i++) {
                    if(wordName.charAt(i) == guess) {
                        guessWord.set(i,guess);
                    }
                }
                if(!guessWord.contains('_')){
                    System.out.print(getHangmanArt(wrongGuess));
                    System.out.println("YOU WON!!");
                    System.out.print("The word was: " + wordName);
                    break;
                }
            }
            else{
                System.out.println("Wrong Guess! \n");
                wrongGuess++;
            }
        }
        if(wrongGuess >= 6){
            System.out.print(getHangmanArt(wrongGuess));
            System.out.println("Wrong Guess!");
            System.out.println("The word was " + wordName);
        }

        scanner.close();
    }
    static String getHangmanArt(int wrongGuess){
        return switch(wrongGuess){
            case 0 -> """
                      o
                    """;
            case 1 -> """
                      o
                      |
                    """;
            case 2 -> """
                      o
                      /|
                    """;
            case 3 -> """
                       o
                      /|
                    """;
            case 4 -> """
                       o
                      /|\\
                    """;
            case 5 -> """
                       o
                      /|\\
                      /
                    """;
            case 6 -> """
                       o
                      /|\\
                      / \\
                    """;
            default -> "";

        };


    }

}

