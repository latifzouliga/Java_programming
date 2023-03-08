package day38_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {

    // responsible for handling exceptions that being handled with throws keyword in methods
    // that being called by main method
    public static void main(String[] args) throws InterruptedException{

        method1(); //

    }

    /**
     * throws keyword informs compiler about an exception and the compiler deals with it, but
     * it doesn't fix it
     * throws keyword said: hello compiler. You got an issue on your way.
     * compiler replies: got it I will deal with it.
     * compiler added: is there another issue that i need to be aware of?
     * throws keyword replied: I don't know. I'm able to handle only one exception but cant fix it.
     * compiler asked: so what's the plan?
     * throws keyword replied: call try and catch block
     * @throws InterruptedException
     */

    // it is not ideal to use throws keyword in custom methods
    // caller of the method will be responsible for handling the exception
    public static void pauseForFiveSeconds() throws InterruptedException{

        Thread.sleep(5000);  // checked exception

    }

    public static void method1() throws InterruptedException{
        System.out.println("Hello world");

        Thread.sleep(5000);             // exception is handled but not fixed

        System.out.println("Hello Cydeo");
    }


    // if this method is not gonna be called somewhere else
    // otherwise the caller will be responsible for handling exceptions
    public static void method2() throws InterruptedException, FileNotFoundException {
        System.out.println("First program started");

        Thread.sleep(3000);             // exception is handled but not fixed

        new FileInputStream(" ");      // exception is handled but not fixed

        Thread.sleep(5000);             // exception is handled but not fixed

    }

}
