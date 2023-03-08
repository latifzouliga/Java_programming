package Day13_customMethoss;

import java.util.Scanner;

public class WarmupTasks {

    public static void main(String[] args) {

        calculate(3, 3, 'd');
        calculate(10, 20, '+');
/*
        System.out.println("Enter your two numbers and a math operator:");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble(),
                b = input.nextDouble();
        char ch = input.next().charAt(0);
*/

        ageGroup(33);

        eligibleToVote(33,false);



    }

    public static void calculate(double num1, double num2, char mathOperator) {


        switch (mathOperator) {
            case '+':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.err.println("\tInvalid math operator: " + mathOperator);
                System.err.println("Please use one of these Operators:");
                System.err.println("\t***********************\t\t\t\t\n\t    +   -    *    /    " +
                        "\n\t***********************");


        }


    }


    public static void ageGroup(int age) {

        if (age >= 0 && age <= 100) {

            System.out.println("The age group is: "+((age < 21) ? "Teenager" : (age < 55) ? "Adult" : "Senior"));

        }else {
            System.err.println("Invalid age " + age);
        }

    }


    public static void eligibleToVote(int age, boolean isAmerican){

        if (age >= 18 && isAmerican){
            System.out.println("You  are eligible to vote.");
        }else {
            System.out.println("You are NOT eligible to vote.");
        }



    }


}
/*
Warmup task:
	1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)

	    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"

	        Ex:
	            calculate(10, 20, '+')

	        output:
	            10 + 20 = 30


	2. Create a method named ageGroup that can print the age group of the person

	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )


    3. Create a method named eligibleToVote that takes two arguments:
	        1. age (int)
	        2. isAmerican (boolean)

	    Then the method should determine if the person eligible to vote
	        Ex:
	            eligibleToVote(23, true)

	        output:
	            You are eligible to vote

 */