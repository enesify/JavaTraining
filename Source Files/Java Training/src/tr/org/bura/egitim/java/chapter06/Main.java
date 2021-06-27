package tr.org.bura.egitim.java.chapter06;

import javax.xml.catalog.Catalog;

public class Main {
    public Main(){

    }
    public static void main(String[] args) {

        //------------class example -1 --------------------------------
       /* Car bmw = new Car();
        System.out.println("Your speed is: " + bmw.getSpeed());
        //boolean isCarSuv = bmw.isSUV();
        if (bmw.isSUV()){
            System.out.println("Your car is a SUV");
        }
        else{
            System.out.println("Your car is not SUV");
        }

        int height;
        //System.out.println(height);

        bmw.displayName();
        bmw.name = "320";
        bmw.displayName();
        int carAge = bmw.getCarAge(2015, 2021);
        System.out.println("your car's age is: " + carAge);


        System.out.println(bmw.weight);*/

        //------------class example - 2 --------------------------------
       /* Pet snowy = new Pet();
        Pet pamuk = new Pet("Pamuk", "Cat", 4);

        System.out.println("My cat's name is: " + pamuk.name + " and its a " + pamuk.species + ", and it is " + pamuk.age + " year old.");
        System.out.println(pamuk);
        System.out.println(snowy);

        Pet mavis = new Pet("Maviş");
        System.out.println("My bird's name is: " + mavis.name + " and its a " + mavis.species + ", and it is " + mavis.age + " year old.");
        //

        //pamuk.species = "Dog";*/

        //Pet.displaySpecies();
        //Pet cat = new Pet();
        //cat.displayName();

        //------------nested class example --------------------------------
        OuterClass outer = new OuterClass();
        System.out.println(outer.calculateTotal());
        //OuterClass.InnerClass inner = new OuterClass.InnerClass();

        //System.out.println(outer.outerNumber + inner.innerNumber);*/

        Pet pamuk = new Pet("Pamuk", "Cat", 4);

        pamuk.getName();
        pamuk.setName("Garfield");



    }
}
