package tr.org.bura.egitim.java.chapter09;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*GenericClass<Integer> intGeneric = new GenericClass<>(5);
        GenericClass<String> stringGeneric = new GenericClass<>("Java is awesome!");
        System.out.println(intGeneric.getGenericObject());
        System.out.println(stringGeneric.getGenericObject());*/

        ClassWithGenericMethod classWithGenericMethod = new ClassWithGenericMethod();
        classWithGenericMethod.<Integer>displaySomething(3);
        classWithGenericMethod.<String>displaySomething("We love Java!");
    }
}
