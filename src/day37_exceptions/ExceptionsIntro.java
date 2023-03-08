package day37_exceptions;

import java.io.FileInputStream;

public class ExceptionsIntro {

    public static void main(String[] args) {


        String str = "Java";
        //char ch = str.charAt(250); // unchecked exception
        //System.out.println(ch);

        // Pizza pizza = null;
        // pizza.calcCost();  // during the runtime // unchecked exceptions


        // System.out.println(50/0); // unchecked exceptions

        System.out.println("Hello World");

        int score = 100;

        if (score > 59){
            System.out.println("Your grade is D");
        } else if (score > 70) {
            System.out.println("Your grade is C");
        }

        System.out.println("------------------------------------");

       // FileInputStream file = new FileInputStream(""); // check exception

        // Thread.sleep(1000); // checked exception


    }

}
