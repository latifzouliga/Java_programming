package day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // EnterEnter

        System.out.println("Enter Your full name:");
        String full_name = input.nextLine();

        System.out.println("Enter your school name:");
        String school_name = input.nextLine();

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter your gender:");
        String gender = input.next();

        input.nextLine(); // clear out the scanner memory
        // we have to give an extra nextLine() method if we are using a nextLine() methods after the other methods of scanner

        System.out.println("Enter your street name:");
        String street_name = input.nextLine();

        input.close();


    }
}
