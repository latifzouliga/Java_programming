package day38_Exceptions.shapeTask;

public class TestShapeObjects {

    public static void main(String[] args) {

        Circle circle = new Circle(3);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(5,0);

        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);

    }
}
