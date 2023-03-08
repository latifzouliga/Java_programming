package ExtraTopics.Stream_API_TerminalOperation;

import java.util.*;
import java.util.stream.Collectors;

public class Collect_method {

    public static void main(String[] args) {


        /** collect method is used for terminal operation and it returns collection type
            in collect method we need to pass collector and from collector we need to call methods like:
            - toList: returns list
            - toSet: returns Set */

        List<String> words = new ArrayList<>(Arrays.asList(
                "Java", "Python", "Job", "Apple", "Wooden Spoon", "JavaScript", "Jeep", "Samsung",
                "Book", "Computer", "Camera"
        ));

        List<String> result = words.stream().filter(p -> {return (p.contains("J"));}).collect(Collectors.toList());

        System.out.println(result); // [Java, Job, JavaScript, Jeep]  // List

        // returns words that has char 'a' at index 1
        Set<String> set = words.stream().filter(p -> {return (p.charAt(1) == 'a');}).collect(Collectors.toSet());

        System.out.println(set); // [Java, JavaScript, Samsung, Camera]  // Set


    }
}
