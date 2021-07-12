package tr.org.bura.egitim.java.chapter13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicInputOutput {
    public static void main(String[] args) {
        System.out.println("This is a test output through println() method");
        System.out.print("This is a test output through print() method");

        System.out.println();
        System.out.printf("%.2f%n",3.336f);
        System.out.println("the end");


        try (Scanner scanner = new Scanner(System.in)) {
            byte number = scanner.nextByte();
            System.out.println(number);
        }
        catch (InputMismatchException e){
            System.out.println("You entered an unexpected type of input. A byte expected.");
        }
        catch (Exception e){
            //System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("This is the finally block");
        }
    }
}
