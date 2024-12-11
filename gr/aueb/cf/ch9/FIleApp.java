package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FIleApp {

    public static void main(String[] args) {
        File fd = new File("c:/tmp/file6.txt");
        String line;
        String[] tokens;

        try (Scanner in = new Scanner(fd)){
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split("\\s+");

                for(String token : tokens) {
                    System.out.print(token + " ");
                }
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
