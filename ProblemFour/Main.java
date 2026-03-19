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

                for(int i = 0; i < words.length; i++){
                    // 97-122 all ascii from a-z
                    int key = 0;

                    for(char temp : keySt.toCharArray()){
                        key += temp;
                    }

                    String word = words[i];
                    
                    int nb = Integer.parseInt(word);
                    char c = (char)nb; 

                    char test = c ^ key;

                    if(test < 97 || test > 122){
                        while(c < 97 || c > 122){
                            key++;
                            
                            test = c ^ key;
                        }

                        i = 0;

                        sb = new StringBuilder();
                    }
                    else{
                        sb.append(test);
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
