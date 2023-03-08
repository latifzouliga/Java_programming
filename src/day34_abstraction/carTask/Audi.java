package day34_abstraction.carTask;

public class Audi extends Car{

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Press the start button to start "+getMake()+ " "+ getModel());
    }
    public void autoPark(){
        System.out.println(getMake()+ " "+getModel()+" has autoPark feature");
    }

    /**
     * Overriding equals method from Car super class and passing Tesla Objects as a parameter
     * after it is being downcasted form Car type to Audi Type
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {

        Audi obj1 = (Audi)obj; // down casting Car obj to tesla obj
        return super.equals(obj1); // passing tesla object as an argument
    }

}
