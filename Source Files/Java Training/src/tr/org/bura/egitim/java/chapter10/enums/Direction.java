package tr.org.bura.egitim.java.chapter10.enums;

//standalone enum class definition
public enum Direction {

    NORTH(0),
    NORTHEAST(45),
    EAST(90),
    SOUTHEAST(135),
    SOUTH(180),
    SOUTHWEST(225),
    WEST(270),
    NORTHWEST(315);

    private int directionAngle;

    Direction(int directionAngle) {
        this.directionAngle = directionAngle;
    }

    public int getDirectionAngle(){
        return this.directionAngle;
    }
}
