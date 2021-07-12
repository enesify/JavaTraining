package tr.org.bura.egitim.java.chapter07.abstractClasses;

public abstract class Car {
    public void accelerate(){
        System.out.println("Accelerating!");
    }
    public abstract void slow();
    public abstract void stop();
}
