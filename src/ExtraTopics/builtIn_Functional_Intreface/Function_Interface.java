package ExtraTopics.builtIn_Functional_Intreface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Function_Interface {

    public static void main(String[] args) {

        /** represent a function that takes one object argument and return a value
            the built-in Interface function has one abstract method apply() that returns a value */

        // convert an array to arrayList
        Function<int[], List<Integer>> arrayToList = a -> {
            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return result;
        };

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // since function interface returns a value, than we can assign it a variable
        List<Integer> list = arrayToList.apply(array);

        System.out.println(list);



    }
}
