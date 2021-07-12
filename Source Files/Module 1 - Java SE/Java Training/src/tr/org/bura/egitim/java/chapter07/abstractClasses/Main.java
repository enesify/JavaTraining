package tr.org.bura.egitim.java.chapter07.abstractClasses;

public class Main {
    public static void main(String[] args) {
        Hatchback mercedes = new Hatchback();
        Sedan volvo = new Sedan();

        mercedes.slow();
        volvo.slow();

        mercedes.stop();
        volvo.stop();

        mercedes.accelerate();
        volvo.accelerate();
    }
}
