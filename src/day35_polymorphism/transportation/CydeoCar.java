package day35_polymorphism.transportation;

import day34_abstraction.animalTask_interface.Flyable;
import day34_abstraction.animalTask_interface.Swimmable;


public class CydeoCar extends Car implements Flyable,AutoPark,Electric, Swimmable {

    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void autPark() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
}
