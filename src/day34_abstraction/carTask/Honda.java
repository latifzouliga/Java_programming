package day34_abstraction.carTask;

public class Honda extends Car{

    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Twist the key to ingintion to start "+getMake()+" "+getModel());
    }

    /**
     * Overriding equals method from Car super class and passing Tesla Objects as a parameter
     * after it is being downcasted form Car type to Honda Type
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {

        //Honda obj1 = (Honda)obj; // down casting Car obj to tesla obj
        return super.equals(obj); // passing tesla object as an argument
    }
}
