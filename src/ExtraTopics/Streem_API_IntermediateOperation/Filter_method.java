package ExtraTopics.Streem_API_IntermediateOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_method {

    public static void main(String[] args) {

        /** filter method allows us to filter the list based on condition and map allows us to transform elements */

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        list = list.stream().filter(a -> (a % 2 == 0)).map(a -> a * 10).collect(Collectors.toList());

        System.out.println(list);  // [20, 40, 60, 80]

        System.out.println("-----------------------------------------------");

        List<String> words = new ArrayList<>(Arrays.asList(
                "Java", "Python", "Job", "Apple", "Wooden Spoon", "JavaScript", "Jeep", "Samsung",
                "Book", "Computer", "Camera"
        ));

        List<String> result = words.stream().filter(p -> {return (p.contains("J"));}).collect(Collectors.toList());

        System.out.println(result); // [Java, Job, JavaScript, Jeep]


    }
}
