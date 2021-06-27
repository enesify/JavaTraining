package tr.org.bura.egitim.java.chapter07.Interfaces;

public interface OperateCar {
    String driver = "Mark";
    public default void accelerate(){
        System.out.println("This is accelerate method of interface!");
    }

    public default void displayDriver(){
        System.out.println(driver);
    }

    public void slow(int speed);
    public void turn(String direction);

    private void changeSpeed(){

    };
}
