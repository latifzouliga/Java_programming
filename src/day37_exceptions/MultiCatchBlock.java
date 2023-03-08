package day37_exceptions;

import day35_polymorphism.transportation.Car;

public class MultiCatchBlock {

    public static void main(String[] args) {

        Car car = null; // I don't have a car

        try {

            car.drive(); // I can't drive the car
        }catch (ArithmeticException e){
            System.out.println("First catch Block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Second catch Block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Third catch Block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Firth catch Block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth catch Block");
            e.printStackTrace();
        }
        System.out.println("Program ended");



    }


}
