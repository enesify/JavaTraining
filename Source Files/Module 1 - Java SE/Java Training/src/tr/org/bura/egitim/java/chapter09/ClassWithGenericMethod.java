package tr.org.bura.egitim.java.chapter09;

public class ClassWithGenericMethod {
    public <T> void displaySomething(T genericTypeObject){
        System.out.println("This is a generic method, and has type: "
                + genericTypeObject.getClass()
                + " with value: "
                + genericTypeObject);
    }
}
