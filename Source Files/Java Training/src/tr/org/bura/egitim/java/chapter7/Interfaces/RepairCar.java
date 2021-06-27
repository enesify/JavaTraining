package tr.org.bura.egitim.java.chapter7.Interfaces;

public interface RepairCar {
    public default void repair() {
        System.out.println("Repairing");
    }
}
