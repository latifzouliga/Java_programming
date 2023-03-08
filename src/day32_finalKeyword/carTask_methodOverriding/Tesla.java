package day32_finalKeyword.carTask_methodOverriding;

import java.util.ArrayList;
import java.util.Arrays;

public  class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public final void autoPilot(){
        System.out.println(getMake()+ " " + getModel()+ " is in self driving mode");
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start "+ getMake()+" "+ getModel());
    }

    @Override
    public void setModel(String model) {
        String[] models =  {"Model S", "Model Y", "Model x", "Model 3" };

        // converting Array to ArrayList in order to access contain() method
        if (!Arrays.asList(models).contains(model)){
            System.err.println("Invalid Tesla model "+ model);
        }
        super.setModel(model); // this.model = model;

    }

    @Override
    public void setColor(String color) {

        ArrayList<String> colors = new ArrayList<>(Arrays.asList(
                "White", "Red", "Black", "Silver", "Blue", "Brown", "Green" ));

        if (!colors.contains(color)) {
            System.err.println("Invalid Tesla color: "+ color);
            System.exit(1);
        }
        super.setColor(color); // this.color = color;
    }

    @Override
    public void setYear(int year) {
        if (year < 2008)
            System.out.println("Invalid year of Tesla car: "+ year);
        super.setYear(year);
    }

    @Override
    public void setPrice(double price) {

        if (price < 50000){
            System.err.println("Invalid price for tesla car");
        }

        super.setPrice(price);
    }
}
