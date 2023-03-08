package ExtraTopics.Stream_API_TerminalOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forEach_method {

    public static void main(String[] args) {

        /** forEach method is the same as peak method but the difference is that peak is for
            intermediate operation and forEach is for terminal operation
            forEach method returns operation result */

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        list.stream().filter(a -> a > 5).forEach(System.out::println);  // prints 6 7 8 9 in separate lines

        System.out.println("----------------------------------------");

        list.stream().forEach(a -> System.out.println(a)); // prints 1 2 3 4 5 6 7 8 9 in separate lines


    }
}
