package tr.org.bura.egitim.java.chapter03;

public class StringExamples {
    //field
    int b = 3;
    public static void main(String[] args){
       /* char aChar = 'a';
        //local variable
        String name = "Ayşe";
        name.length();
        name.charAt(0);
        System.out.println(name);
        System.out.println(name.length());

        int mass = 30;

        System.out.println(mass);

        var totalAmountOfPoints = "Hande";
        //totalAmountOfPoints = 13;

        int population = 150 + 120;
        int remainder = 10 % 4;

        System.out.println(remainder);

        int a = 23;
        a++;// a= a+1
        a--;// a=a-1

        boolean isStudent = !false;//true*/

        int number1 = 12;
        int number2 = 24;

        /*
        true && true == true
        true && false == false
        false && true == false
        false && false == false
         */
        /*
        1 * 1 = 1
        1 * 0 = 0
        0 * 1 = 0
        0 * 0 = 0
         */

        /*
        true || true == true
        true || false == true
        false || true == true
        false || false == false
         */

        System.out.println(number1 < number2);
        System.out.println(number1 == number2);
        System.out.println(number1 < number2 || number1 == number2);




        String name = "David";
        name = "Nancy";
        System.out.println(name instanceof String);

        {
            int blockVariable = 34;
            System.out.println(name);
        }

        //System.out.println(blockVariable);

    }


}


