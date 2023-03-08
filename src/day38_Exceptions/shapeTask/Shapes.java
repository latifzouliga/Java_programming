package day38_Exceptions.shapeTask;

import java.text.DecimalFormat;

public abstract class Shapes {

    private String name;

    public Shapes() {
        this.name = getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calcArea();

    public abstract double calcPerimeter();


    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0");

        return name+"-->|" +
                "Area: " + df.format(calcArea()) +
                ", Perimeter: " + df.format(calcPerimeter()) +
                '|';
    }
}
