package tr.org.bura.egitim.java.chapter7.abstractClasses;

public class Hatchback extends Car{
    @Override
    public void slow() {
        System.out.println("Hatchback car is slowing!");
    }

    @Override
    public void stop() {
        System.out.println("Hatchback car is stopping!");
    }
}
