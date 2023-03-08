package day15_WhileLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648; // the smallest int number should be assigned,

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num = input.nextInt();
            
            if (num > max){  // if the user entered entry us greater tan the current maximum number that we have
                max = num; // then user entered number should be the maximum number
            }

        }
        System.out.println("Maximum number is: " + max);


    }
}
