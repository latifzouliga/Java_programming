package day35_polymorphism.transportation;

public class Tesla extends Car implements Electric,AutoPilot{

    public Tesla(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
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

    @Override
    public void autoSelDrive() {

    }

    @Override
    public void charge() {

    }
}
