package tr.org.bura.egitim.java.chapter07.abstractClasses;

public class Sedan extends Car{
    @Override
    public void slow() {
        System.out.println("Sedan car is slowing!");
    }

    @Override
    public void stop() {
        System.out.println("Sedan car is stopping!");
    }

    @Override
    public void accelerate() {
        System.out.println("Sedan car is accelerating!");
    }
}
