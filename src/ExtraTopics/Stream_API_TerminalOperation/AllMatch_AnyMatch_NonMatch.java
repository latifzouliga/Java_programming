package ExtraTopics.Stream_API_TerminalOperation;

import java.util.Arrays;

public class AllMatch_AnyMatch_NonMatch {

    public static void main(String[] args) {

        /** allMatch, anyMatch, nonMatch are for terminal operations and the return type is boolean
         allMatch (Predicate): checks if all the element is the stream matches with the specified predicate */

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // all the array elements needs to meet the condition inorder to be evaluated to true
        System.out.println(Arrays.stream( array1).allMatch(a -> a < 10) ); // true

        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // only one element needs to meet the condition inorder to be evaluated to true
        System.out.println(Arrays.stream(array2).anyMatch(a -> a == 4)); // true

        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // all the elements in array needs to be false inorder to be evaluated to true
        // if just one element is true the result will be false
        // it is the opposite of allMatch
        System.out.println(Arrays.stream(array3).noneMatch(a -> a % 2 == 0));




    }
}
