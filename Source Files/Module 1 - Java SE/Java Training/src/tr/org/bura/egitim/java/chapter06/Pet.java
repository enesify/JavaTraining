package tr.org.bura.egitim.java.chapter06;

public class Pet {
    private String name;
    private String species = "test";
    static int age;

    public Pet(){
        System.out.println("Inside No-Args constructor.");
    }

    public Pet(String name, String species, int age){
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public Pet(String name){
        this.name = name;
    }

    public void displayName(){
        System.out.println("Your pet's name: " + name);
        //System.out.println(Pet.species);
    }

    public static void displaySpecies(){
        //System.out.println("Your pet's species: " + species);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
