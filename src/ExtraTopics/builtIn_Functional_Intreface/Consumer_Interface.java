package ExtraTopics.builtIn_Functional_Intreface;

import java.util.concurrent.Callable;
import java.util.function.Consumer;

public class Consumer_Interface {

    public static void main(String[] args) {


        // take one object and does not return any value
        // the consumer interface has one method accept() that takes one argument

        Consumer<int[]> printEach = arr -> {
            for (int each : arr) {
                System.out.println(each);
            }
        };
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printEach.accept(array);

        Consumer<Integer> print = a -> {
          if (a % 2 == 0){
              System.out.println("Even");
          }else {
              System.out.println("Odd");
          }
        };

        print.accept(10);

    }
}
