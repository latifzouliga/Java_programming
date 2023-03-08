package day34_abstraction.carTask;

// abstract class // it must be a super class // can not create object from this class
public abstract class Car {

    private final String make, model; // can never generate setters
    private String color;
    private final int year;
    private double price;

    // constructor
    // any conditions need to be set in constructor for final variables
    public Car(String model, String color, int year, double price) {
        this.make = getClass().getSimpleName(); // assign the class name to the make of the car
        this.model = model;
        setColor(color);

        // year condition
        if (year < 1886) {
            System.err.println("Invalid year: " + year);
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
    }

    // no setters for final variables: make, model and year
    // all instance variables have getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Invalid price: " + price + "\nPrice can not be zero or negative");
        }
        this.price = price;
    }

    // accessible within the package only
    protected void stop() {  // to make that non subclasses outside the package can not access it
        System.out.println("Press the brake to stop the " + make + " " + model);
    }

    // abstract methods only exist in abstract class or interface
    protected abstract void start(); // must be overridden in subclass


    /**
     * Overriding equals method to compare Car Objects
     * if object is not an instance of Class car, the program will be terminated,
     * and a waring message will be printed in the console
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj){

        if (!(obj instanceof Car)){
            System.err.println("Invalid Object: "+ obj.getClass().getSimpleName());
            System.exit(1);
        }

        if (make.equals(((Car)obj).make)){
            if (model.equals(((Car)obj).model)){
                if (year == ((Car)obj).getYear()){
                    return true;
                }
            }
        }
        return false;

    }

    @Override
    public String toString() {
        return make+"{" +
                " model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
}
