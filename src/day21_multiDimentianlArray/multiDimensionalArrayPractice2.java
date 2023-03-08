package day21_multiDimentianlArray;

import java.util.Arrays;

public class multiDimensionalArrayPractice2 {

    public static void main(String[] args) {

        int[][] arr2D1 = {{1, 2, 3, 4}, {5, 6, 7,}};
        int[][] arr2D2 = {{8, 9, 10}, {11, 12, 13}, {14, 15, 16}};
        int[][] arr2D3 = {{17, 18}, {19, 20}};

        int[][][] arrayD3 = {{{1, 2, 3, 4}, {5, 6, 7,}}, {{8, 9, 10}, {11, 12, 13}, {14, 15, 16}}, {{17, 18}, {19, 20}}};

        int[][][] arrD3 = {arr2D1, arr2D2, arr2D3}; // three-dimensional array

        System.out.println(Arrays.deepToString(arrD3));

        System.out.println(Arrays.deepToString(arrayD3[1])); //  [[8, 9, 10], [11, 12, 13], [14, 15, 16]]

        System.out.println(Arrays.toString(arrayD3[0][1])); // [5, 6, 7]

        System.out.println(Arrays.toString(arrayD3[1][0]));  // [8, 9, 10]

        System.out.println(arrayD3[1][2][0]); // 14


        System.out.println("-----------------------------------------------------------------------");

        // nested loop to get access 2D and Arrays and also the elements of an array
        for (int i = 0; i < arrayD3.length; i++) {
            int[][] each2Array = arrayD3[i];
            System.out.println(Arrays.deepToString(each2Array));

            for (int j = 0; j < each2Array.length; j++) {
                int[] eachArray = each2Array[j];
                System.out.println(Arrays.toString(eachArray));

                for (int k = 0; k < eachArray.length; k++) {
                   int elements = eachArray[k];
                    System.out.println(elements);
                }
            }

        }


    }
}
