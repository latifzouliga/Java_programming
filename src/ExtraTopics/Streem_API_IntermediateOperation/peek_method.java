package ExtraTopics.Streem_API_IntermediateOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class peek_method {

    public static void main(String[] args) {


        /** in the intermediate operation peek method iterate and displays the elements that
            are divisible by 4 before displaying the list
            print the element that are divisible by 4 without assigning the stream instance to a variable
            checks the element before it goes to terminal operation
            returns string stream instance */

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 2, 3, 2, 3, 4, 4, 5, 6, 4, 3, 2, 2, 3, 4, 4, 4, 3, 22, 23));

        list.stream().filter(p -> p % 3 == 0).peek(System.out::println);

        // assigning the stream instance to a variable in order to collect the elements
        list = list.stream().filter(p -> p % 4 == 0).peek(a -> System.out.println(a)).collect(Collectors.toList());

        System.out.println(list); //[3, 3, 6, 3, 3, 3]


    }
}
