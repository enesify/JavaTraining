package tr.org.bura.egitim.java.chapter12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class ThrowAndThrowsExample {
    public static void main(String[] args) {
        //ThrowAndThrowsExample throwAndThrowsExample = new ThrowAndThrowsExample();
        //throwAndThrowsExample.divide(10.0, 2.0);
        System.out.println(divide(2.5,0.0));
        System.out.println("After divide method!");

        try {
            testThrows();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static double divide(double dividend, double divisor) throws ArithmeticException /*throws NoSuchAlgorithmException*/ {
        if (divisor == 0){
            throw new ArithmeticException("Divide by Zero!");
        }
        return dividend / divisor;
    }

    public static void testThrows() throws NullPointerException, IOException {
        System.out.println("Testing throws...");
    }

}
