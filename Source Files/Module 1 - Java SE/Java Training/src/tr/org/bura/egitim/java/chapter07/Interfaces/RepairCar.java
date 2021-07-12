package tr.org.bura.egitim.java.chapter07.Interfaces;

public interface RepairCar {
    public default void repair() {
        System.out.println("Repairing");
    }
}
