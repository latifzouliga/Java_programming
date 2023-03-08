package day20_forEach;

import java.util.Arrays;

public class ForEachPractice {

    public static void main(String[] args) {


        // finding odd or even numbers of an array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        for (int each : numbers) {

            if (each % 2 == 0) {
                continue;
            }

            System.out.println(each);
        }

        System.out.println("--------------------------------------------------------------");

        // finding max and min number with for each loop
        // in for each loop there is direct access to the array elements
        int[] nums = {100, 20, 30, 40, 5, 3, 2, 1, 1000, 300, 500};

        int max = nums[0];
        int min = nums[0];

        for (int each : nums) {
            if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("--------------------------------------------------------------");

        // finding max and min of an array
        // finding max and min numbers with for loop
        //in for loop we need to access the element by its index number
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("--------------------------------------------------------------");

        // merge to elements of an array
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {6, 7, 8, 9, 10};
        int[] a3 = new int[a1.length + a2.length];

        int k = 0;

        for (int each : a1) {
            a3[k++] = each;
        }

        for (int each : a2) {
            a3[k++] = each;
        }

        System.out.println(Arrays.toString(a3));

        System.out.println("--------------------------------------------------------------");

        // initials of an element of an array
        String[] names = {"Abdellatif Zouliga", "Lamya Zouliga", "Zaid Zouliga", "Ahlam Hajjaji", "Yousef Zouliga", "Khalid Zouiga"};

        for (String each : names) {
            System.out.println(each.charAt(0) + "." + each.charAt(each.lastIndexOf(" ") + 1) + ".");
        }


    }


}
