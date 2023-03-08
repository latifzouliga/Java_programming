package day19_array;

import java.util.Arrays;

public class ArraysLiterals {

    public static void main(String[] args) {

        int[] number = new int[5];

        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(number.length);
        System.out.println(nums.length);

        System.out.println("number= " + Arrays.toString(number));
        System.out.println("nums = " + Arrays.toString(nums));

        System.out.println("----------------------------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int n = 1;

        System.out.println(days[n - 1]);

        System.out.println("----------------------------------------------------------");

        String[] months = {"January", "February", "March", "April", "June", "July", "May", "August", "September", "October", "Noveber", "December"};

        System.out.println("months = " + Arrays.toString(months));

        System.out.println("----------------------------------------------------------");

        for (int i = months.length - 1; i >= 0; i--) {
            System.out.println(months[i]);
        }



    }

}
