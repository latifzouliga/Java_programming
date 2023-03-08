package day21_multiDimentianlArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3, 4, 5, 6}, {10, 20, 30, 40,}, {100, 200, 300, 400, 500,}};

        for (int i = 0; i < arr2D.length; i++) {  // Index number of MultiDimensional array

            int[] each = arr2D[i];    // assign each array to each variable
            System.out.println(Arrays.toString(each));

            for (int j = 0; j < each.length; j++) {  // Index of number of elements of arrays

                int elements = each[j];
                System.out.println(elements);
            }

        }

        System.out.println("-----------------------------------------------");

        for (int[] each : arr2D) {
            System.out.println(Arrays.toString(each));
            for (int elements : each) {
                System.out.println(elements);

            }
        }

        System.out.println("-----------------------------------------------");

        // ShortCut for iterating dimensional array
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {

                System.out.println(arr2D[i][j]);

            }
        }


    }
}
