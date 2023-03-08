package day19_array;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // array size is fixed and can not be changed
        //array is mutable

        int score1 = 85; // regular variables can store only one value
        int score2 = 75;
        int score3 = 82;
        int score4 = 65;
        int score5 = 71;
        System.out.println("-------------------------------------------");

        int[] scores = new int[5]; // the number in the square brackets is the number of the elements of an array
        // index: 0 ~ 4
        scores[2] = 82; // storing the value 82 to the index 2 of the array list
        scores[0] = 85;
        scores[1] = 75;
        scores[3] = 65;
        scores[4] = 71;
        //scores[5] = 100;  Index 5 out of bounds for length 5

        System.out.println(Arrays.toString(scores));

        System.out.println(scores[2]); // print 82 wich is represented byy index 2

        System.out.println("----------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);

        }

        System.out.println("----------------------------------------------");

        System.out.println(scores[scores.length-1]);






    }
}
