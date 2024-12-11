package gr.aueb.cf.ch7;

public class StrTraverse {

    public static void main(String[] args) {
        String s = "Coding Factory" ;

        for (int i = 1; i <= s.length(); i++) {
            System.out.print(s.charAt(s.length() - i ));
        }

    }
}
