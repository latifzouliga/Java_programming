package day29_inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        // Dog class
        // inherited from Animal class
        Dog dog = new Dog();
        dog.setInfo("Max", "Husky","Medium","Black",'M',4);

        // Cat class
        // inherited from Animal class
        Cat cat = new Cat();
        cat.setInfo("Felicia","Stray","Small","Grey",'F',2);

        // Tiger class
        // inherited from Animal class
        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal","Large","Orange",'M',6);

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("------------------------------------------------------------------------");

        // shared by all the
        // Dog class
        // inherited from Animal class
        dog.eat();
        dog.drink();
        dog.sleep();

        // Cat class
        // inherited from Animal class
        cat.eat();
        cat.drink();
        cat.sleep();

        // Tiger class
        // inherited from Animal class
        tiger.eat();
        tiger.eat();
        tiger.sleep();

        System.out.println("-----------------------------------------------------------------------");

        dog.bark();   // unique for Dog objects
        cat.meow();   // unique for Cat objects
        tiger.hunt(); // unique for Tiger objects




    }


}
