package ExtraTopics.Streem_API_IntermediateOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_method {

    public static void main(String[] args) {

        /** map() method transform element in collection */

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.println(list);

        list = list.stream().map(a -> a * 10).collect(Collectors.toList());

        System.out.println(list);  // [10, 20, 30, 40, 50, 60, 70, 80, 90]


        System.out.println("-------------------------------------");

        System.out.println("The stream after applying the function is : ");

        // Creating a list of Integers
        List<Integer> numbers = Arrays.asList(3, 6, 9, 12, 15);
        System.out.println(numbers);

        numbers = numbers.stream().map(a -> {
            if (a % 2 == 0) {
                return a * 10;
            }
            return a;
        }).collect(Collectors.toList());
        System.out.println(numbers);  // [3, 60, 9, 120, 15]


    }
}
