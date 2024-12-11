package gr.aueb.cf.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.rmi.ServerError;

public class NamesScanning {

    public static void main(String[] args) {
        String inFilePath = "C:/tmp/names.txt";
        String outFilePath = "C:/tmp/names-formatted.txt";
        String line;
        String[] tokens;

        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
             PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)) {

            while ((line = reader.readLine()) != null) {
                tokens = line.split(",+\\s*");
//                ps.printf("{ \"Firstname\": \"%s\", \"Lastname\" : \"%s\", \"City\": \}%s"\" }", \n", tokens[0], tokens[1], tokens[2]);
                printFormatted(ps, tokens);

            }
        } catch(IOException e) {
            System.err.println("Error. File not Found");
        }

    }


    public static void printFormatted(PrintStream ps, String[] tokens) {
        ps.printf("{ \"Firstname\": \"%s\", \"Lastname\" : \"%s\", \"City\": \"%s\" }, \n", tokens[0], tokens[1], tokens[2]);

    }
}
