package day19_array;

public class MaxNumber {

    public static void main(String[] args) {

        int[] numbers = {100, 2000, 500, -10, 30};

        int max = numbers[0]; // assume that first number is the maximum number

        for (int i = 1; i < numbers.length; i++) {  // i: 1, 2, 3, 4 ...

            if (numbers[i] > max){ // compares the element of the array with current maximum number
                max = numbers[i]; // replaces the current maximum number
            }

        }
        System.out.println(max);



    }


}
