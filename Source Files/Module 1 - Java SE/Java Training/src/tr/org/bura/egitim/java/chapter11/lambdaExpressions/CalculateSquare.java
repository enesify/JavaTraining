package tr.org.bura.egitim.java.chapter11.lambdaExpressions;

@FunctionalInterface
public interface CalculateSquare<T extends Number> {
    public T getSquare(T number);
    default void test(){
        System.out.println("This is a default method in a functional interface.\n  " +
                "In functional interfaces, only one abstract method is allowed.");
    }
    //public void testMethod();
}
