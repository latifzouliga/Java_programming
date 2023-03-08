package day29_inheritance.animalTask;

public class Dog extends Animal{ // is-relationship // dog is an animal
       //   child        parent

    @Override
    public void setInfo(String name, String breed, String size, String color, char gender, int age) {

    }

       /*
    public void method(){
        // inharited from Animal class
        System.out.println(name);
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);

        setInfo();
        eat();
        drink();
        sleep();
        toString();

    }

   */

    public void bark(){
        System.out.println(name + " is barking");
    }


}
