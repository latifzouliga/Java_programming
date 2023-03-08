package day38_Exceptions.shapeTask;

public class Rectangle extends Shapes{

    private double width, length;

    public Rectangle(double length, double width ) {
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0){
            throw new InvalidShapeException("Rectangle width can not be zero or negative: "+width);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0){
            throw new InvalidShapeException("Rectangle length can not be zero or negative: "+ length);
        }
        this.length = length;
    }

    @Override
    public double calcArea() {
        return length * width;
    }

    @Override
    public double calcPerimeter() {
        return (length * 2)+ (width * 2);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            throw new InvalidShapeException("Invalid shape: " + obj);
        }
        Rectangle rectangle = (Rectangle) obj;

        if (rectangle.length == length) {
            if (rectangle.width == width) {
                return true;
            }

        }
        return false;
    }
}
