package day36_polymorphism;

import day29_inheritance.animalTask.*;


public class ReferenceTypeCastings {

    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.setInfo("Max", "Husky","Medium","Black",'M',4);

        Cat cat = new Cat();
        cat.setInfo("Felicia","Stray","Small","Grey",'F',2);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal","Large","Orange",'M',6);

        Animal animal = new Dog(); // upcasting
        ((Dog)animal).bark(); // down casting

        Dog dog1 = (Dog)animal; // down casting and assigning it to a variable
        dog1.drink();  // calling drink method

        Cat cat1 = new Cat();
        Animal animal1 = cat1; // upcasting










    }


}
