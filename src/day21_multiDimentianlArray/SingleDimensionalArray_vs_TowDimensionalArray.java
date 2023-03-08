package day21_multiDimentianlArray;

import java.util.Arrays;

public class SingleDimensionalArray_vs_TowDimensionalArray {

    public static void main(String[] args) {

        int[] arr1D = new int[10];

        System.out.println(Arrays.toString(arr1D));

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {10, 20, 30, 40,};
        int[] arr3 = {10,200,300,400,500,};
        int[] arr4 = {110, 220, 330, 440,};
        int[] arr5 = {101,202,303,404,505,};


        int[][] arr2D = new int[5][]; // specifying the number of arrays that needs to be stored in multi-dimensional array
        //  assigning single dimensional arrays to multi-dimensional array
        arr2D[0] = arr1;
        arr2D[1] = arr2;
        arr2D[2] = arr3;
        arr2D[3] = arr4;
        arr2D[4] = arr5;

        System.out.println(Arrays.deepToString(arr2D));

    }


}
