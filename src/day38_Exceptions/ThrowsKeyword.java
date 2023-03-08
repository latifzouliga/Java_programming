package day38_Exceptions;

public class ThrowsKeyword {
                                         // catching an exception
    public static void main(String[] args) throws InterruptedException {

        /**
         * the benefit of using throws keyword because it is fast and requires less code
         * and the code is more readable and clean but it is the cheapest way to handle the exception
         * Throws keyword is not recommended to be used in a method that needs to be called
         *
         * try and catch block need to be given for each exception, which makes the code longer
         * fixes the exception permanently
         */
       /*
        System.out.println("Program1 started");

       // System.out.println(100/0);
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Program1 ended");

        System.out.println("-------------------------------------------");

        System.out.println("Program2 started");

        // System.out.println(100/0);
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Program2 ended");
        */

        System.out.println("Program1 started");

        Thread.sleep(5000);

        System.out.println("Program1 ended");

        System.out.println("--------------------------------------");

        System.out.println("Program2 started");

        Thread.sleep(5000);

        System.out.println("Program2 ended");


        System.out.println("--------------------------------------");

        System.out.println("Program3 started");

        //FileInputStream file = new FileInputStream("");
        Thread.sleep(5000);

        System.out.println("Program3 ended");




    }



}
