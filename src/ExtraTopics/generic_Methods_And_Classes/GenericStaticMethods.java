package ExtraTopics.generic_Methods_And_Classes;

import java.util.List;

public class GenericStaticMethods {


    /*
    public static void printEach(Integer[] array){
        for (Integer each : array) {
            System.out.println(each);
        }
        
    }

    public static void printEach(Character[] array){
        for (Character each : array) {
            System.out.println(each);
        }

    }

    public static void printEach(Double[] array){
        for (Double each : array) {
            System.out.println(each);
        }

    }

    public static void printEach(String[] array){
        for (String each : array) {
            System.out.println(each);
        }

    }

     */  // Overloaded methods

    // it is recommended to use one upperCase letter for generics

    public static <Thing> void printEach(Thing[] things){

        for (Thing thing : things) {
            System.out.println(thing);
        }

    }

    // generic method for any given list
    public static <Thing> void printEach(List<Thing> things){

        for (Thing each : things) {
            System.out.println(each);
        }
    }

    //TODO Create a generic class
    
}
