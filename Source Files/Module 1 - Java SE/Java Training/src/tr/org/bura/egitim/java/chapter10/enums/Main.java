package tr.org.bura.egitim.java.chapter10.enums;

import tr.org.bura.egitim.java.chapter10.enums.Direction;

public class Main {

 /*   public static final int START = 1;
    public static final int WAITING = 20;
    public static final int RUNNING = 3;
    public static final int STOP = 4;*/

    //class member enum definition
    /*public enum MeetingAcceptance {
        ACCEPT,
        DENY,
        TENTATIVE
    }*/

    //problems of value constant
   /* public static String getConstantString(int constantValue){
        String constantString = "";
        if (constantValue == 1){
            constantString = "START";
        }
        else if (constantValue == 2){
            constantString = "WAITING";
        }
        else if (constantValue == 3){
            constantString = "RUNNING";
        }
        else if (constantValue == 4){
            constantString = "STOP";
        }
        else{
            constantString = "NONE";
        }

        return constantString;
    }*/

    public static void main(String[] args) {

       /* MeetingAcceptance acceptance = MeetingAcceptance.ACCEPT;

        System.out.println(acceptance.name());
        System.out.println(acceptance.ordinal());*/


       // System.out.println(getConstantString(2));

       // System.out.println("-----------");


        Direction north = Direction.NORTH;
        System.out.println(north);
        System.out.println(north.compareTo(Direction.EAST));
        //enum.name method returns enum value as String
        System.out.println(north.name());
        //enum.ordinal method returns order number of the enum value
        System.out.println(north.ordinal());
        System.out.println("-----------");

        //Enum.values() method
        for (Direction direction :
                Direction.values()) {
            System.out.println(direction);
        }

        System.out.println("-----------");

        //Enum.valueOf() method returns enum value of the method's String argument
        System.out.println(Direction.valueOf("NORTHEAST"));

       // System.out.println(Direction.valueOf("NON-EXIST"));

        //enum user-defined methods and enum constructor
        Direction southWest = Direction.SOUTHWEST;
        System.out.println(southWest.getDirectionAngle());


    }
}
