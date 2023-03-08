package day37_exceptions;

public class TryCatchBlock2 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};


        /**
         *  this exception is handled the catch block
         *  an object is created in the background
         *  the object will only be assigned if the catch bloch handled the exception
         */

        try {
            System.out.println(arr[1000]);
        } catch (RuntimeException e) {
            e.printStackTrace();  // displays the full info of exception after the execution of the program */
        }
        System.out.println("Program 1 ended");

        System.out.println("-----------------------------------------------------");

        System.out.println("Program 1 started");
        try {
            System.out.println(9 / 0);
        } catch (ArithmeticException e) {  // specifying  the exception object if we know what exception is
            e.printStackTrace();
        }

    }
}
