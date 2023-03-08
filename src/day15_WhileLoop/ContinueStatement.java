package day15_WhileLoop;

public class ContinueStatement {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {

            if (i == 2) { // number 2 will be skipped
                continue;
            }
            System.out.println(i);

        }

        System.out.println("-----------------------------------------------------");

        for (int i = 10; i < 21; i++) {

            if (i % 2 ==0){  // if i is even
                continue;  // skips the current iteration
            }

            System.out.println(i);

        }

        System.out.println("--------------------------------------------------");

        for (char i = 'A'; i  <= 'G'; i++ ){

            if (i == 'B'|| i == 'E'){
                continue;
            }


            System.out.println(i);
        }
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < 3; i++)
            System.out.println("Hello World!"); // inside the loop it will be printed 3 times
            System.out.println("1234"); // outside the loop body, it will be printed one time only

        System.out.println("-----------------------------------------------------------");

        // find the sum of all even number between 50 ~ 100
        for (int i = 50; i < 101 ; i++) {

            if (i % 2 == 0){   // printing even numbers only

                System.out.print(i + " ");
            }
        }

        System.out.println();

        for (int i = 50; i < 101; i += 2) { // increasing the iteration by 2

            System.out.print(i+" ");
        }

        System.out.println();

        for (int i = 50; i < 101; i++) {

            if (i % 2 != 0){  // using continue statement to skep odd numbers
                continue;

            }
            System.out.print(i + " ");

        }
        System.out.println();




    }
}
