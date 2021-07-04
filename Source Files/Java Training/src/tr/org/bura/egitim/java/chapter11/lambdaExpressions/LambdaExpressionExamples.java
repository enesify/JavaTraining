package tr.org.bura.egitim.java.chapter11.lambdaExpressions;

public class LambdaExpressionExamples {
    public static void main(String[] args) {

        CalculateSquare<Integer> calculateSquareOfIntegers = number -> number * number;

        CalculateSquare<Float> calculateCubeOfFloats = number -> number * number * number;
        Integer a =  calculateSquareOfIntegers.getSquare(100);
        Float b =  calculateCubeOfFloats.getSquare(10.2f);
        System.out.println(a);
        System.out.println(b);

        Integer a2 = testType(number -> number * number, 3);
        System.out.println("using lambda expression through a method " + a2);
        Double doubleValue = testType(number -> number*number*number,5.6);
        System.out.println("using lambda expression through a method " + doubleValue);

        calculateCubeOfFloats.test();
        calculateSquareOfIntegers.test();

       /* PrimitiveInterface primitiveInterface1 = number -> number * number * number;
        System.out.println(primitiveInterface1.calcCube(4));

        PrimitiveInterface primitiveInterface2 = number -> number * number;
        System.out.println(primitiveInterface2.calcCube(5));

        PrimitiveInterface primitiveInterface3 = number -> (number * number)/2;
        System.out.println(primitiveInterface3.calcCube(16));*/
    }


    public static <T extends Number> T testType(CalculateSquare<T> calculateSquare, T value){
        return calculateSquare.getSquare(value);
    }
}
