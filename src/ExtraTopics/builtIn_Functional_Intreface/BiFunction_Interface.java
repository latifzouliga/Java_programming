package ExtraTopics.builtIn_Functional_Intreface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunction_Interface {

    public static void main(String[] args) {

        // Represent a function which takes argument (any objects) and returns a value
        // R apply(T t, U u);  // R is the return type

        // merge to int array into arrayList
        // a and b are arrays
        BiFunction<int[], int[], List<Integer>> mergeTwoArrays = (a, b) -> {
            List<Integer> list = new ArrayList<>();
            for (int each : a) {
                list.add(each);
            }
            for (int each : b) {
                list.add(each);
            }

            return list;
        };

        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2 = {100, 200, 300, 400};
        List<Integer> list = mergeTwoArrays.apply(array1, array2);
        System.out.println(list);

    }
}
