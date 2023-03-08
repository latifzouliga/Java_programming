package day18_garbageCollection;

class Car{

    public String brand;
    public String model;
    public String color;


}


public class MemoryAllocation {

    public static void main(String[] args) {

        int a = 100; // both variable a and its value 100 will be allocated in stack memory

        int b = 200;

        Car car  = new Car();
       // stack     heap


    }
    public static void method1(){

        String c = "Hello World";
        //  stack     heap (string pool)

        String d = new String("Hello World");
        // stack       heap

    }

    public static void method2(){

    }

}
