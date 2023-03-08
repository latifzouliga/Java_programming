package ExtraTopics.builtIn_Functional_Intreface;

import java.util.function.BiPredicate;

public class BiPredicate_Interface {

    public static void main(String[] args) {

        // Represent a function which takes two arguments (any objects) and returns boolean
        // BiPredicate interface has one abstract method test(T t, U u)

        //  a is the array and b is the Integer
        // if b element is in a array
        BiPredicate<int[], Integer> contains = (a, b) -> {
            for (int each : a) {
                if (each == b) {
                    return true;
                }
            }
            return false;
        };

        int[] array = {1, 600, 3, 4, 5, 6, 7, 87, 6, 7, 8};

        System.out.println(contains.test(array, 60)); // false

        boolean b = contains.test(array,600);
        System.out.println(b);     // true


    }
}
