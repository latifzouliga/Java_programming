package day35_polymorphism.transportation;

public class Audi extends Car implements AutoPark{

    public Audi(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void autPark() {

    }
}
