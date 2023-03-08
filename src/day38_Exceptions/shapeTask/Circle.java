package day38_Exceptions.shapeTask;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
public class Circle extends Shapes{

    private double radius;


    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

        if (radius <= 0){
            throw new InvalidShapeException("Radius of circle can not be negative of zero: "+radius);
        }

        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return pow(radius,2) * PI;
    }

    @Override
    public double calcPerimeter() {
        return radius * 2 * PI;
    }

    @Override
    public boolean equals(Object obj){

        if (!(obj instanceof Circle)){
            throw new InvalidShapeException("Invalid shape: "+ obj);
        }
        if (((Circle) obj).radius == getRadius()){
            return true;
        }else {
            return false;
        }

    }


}
