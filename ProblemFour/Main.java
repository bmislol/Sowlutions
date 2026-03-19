package ProblemFour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        File file = new File("p059_cipher.txt");
    
        try (Scanner myReader = new Scanner(file)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data + "\n");

                String[] words = data.split(",");

                int index = 0;

                String keySt = "aaa";

                for(String word : words){
                    // 97-122 all ascii from a-z
                    
                    int nb = Integer.parseInt(word);
                    char c = (char)nb;
                    
                    int key = 0;

                    for(char keyC : keySt.toCharArray()){
                        key += keyC;
                    }

                    while(!(c > 97 && c < 122)){
                        c ^= key;

                        key++;
                    }

                    System.out.println("nb: " + nb);
                    System.out.println("char: " + c);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println(sb.toString());
    }
}
