package day37_exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {


        /**
         * - if the unchecked exception is known it is better to be handled by  giving the right
         * exception class
         * - if the unchecked exception is unknown it is recommended to be handled by giving the
         * RuntimeException
         */

        System.out.println("Program 1 started");
        try {
            System.out.println(9 / 0);
        } catch (ArithmeticException e) {  // specifying  the exception object if we know what exception is
            System.err.println("You can not divide by zero dummy");
        }

        System.out.println("Program 1 ended");

        System.out.println("---------------------------------------");

        System.out.println("Program 2 started");

        String  str = null;

        try {
            System.out.println(str.toUpperCase());
            System.out.println("Try block");
        }catch (RuntimeException e){  // handle any unchecked exceptions if the exception in unknown
            System.out.println("Catch block");
        }

        /**
         * the checked exception is easy to handle because it happens in the compile time
         * which means that intelJ is able to detect it
         */

        System.out.println("Program 3 started");

        try {

        Thread.sleep(3000); // three seconds
            System.out.println("Try block");

        }catch (InterruptedException e){

            System.out.println("Catch block ");
        }








    }


}
