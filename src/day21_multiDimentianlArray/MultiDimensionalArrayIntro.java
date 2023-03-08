package day21_multiDimentianlArray;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {10, 20, 30, 40,};
        int[] arr3 = {100,200,300,400,500,};

        System.out.println("----------------------------------------------------------");

        int[][] arr2D = { {1,2,3,4,5,6},{10, 20, 30, 40,},{100,200,300,400,500,} };

        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.toString(arr2D[2]));
        System.out.println(Arrays.toString(arr2D[0]));

        System.out.println(arr2D[2][1]); // 200
        System.out.println(arr2D[1][2]);  // 30

    }
}
