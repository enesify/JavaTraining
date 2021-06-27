package tr.org.bura.egitim.java.chapter7.Interfaces;

public class Car implements OperateCar , RepairCar {
    @Override
    public void slow(int speed) {
        System.out.println("Car is slowing!");
    }

    @Override
    public void turn(String direction) {
        System.out.println("Car is turning to the" + direction + " direction.");
    }

}

