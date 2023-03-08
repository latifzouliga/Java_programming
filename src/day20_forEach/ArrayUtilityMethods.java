package day20_forEach;

import day02_escapeSequences.AboutMe;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {

        //-------------------------------------- equals() -----------------------------------------------

        int[] score = {70, 100, 90, 30, 65, 55, 70};

        System.out.println(Arrays.toString(score));

        String result = Arrays.toString(score); // toString method returns a string

        System.out.println(result);

        System.out.println("-----------------------------------------------------------");

        int[] a1 = {1, 2, 3, 4, 5, 6};
        int[] a2 = {1, 2, 3, 4, 5, 6};
        boolean r1 = Arrays.equals(a1, a2); // returns true. same element in the same order

        System.out.println(r1);

        char[] ch1 = {'A', 'C', 'B', 'D'};
        char[] ch2 = {'B', 'A', 'C', 'D'};
        boolean r2 = Arrays.equals(ch1, ch2);

        System.out.println(r2);// returns false. same element but different order

        System.out.println("-----------------------------------------------------------");

        //-------------------------------------- sort() -----------------------------------------------

        int[] nums = {91, 2, 14, 5, 31, 6, 8, 5, 7, 9, 8, 100, 22, 55, 88, 44, 23, 12, 29};

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);  // sort array element by ascending order

        System.out.println(Arrays.toString(nums));

        System.out.println("Minimum number is: " + nums[0]);

        System.out.println("Maximum number is: " + nums[nums.length - 1]);

        System.out.println("-----------------------------------------------------------");

        String[] b1 = {"A", "D", "C", "B"};  // b1 and b2 have the same element but different order

        String[] b2 = {"B", "A", "C", "D"};

        Arrays.sort(b1);

        Arrays.sort(b2);

        System.out.println(Arrays.equals(b1, b2)); // returns true after sorting both arrays

        System.out.println("-----------------------------------------------------------");

        String[] students = {"Abdellatif", "Lamya", "Zaid", "Ahlam", "Yoused", "Khalid"};

        System.out.println(Arrays.toString(students));

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        System.out.println("-----------------------------------------------------------");

        //-------------------------------------- copyOf() ----------------------------------------------

        int[] array = {10, 20, 30, 40, 50, 60, 70};

        int[] array2 = Arrays.copyOf(array, 10);

        System.out.println(Arrays.toString(array2));

        System.out.println("-----------------------------------------------------------");

        int[] n1 = {1, 2, 3, 4, 5};
        int[] n2 = {6, 7, 8, 9, 10, 11};
        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length);

        for (int i = 0, j = n1.length; i < n2.length; i++, j++) {
        // j starts from 4  
            n3[j] = n2[i];

        }

        System.out.println(Arrays.toString(n3));

        System.out.println("-----------------------------------------------------------");

        //-------------------------------------- copyOfRange() ----------------------------------------------

        char[] ch = {'A','B','C','D','E','f','G'};

        char[] result1 = Arrays.copyOf(ch,4); // copy the element starting from index 0 until the specified number

        System.out.println(Arrays.toString(result1));

        char[] result2 = Arrays.copyOfRange(ch,2,5);  // specify the beginning and the end

        System.out.println(Arrays.toString(result2));

        char[] result3 = Arrays.copyOfRange(ch, 3, ch.length);

        System.out.println(Arrays.toString(result3));







        



    }


}
