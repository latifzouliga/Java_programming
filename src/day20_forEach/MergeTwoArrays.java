package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

import static utilities.ArraysUtility.*;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4,};
        int[] arr2 = {5, 6, 7};
        // to make sure that 3rd array has enough capacity to contain all the element of first array and second array
        int[] arr3 = new int[arr1.length + arr2.length];

        int k = 0; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { // i: for the first array's index numbers
            arr3[k] = arr1[i];

        }
        for (int i = 0; i < arr2.length; i++, k++) {  // i: for the second array's index numbers
            arr3[k] = arr2[i];

        }
        System.out.println(Arrays.toString(arr3));

        System.out.println("--------------------------------------------------------");

        int[] a1 = {1, 2, 3, 4, 5, 6, 7,};
        int[] a2 = {20, 30, 40, 50, 60};
        int[] a3 = merge(a1, a2);
        System.out.println(Arrays.toString(a3));

        System.out.println("--------------------------------------------------------");
        double[] b1 = {1.0, 2.4, 3, 4, 5, 6, 7,};
        double[] b2 = {20.5, 30.6, 40.7, 50, 60};
        double b3[] = ArraysUtility.merge(b1, b2);
        System.out.println(Arrays.toString(b3));

        System.out.println("-------------------------------------------------------");
        char ch1[] = {'A', 'B', 'C', 'D', 'E', 'F'};
        char ch2[] = {'G', 'H', 'K', 'L', 'M', 'N'};
        char[] ch3 = ArraysUtility.merge(ch1, ch2);
        System.out.println(Arrays.toString(ch3));

        System.out.println("-------------------------------------------------------------");
        String[] s1 = {"Java", "Python", "JavaScript", "Ruby"};
        String[] s2 = {"C#", "C++", "C", "Swift"};
        String[] s3 = ArraysUtility.merge(s1, s2);
        System.out.println(Arrays.toString(s3));

        //System.out.println(frequency(s1,"Ruby"));


    }
}
/*
2. write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}

	        output
	            arr3 = {1,2,3,4,5,6}
 */