package day31_inheritance.animal_methodOverRidding;

public class Eagle extends Animal{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat(){
        System.out.println("Eagle "+ getName()+ " is eating snakes");
    }


}
