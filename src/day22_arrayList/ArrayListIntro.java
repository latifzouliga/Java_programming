package day22_arrayList;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {

        //------------------------------------ ArrayList ------------------------------------------

        // Allows us to store objects
        // Presented in java.util package
        // Size is automatically adjusted (has Add and Remove function)   // Pros
        // Does not support primitives                                    // Cons


        //--------------------------------------------------------------------------------------------
        int[] array = new int[5]; // the size of array is fixed

        // assigning two elements to array
        array[0] = 10;
        array[1] = 20;
        //array[5] = 30;  // Index 5 out of bounds for length 5 // because the array size is fixed

        // the remaining of the other elements from index 2 till index 4 will be assigned by the default value

        System.out.println(Arrays.toString(array));  // [10, 20, 0, 0, 0]

        //--------------------------------------------------------------------------------------------
        System.out.println("--------------------------------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list);
        System.out.println(list.size()); // checks the size of an ArrayList






    }













}
