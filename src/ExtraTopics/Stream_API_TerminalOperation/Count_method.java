package ExtraTopics.Stream_API_TerminalOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Count_method {

    public static void main(String[] args) {


        /** count method returns the total element within stream instance */

        int[] array = {1, 1, 2, 2, 3, 2, 3, 4, 4, 5, 6, 4, 3, 2, 2, 3, 4, 4, 4, 3};

        long count = Arrays.stream(array).count();

        System.out.println(count);  // 20

        System.out.println("-----------------------------------------------");

        int[][] arr2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};

        long n = Stream.of(arr2).count(); // 3

        System.out.println(n);

        System.out.println("-----------------------------------------------");

        long nn = Stream.of("Hello", "java", "a", "w", "q", "1", "3", "5").count();

        System.out.println(nn); // 8

        System.out.println("---------------count words that contains letter 'J' -------------------------");


        List<String> words = new ArrayList<>(Arrays.asList(
                "Java", "Python", "Job", "Apple", "Wooden Spoon", "JavaScript", "Jeep", "Samsung",
                "Book", "Computer", "Camera"
        ));

        long cn = words.stream().count();

        System.out.println(cn); //  11

        long j = words.stream().filter(p -> p.contains("J")).count();

        System.out.println(j);

        System.out.println("---- count using loop");
        int counter = 0;
        for (String each : words) {
            if (each.contains("J")){
                counter++;
            }
        }
        System.out.println(counter);


    }
}
