package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        // reverse an array
        int[] array = {1, 2, 3, 4, 5};
        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        System.out.println(Arrays.toString(reverse));

        System.out.println("----------------------------------------");

        // reverse int[]
        int[] nums = {12,34,54,64,65,56,65,76,87,78};
        int[] num2 = ArraysUtility.reverse(nums);
        System.out.println(Arrays.toString(num2));

        // reverse double[]
        double[] a1 = {1.2,3.4,5.5,6.7,11.1,4.6};
        double[] a2 = ArraysUtility.reverse(a1);
        System.out.println(Arrays.toString(a2));

        // reverse char[]
        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F'};
        char[] ch2 = ArraysUtility.reverse(ch1);
        System.out.println(Arrays.toString(ch2));

    }
}
/*
3. Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};

	        output:
	            reversedArray = {5,4,3,2,1};

 */