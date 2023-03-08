package day31_inheritance.animal_methodOverRidding;

public class Dog extends Animal{

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    // overridden method
    public void eat() {
        System.out.println("Dog "+ getName()+" "+ " is eating dog food");
    }



    // not overridden method
    public void bark() {
        System.out.println("Dog "+getName()+ " is barking");
    }
}
