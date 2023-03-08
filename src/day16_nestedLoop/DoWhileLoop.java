package day16_nestedLoop;

public class DoWhileLoop {

    public static void main(String[] args) {
          boolean condition = false;


          for (;condition;){  //  always false
              System.out.println("This is For Loop");
          }

        System.out.println("---------------------------------------------------");

          while (condition){  // always false
              System.out.println("This is While Loop");
          }

        System.out.println("---------------------------------------------------");

          do {       // execute Do body and then checks While Loop condition
              System.out.println("This is Do While Loop");
          }while (condition); // false


    }
}
