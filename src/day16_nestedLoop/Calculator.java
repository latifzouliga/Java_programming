package day16_nestedLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.println("Enter a number:");
            double num1 = input.nextDouble();

            System.out.println("Enter math o");
            char o = input.next().charAt(0);


            while (!(o == '+' || o == '-' || o == '/' || o == '*')) {
                System.err.println("Invalid operator! Please re-enter the math operator");
                o = input.next().charAt(0);
            }

            System.out.println("Enter the second number:");
            double num2 = input.nextDouble();

            double result = (o == '+') ? num1 + num2
                    : (o == '*') ? num1 * num2
                    : (o == '/') ? num1 / num2
                    : num1 - num2;

            System.out.println(result);
            System.out.println("Would you like to continue? Yes/No");
            answer = input.next();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Answer. Would you like to continue?");
                answer = input.next();
            }
        }
        input.close();


    }
}
