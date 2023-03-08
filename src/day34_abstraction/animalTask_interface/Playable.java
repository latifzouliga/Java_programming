package day34_abstraction.animalTask_interface;

public interface Playable {

    // static and final variables
    boolean isFriendly = true; // public static final are given automatically

    /*
    private static void main(String[] args) {

        System.out.println(isFriendly);

        //isFriendly = false  // compiler error because isFriendly is final and can not be re-assigned
    }

    default  void  method1(){

    }

     */


    // abstract method
    void play(); // public abstract are optional



}
