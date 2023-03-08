package day15_WhileLoop;

import java.util.Scanner;

public class MinimumNumber {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 2147483647;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter your number:");
            int  num = input.nextInt();

            if (num< min){  // if the user entered entry us greater tan the current maximum number that we have
                min = num;  // then user entered number should be the maximum number
            }

        }
        System.out.println("Minimum number is: "+min);





    }
}
