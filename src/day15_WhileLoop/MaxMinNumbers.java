package day15_WhileLoop;

import java.util.Scanner;

public class MaxMinNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648; // any integer number that user enter will always be greater than -2147483648
        int min = 2147483647; // // any integer number that user enter will always be less than 2147483647

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter your numbers:");
            int num = input.nextInt();

            if (num > max ){
                max = num;

            }
            if (num<min){
                min = num;
            }

        }
        System.out.println("Maximum number is: "+ max);
        System.out.println("Minimum number is: "+ min);



    }
}
