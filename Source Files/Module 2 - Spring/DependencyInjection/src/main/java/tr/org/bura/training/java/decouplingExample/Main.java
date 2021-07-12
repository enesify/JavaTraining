package tr.org.bura.training.java.decouplingExample;

public class Main {
    public static void main(String[] args) {
        Engine engine = new NuclearEngine();
        Car car = new SuperCar(engine);

        car.drive();
    }
}
