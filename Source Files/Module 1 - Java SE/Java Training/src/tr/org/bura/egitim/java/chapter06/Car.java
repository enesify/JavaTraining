package tr.org.bura.egitim.java.chapter06;

public class Car {
    // attriutes-states-fields
    protected int weight;
    String name;


    //method - behaviour
    public int getSpeed(){
        return 120;
    }

    public boolean isSUV(){
        return false;
    }

    public void displayName(){
        System.out.println(name);
    }

    public int getCarAge(int manufacturingYear, int currentYear){
        int age = currentYear - manufacturingYear;
        return age;
    }

}
