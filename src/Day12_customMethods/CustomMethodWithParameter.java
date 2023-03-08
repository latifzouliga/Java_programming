package Day12_customMethods;

import java.util.Scanner;

public class CustomMethodWithParameter {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        oddOrEven(number);

    }

    // the method takes an argument number, and verifies if the number is odd or even
    public static void oddOrEven(int number){

        if(number % 2 == 0){
            System.out.println(number + " is even number");
        }else {
            System.out.println(number+ " is odd number");
        }

    }





}
