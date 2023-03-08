package ExtraTopics.Streem_API_IntermediateOperation;

import java.util.*;
import java.util.stream.Collectors;

public class Distinct_method {

    public static void main(String[] args) {

        /** distinct method is used for removing duplicates */

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 2, 3, 2, 3, 4, 4, 5, 6, 4, 3, 2, 2, 3, 4, 4, 4, 3, 22, 23));

        //Set<Integer>  n = new HashSet<>(list);
        //System.out.println(n);

        list = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list);  // [1, 2, 3, 4, 5, 6, 22, 23]




        int[] array = {1, 1, 2, 2, 3, 2, 3, 4, 4, 5, 6, 4, 3, 2, 2, 3, 4, 4, 4, 3};

        array = Arrays.stream(array).distinct().toArray();

        System.out.println(Arrays.toString(array));  // [1, 2, 3, 4, 5, 6]


    }
}
