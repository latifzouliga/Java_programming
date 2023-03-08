package ExtraTopics.Streem_API_IntermediateOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Limit_method {

    public static void main(String[] args) {

        /** limit() method returns a list with the first specified element */

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));

        System.out.println(list);

        list = list.stream().limit(5).collect(Collectors.toList());

        System.out.println(list);  // [10, 20, 30, 40, 50]

        System.out.println("-------------skip() and limit()--------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 800, 900, 1000));

        System.out.println(numbers);

        numbers = numbers.stream().skip(3).limit(5).collect(Collectors.toList());

        System.out.println(numbers);

    }
}
