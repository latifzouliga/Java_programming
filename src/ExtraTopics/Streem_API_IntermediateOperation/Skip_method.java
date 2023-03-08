package ExtraTopics.Streem_API_IntermediateOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Skip_method {

    public static void main(String[] args) {

        /** skip() method skips the first specified elements */

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90));

        System.out.println(list);

        list = list.stream().skip(5).collect(Collectors.toList());

        System.out.println(list);
    }
}
