package tr.org.bura.egitim.java.chapter04;



import tr.org.bura.egitim.java.chapter06.Car;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //------------------for loop example - 2 -----------------------
        int sum = 0;
        int n = 100;

        for (int i = 0; i <= n; i++) {
            sum += i;     // sum = sum + i
        }
        System.out.println("Sum of numbers from 0 to 100 is: " + sum);

        //------------------for loop example - 2 -----------------------
        String[] names = {"Ali", "Veli", "Hatice"};

        for (String name : names) {
            System.out.println("loop with for-each loop");
            System.out.println(name);
        }

        for (int i = 0; i < names.length; i+=3) {
            System.out.println("loop with classical for-loop");
            System.out.println(names[i]);
        }


        //------------------continue usage in for loop -----------------------
        for (int i = 1; i <= 10; ++i) {

            if (i > 4 && i < 9) {
                continue;
            }
            System.out.println(i);
        }


        // declare variables*/
        int firstNumber = 1, lastNumber = 5;

        // while loop from 1 to 5
        // this is wrong usage of the continue statement
        while(firstNumber <= lastNumber) {
            if(firstNumber == 3){
                continue;
            }
            System.out.println(firstNumber);
            firstNumber++;
        }
        //this is the correct one
        while(firstNumber <= lastNumber) {
            if(firstNumber == 3){
                firstNumber++;
                continue;
            }
            else{
                System.out.println(firstNumber);
                firstNumber++;
            }

        }





        //------------------while loop example - 2 -----------------------
        int sum2 = 0;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);
        // take integer input from the user
        System.out.println("Enter a number");
        int number = input.nextInt();

        // while loop continues
        // until entered number is positive
        while (number >= 0) {
            // add only positive numbers
            sum2 += number;

            System.out.println("Enter a number");
            number = input.nextInt();
        }

        System.out.println("Sum = " + sum2);
        input.close();


        //------------------do-while loop example - 2 -----------------------
        int a = 6;
        do{
            System.out.println("Inside of do-while loop");
            a++;
        }while(a < 10);

        Car honda = new Car();
        honda.displayName();

    }
}
