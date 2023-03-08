package day27_accessModifiers;

public class Circle {

    public double radius, diameter;
    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius * 2;
    }

    public double CalcArea(){
        return radius * radius * pi;
    }

    public double calcPerimeter(){
        return diameter * pi;
    }

    public static void showPi(){
        System.out.println("Pi' value is: "+ pi);
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + CalcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
Create a class named Circle:

		Attributes:
			radius, diameter, pi

		Add a constructor that can set All the fields (instances)

		Actions:
			calcArea(): returns the area of Circle
			calcPerimeter(): returns the perimeter of Circle
			printPi(): displays PI value
			toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle
			is passed in the print statement
 */