package tr.org.bura.egitim.java.chapter07;

import tr.org.bura.egitim.java.chapter07.Interfaces.OperateCar;

public class Sedan extends Car implements OperateCar {
    public Sedan() {
        super();
        System.out.println("Sedan");
    }
    @Override
    public void displayInfo() {
        System.out.println("This a sedan car.");
        super.displayInfo();
    }

    @Override
    public void slow(int speed) {

    }

    @Override
    public void turn(String direction) {

    }
}
