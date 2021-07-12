package tr.org.bura.egitim.java.chapter10.numberFormatting;

import java.sql.SQLOutput;

public class RoundingNumbers {
    public static void main(String[] args) {
        Float rate = 1.2343f;
        System.out.println(Math.round(rate));
        System.out.println(Math.ceil(rate));
        System.out.println(Math.floor(rate));

        System.out.printf("Rounding number %.3f", rate);
    }
}
