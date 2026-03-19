package ProblemFour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("p059_cipher.txt");
    
        try (Scanner myReader = new Scanner(file)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data + "\n");

                String[] words = data.split(",");

                int index = 0;

                for(String word : words){
                    // 97-122 all ascii from a-z

                    String test = 
                    
                    int nb = Integer.parseInt(word);


                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
