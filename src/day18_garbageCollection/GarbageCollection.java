package day18_garbageCollection;

import day17_customClass.Dog;

public class GarbageCollection {

    public static void main(String[] args) {


        String s1 = "Java";

        s1 = null; // after this line, it is eligible for garbage collection

        System.out.println(s1);  // prints null, because s1 is not referencing to any object

        //System.out.println(s1.toUpperCase()); // NullPointerException  // s1 object is deleted from the heap

        System.out.println("-----------------------------------------------------");

        String str1 = "Python";  // eligible for garbage collection

        str1 = "Cydeo";

        System.out.println(str1); // prints Cydeo

        System.out.println("------------------------------------------------------");

        Dog dog3 = new Dog();

        dog3.setInfo("Loki","Chow Chow",'F','F',"Small","Orange");
        // Eligible for garbage collection because the reference name is referencing to another object

        Dog dog4 = new Dog();

        dog4.setInfo("Chuck","BullDog",'M','M',"Large","Black");

        dog3 = dog4;

        System.out.println(dog3);
        System.out.println(dog4);






        


    }
}
