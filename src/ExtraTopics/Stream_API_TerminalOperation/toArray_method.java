package ExtraTopics.Stream_API_TerminalOperation;

import java.util.Arrays;

public class toArray_method {

    public static void main(String[] args) {


        /** returns all the element in the stream instance as an Array */

        int[] array = {1, 1, 2, 2, 3, 2, 3, 4, 4, 5, 6, 4, 3, 2, 2, 3, 4, 4, 4, 3};

        int[] newArray = Arrays.stream(array).distinct().toArray();

        System.out.println(Arrays.toString(newArray));  // [1, 2, 3, 4, 5, 6]

        int[] anotherArray = Arrays.stream(array).filter(p -> (p % 2 == 0)).toArray();

        System.out.println(Arrays.toString(anotherArray));  // [2, 2, 2, 4, 4, 6, 4, 2, 2, 4, 4, 4]


    }
}
