package ExtraTopics.Stream_API_TerminalOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Max_Mix_methods {

    public static void main(String[] args) {

        // max return optionalInt

        int[] array = {1, 2, 3, 4, 5, 600, 7, 8, 9};

        int max = Arrays.stream(array).max().getAsInt();
        System.out.println(max);    // 600

        int min = Arrays.stream(array).min().getAsInt();
        System.out.println(min);    // 1

        double average = Arrays.stream(array).average().getAsDouble();
        System.out.println(average); // 71.0




    }
}
