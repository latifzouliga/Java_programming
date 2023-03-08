package day09_scanner;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //  for reading user inputs

        System.out.println("Enter your first number: ");

        byte num1 = input.nextByte();

        System.out.println("Enter your second number: ");

        short num2 = input.nextShort();

        System.out.println("Enter your third number: ");

        int num3 = input.nextInt();

        System.out.println("Enter your forth number: ");

        long num4 = input.nextLong();

        input.close(); // scanner is closed, can not read the user inputs again
/*
        System.out.println("Enter your fifth number:");

        int num5 = input.nextInt();

        Scanner is closed at line 27, once it;s closed can not read inputs

 */

        System.out.println("You entered: " + num1);
        System.out.println("You entered: " + num2);
        System.out.println("you entered: "+ num3);
        System.out.println("You entered: " + num4);
        //System.out.println("You entered: " + num3);


    }

}
