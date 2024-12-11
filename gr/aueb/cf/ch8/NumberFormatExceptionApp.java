package gr.aueb.cf.ch8;

import java.util.Scanner;

public class NumberFormatExceptionApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        String inputStr = "";

        try {
            System.out.println("Please insert an int");
            inputStr = in.nextLine();

            num = Integer.parseInt(inputStr);

            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Input must be an int");
        }

    }


}
