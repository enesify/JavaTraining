package tr.org.bura.egitim.java.chapter07.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car fiat = new Car();
        fiat.slow(120);
        fiat.displayDriver();
        fiat.turn("left");

        OperateCar operateCar = new Car();
        operateCar.accelerate();
        operateCar.slow(140);
        operateCar.displayDriver();
    }
}
