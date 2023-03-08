package day27_accessModifiers;

public class Car {
    public String make, model, color;
    public  int year;
    public double price;

    public static int wheels = 4;

    public class CarEngine{ // this is an inner class

        public void method(){
            System.out.println(make);
            System.out.println(wheels);
        }

    }// only be created through an object of the car class

    public static class StaticInnerClass{ // accepts only static variable

        public void method(){

            System.out.println();
        }


    }

}
