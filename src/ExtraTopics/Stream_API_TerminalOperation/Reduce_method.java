package ExtraTopics.Stream_API_TerminalOperation;

import java.util.Arrays;

public class Reduce_method {

    public static void main(String[] args) {

        /** requires two arguments (initialIdentity, BinaryOperator)
            BinaryOperator is a functional interface that takes two parameters and returns a value
            combines the elements of stream and returns them as a single string value */

        int[] arr = {1, 2, 3, 4, 5, 6};

        // 0 is the initialIdentity // represent the initialIdentity and b is each element in array
        // initialIdentity a number that you can to the sum of array elements

        int combine = Arrays.stream(arr).reduce(0, (a, b) -> a + b);
        int sum = Arrays.stream(arr).reduce(10, (a, b) -> a + b);

        System.out.println(combine); // 21
        System.out.println(sum);  // 31 // initialIdentity which is 10 is added to the sum of array

        System.out.println("-----------------------------------------");

        String[] words = {"Java", "Python", "C#", "Java"};

        String str = Arrays.stream(words).reduce("",(a, b) -> a +" "+ b);

        System.out.println(str);  // Java Python C# Java

        System.out.println("-------------------------------------------------");

        String str2 = "Hello this is me";

        String anotherStr = Arrays.stream(words).reduce(str2,(a, b) -> a + b);

        System.out.println(anotherStr); // Hello this is me JavaPythonC#Java




    }
}
