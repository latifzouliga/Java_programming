package day19_array;

public class MinNumber {

    public static void main(String[] args) {


        int[] numbers = {100, 2000, 500, -10, 30};

        int min = numbers[0]; // assume that first number is the maximum number

        for (int i = 1; i < numbers.length; i++) {  // i: 1, 2, 3, 4 ...

            if (numbers[i] < min){ // compares the element of the array with current minimum number
                min = numbers[i]; // replaces the current minimum number
            }

        }
        System.out.println(min);


    }
}
