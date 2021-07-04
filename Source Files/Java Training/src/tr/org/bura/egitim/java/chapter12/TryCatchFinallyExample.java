package tr.org.bura.egitim.java.chapter12;

import java.util.ArrayList;
import java.util.List;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        //try-catch-finally example-1--------------------------------------
        List<String> animalList = new ArrayList<>();
        //String[] shopList = {"Water", "Milk", "Bread"};
        //System.out.println(animalList.get(0));
        try {
            System.out.println(animalList.get(0));
            //System.out.println(shopList[3]);
        }
        /*catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You have tried to access an element of the array that index number bounds of the object container!");
        }*/

        catch (IndexOutOfBoundsException e){
            //System.out.println("You have tried to access a member that out of bounds of the object container!");
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("An exception is occurred. You can find details below \n" + e.getMessage());
            e.printStackTrace();
        }

        finally {
            System.out.println("This is the finally block of the try-catch statement");
        }
        //try-catch-finally example-2--------------------------------------

       /* try{
            int a = 5/0;
            System.out.println(a);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This is the finally block of the try-catch statement");
        }*/

    }
}
