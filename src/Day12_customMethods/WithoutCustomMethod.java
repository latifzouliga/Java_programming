package Day12_customMethods;

import java.util.Enumeration;

public class WithoutCustomMethod {

    public static void main(String[] args) {

        int number1 = 12;
        oddOrEven(number1);

        int number2 = 45;
        oddOrEven(number2);

        int number3 = 453;
        oddOrEven(number3);

        System.out.println("-------------------------------------------");
        int num1 = 3;

        if(num1 % 2 == 0){
            System.out.println(num1 + " is even number");
        }else {
            System.out.println(num1+ " is odd number");
        }

        int num2 = 23;

        if(num2 % 2 == 0){
            System.out.println(num2 + " is even number");
        }else {
            System.out.println(num2+ " is odd number");
        }


        int num3 = 24;

        if(num3 % 2 == 0){
            System.out.println(num3 + " is even number");
        }else {
            System.out.println(num3+ " is odd number");
        }

        int num4 = 243;
        if(num4 % 2 == 0){
            System.out.println(num4 + " is even number");
        }else {
            System.out.println(num4+ " is odd number");
        }

    }

    public static void oddOrEven(int number){

        if(number % 2 == 0){
            System.out.println(number + " is even number");
        }else {
            System.out.println(number+ " is odd number");
        }

    }
}
