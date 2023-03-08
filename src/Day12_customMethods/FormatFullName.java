package Day12_customMethods;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name:");

        String first = input.nextLine().trim().replaceFirst(" ","");;
        // trim() & replace() methods to remove all unnecessary spaces

        System.out.println("Enter last name:");

        String last = input.nextLine().trim().replace(" ","");

        input.close();

        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        // getting the first char of first name   + the remaining chars of the first name

        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();

        // String fullName = first + " " + last;

        String fullName = first.concat(" " + last);

        System.out.println(fullName);


    }


}
/*
1. Write a program that asks user to enter first and last names, and then prints the full name in regular format
(first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School
 */