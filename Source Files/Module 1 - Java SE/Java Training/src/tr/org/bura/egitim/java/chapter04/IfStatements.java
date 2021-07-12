package tr.org.bura.egitim.java.chapter04;

public class IfStatements {
    public static void main(String[] args) {

        //------------------if and if-else examples -----------------------
        boolean isCarMovingFast = false;
        int speed = 130;

        if (isCarMovingFast){
            speed -= 40;//equivalent to speed = speed -40
            System.out.println(speed);
        }

        if (isCarMovingFast){
            System.out.println("Please drive slowly!");
        }

        else {
            System.out.println("Thank you! Keep driving");
        }

        System.out.println("Your speed is: " + speed + " Please pay attention!");
        System.out.println("Go your way!");



        int age = 34;

        if(age <= 12){
            System.out.println("You're a child!");
        }
        else if (age >=13 && age <= 19){
            System.out.println("You're a teenager!");
        }
        else{
            System.out.println("You're an adult.");
        }

        System.out.println("bye!");



    }
}
