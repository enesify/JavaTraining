package tr.org.bura.egitim.java.chapter04;

public class SwitchStatement {
    public static void main(String[] args) {
        String name = "Zeynep";
        switch (name) {
            case "Hasan":
            case "Ali":
                System.out.println("Good name");
                break;
            case "Veli":
                System.out.println("Hi, Veli");
                break;
            case "Ayşe":
                System.out.println("Such a good name");
                break;
            default:
                System.out.println("Probably your name is good too!");
        }

    }
}
