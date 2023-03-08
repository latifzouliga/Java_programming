package day31_inheritance.shapeMethodOverridding;

public final class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * 3.14;
    }

    @Override
    public double perimeter() {
        return radius * 6.28;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("**************");
        System.out.println("  ************");
        System.out.println("************");
        System.out.println("**********");
    }


}
