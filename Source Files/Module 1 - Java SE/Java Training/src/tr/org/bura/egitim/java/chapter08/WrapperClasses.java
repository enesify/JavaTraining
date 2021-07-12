package tr.org.bura.egitim.java.chapter08;

public class WrapperClasses {
    public static void main(String[] args) {
        int primitiveIntNumber = 5;
        double primitiveDoubleNumber = 2.3;

        // wrapping with using valueOf() method
        Integer wrappedIntNumber1 = Integer.valueOf(primitiveIntNumber);
        Double wrappedDoubleNumber1 = Double.valueOf(primitiveDoubleNumber);
        System.out.println(wrappedIntNumber1);
        System.out.println(wrappedDoubleNumber1);

        //wrapping with directly assigning (this is called Autoboxing)
        Integer wrappedIntNumber2 = primitiveIntNumber;
        Double wrappedDoubleNumber2 = primitiveDoubleNumber;
        System.out.println(wrappedIntNumber1);
        System.out.println(wrappedDoubleNumber1);

        //converting wrapper objects to primitive types with ___Value() methods
        int primitiveIntNumber2 = wrappedIntNumber1;
        double primitiveDoubleNumber2 = wrappedDoubleNumber1.doubleValue();
        System.out.println(primitiveIntNumber2);
        System.out.println(primitiveDoubleNumber2);

        Boolean wrapperBooleanValue = Boolean.TRUE;
        boolean primitiveBooleanValue = wrapperBooleanValue.booleanValue();
        System.out.println(wrapperBooleanValue);
        System.out.println(primitiveBooleanValue);

        //converting wrapper objects to primitive types with directly assigning (this is called unboxing)
        boolean primitiveBooleanValue2 = wrapperBooleanValue;
        primitiveIntNumber2 = wrappedIntNumber2;
        primitiveDoubleNumber2 = wrappedDoubleNumber2;
        System.out.println(primitiveIntNumber2);
        System.out.println(primitiveDoubleNumber2);





    }
}
