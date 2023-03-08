package day21_multiDimentianlArray;

public class MultiDimensionlArrayPractice3 {

    public static void main(String[] args) {

        int[][][] arrayD3_1 = {{{1, 2, 3, 4}, {5, 6, 7,}} };
        int[][][] arrD3_2  = {{{8, 9, 10}, {11, 12, 13}, {14, 15, 16}}, {{17, 18}, {19, 20}}};
        int[][][] arD3_3 = {{{1, 2, 3, 4}, {5, 6, 7,}} };


        int[][][][] arrayD4 = {arrayD3_1,arrD3_2,arD3_3};
        for (int[][][] each3D : arrayD4) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int elements : each1D) {
                        System.out.println(elements);
                    }
                }
            }
        }

    }
}
