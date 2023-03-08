package day15_WhileLoop;

public class BreakStatement {

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {

            if (i == 6){ // if i value reaches 6
                break;  // exits the loop
            }

            System.out.println(i);

        }
        System.out.println("------------------------------------------");

        for (char i = 'A'; i <= 'Z'; i++) {

            System.out.println(i);  // 'J' will be printed

            if (i == 'J'){
                break;
            }

            //System.out.println(i); // 'J' character will not be printed

        }

        System.out.println("----------------------------------------------");
        for (;;){
            System.out.println("Hello");
            break;
        }




    }
}
