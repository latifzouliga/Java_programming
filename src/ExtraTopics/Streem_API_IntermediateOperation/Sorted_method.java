package ExtraTopics.Streem_API_IntermediateOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorted_method {

    public static void main(String[] args) {

        /** sorted method is an intermediate operation which sorts elements and return stream instance */

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100, 20, 60, 44, 2, 7, 3, 1, 8, 30));

        list.stream().sorted().forEach(System.out::println); // prints elements in sorted order

        System.out.println("----------------------------");


         int[] numbers = {30, 2, 23, 10, 3, 1, 70, 45, 100, 7, 9, 61};

        numbers = Arrays.stream(numbers).sorted().toArray();

        System.out.println(Arrays.toString(numbers));  // [1, 2, 3, 7, 9, 10, 23, 30, 45, 61, 70, 100]


    }
}
