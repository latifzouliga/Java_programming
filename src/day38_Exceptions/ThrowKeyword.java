package day38_Exceptions;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("Enter your age");

        int age = new Scanner(System.in).nextInt();

        if (age < 0 || age > 150){
            // System.err.println("Invalid age");
            // System.exit(1);
            if (age <0){
                // terminate the program
                throw new InputMismatchException("Age can not be negative: "+ age);
            }else {
                throw new InputMismatchException(" Age of the person can not be greater than 150: "+ age);
            }
        }

        if (age >= 21){
            System.out.println("Eligible");
        }else {
            System.out.println("Not eligible");
        }

        System.out.println("-------------------------------------------------------------");

        // throw new RuntimeException("Runtime exception");
        // System.out.println("Hello world"); // unreachable

        try {
            throw new FileNotFoundException(""); // can trow checked exceptions
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("---------------------------");

        RuntimeException exception = new RuntimeException(); // creating exception object in order to reuse it

        // throw exception;
        // throw new RuntimeException();

        // throw new Person("Jimmy",34,'M'); // no is relationship




    }

}
