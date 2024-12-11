package gr.aueb.cf.ch2;

import java.math.BigInteger;

public class BigIntApp {

    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("1234567979869867967");
        BigInteger bigNum2 = new BigInteger("2341237896555555555588");
        BigInteger result;

        result = bigNum1.add(bigNum2);

        System.out.printf("%,d", result);
    }


}
