package Day14_forLoop;

public class ForLoopPractice {

    public static void main(String[] args) {


        for (int i = 10; i >= 5; i--) {

            System.out.println("Hello Cydeo"+i);

        }

        System.out.println("------------------------------------");

        // sum of all the numbers from 1

        int sum = 0;

        for (int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println("the sum is "+sum);

        // pritn all the alphabet letters A ~ Z

        for (char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");

        }
        System.out.println(); // to start new line

        // print all the alphabet letters Z ~ A

        for (char i = 'Z'; i >= 'A'; i--){

            System.out.print(i + " ");
        }
        System.out.println();  // to append new line




    }


}
