package day34_abstraction.carTask;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Use voice control to start "+ getMake()+" "+ getModel());
    }

    public void autoPilot(){
        System.out.println(getMake()+ " "+ getModel()+" has autoPilot feature");
    }


    /**
     * Overriding equals method from Car super class and passing Tesla Objects as a parameter
     * after it is being downcasted form Car type to Tesla Type
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {

        Tesla obj1 = (Tesla)obj; // down casting Car obj to tesla obj
        return super.equals(obj1); // passing tesla object as an argument
    }
}
