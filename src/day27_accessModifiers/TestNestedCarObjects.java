package day27_accessModifiers;

public class TestNestedCarObjects {

    public static void main(String[] args) {

        Car obj1 = new Car(); // car object
        Car.CarEngine object1 = obj1.new CarEngine(); // carEngine object

        Car.StaticInnerClass objct2 = new Car.StaticInnerClass();


    }


}
