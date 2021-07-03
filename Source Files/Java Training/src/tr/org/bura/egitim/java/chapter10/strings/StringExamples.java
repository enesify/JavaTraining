package tr.org.bura.egitim.java.chapter10.strings;

import com.sun.security.jgss.GSSUtil;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //creating with String Literal
        String healthTip1 = "You should drink at least 2 liter water daily!";
        String healthTip2 = "You should drink at least 2 liter water daily!";
        String healthTip3 = "You should drink at least 2 liter water daily!";
        String healthTip4 = "You should drink at least 2 liter water daily!";
        String healthTip5 = "You should drink at least 2 liter water daily!";
        System.out.println(healthTip1 == healthTip2);
        System.out.println(healthTip1.equals(healthTip2));

        //creating with String Object
        String healthTip6 = new String("You should drink at least 2 liter water daily!");
        System.out.println(healthTip1 == healthTip6);
        System.out.println(healthTip1.equals(healthTip6));

        //String Methods
        byte[] stringBytes = healthTip1.getBytes(StandardCharsets.UTF_8);
        System.out.println(stringBytes);

        String greeting = "Hi everyone, how are you?";
        String subGreeting1 = greeting.substring(0, greeting.indexOf(','));
        String subGreeting2 = greeting.substring(greeting.indexOf(',') + 2);
        System.out.println(subGreeting1);
        System.out.println(subGreeting2);

        //concat and toCharArray methods
        System.out.println(subGreeting1.concat(", ").concat(subGreeting2));
        for (char c :
                greeting.toCharArray()) {
            System.out.println(c);
        }



        //print a string with reverse array
        char[] greetingChars = greeting.toCharArray();

        for (int i = greeting.length()-1; i>=0; i--){
            System.out.print(greetingChars[i]);
        }

        //Java 8 join method
        System.out.println();
        System.out.println(String.join("-", new String[]{"Hi","are", "you", "okay"}));

        //Java 11 String Methods
        String onlyContainsWhitespaces = "  ";
        System.out.println(onlyContainsWhitespaces.isEmpty());
        System.out.println(onlyContainsWhitespaces.isBlank());

        String school = "Bogazici \nUniversity";
        school.lines().forEach(c -> System.out.println(c));

        String nonStrippedString = " This is the String chapter of the Java course.        ";
        System.out.println(nonStrippedString);
        System.out.println(nonStrippedString.stripLeading());
        System.out.println(nonStrippedString.stripTrailing());
        System.out.println(nonStrippedString.strip());



    }
}
