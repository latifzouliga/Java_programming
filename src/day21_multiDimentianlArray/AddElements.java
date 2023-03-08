package day21_multiDimentianlArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,};
        int element = 6;

        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;

        System.out.println(Arrays.toString(newArray));

        System.out.println("--------------------------------------------------------");

        // test addElement() method to add an element to an array
        int[] numbers = {100,90,80,70,60};

         numbers = ArraysUtility.addElement(numbers,50);

        System.out.println(Arrays.toString(numbers));

        System.out.println("--------------------------------------------------------");

        // test addElement() method to add an element to an array
        double[] number = {10.50,9.60,8.50,7.3,60};

         number =ArraysUtility.addElement(number,2.2);

        System.out.println(Arrays.toString(number));

        System.out.println("----------------------------------------------------------");

        // test addElement() method to add an element to an array
        String[] names = {"Latif", "Omar", "Jamal"} ;

        names = ArraysUtility.addElement(names,"Ali");
        names = ArraysUtility.addElement(names,"Alam");
        names = ArraysUtility.addElement(names,"Zaid");

        System.out.println(Arrays.toString(names));






    }
}
