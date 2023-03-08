package day40_collections;

import java.util.*;

public class IterablePracticeOne {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10, 20));

        Iterator<Integer> iterator = list.iterator();

        System.out.println(iterator.hasNext()); // returns boolean

        System.out.println(iterator.next()); // returns the first element

        System.out.println("--------------------------------------------------------------------------");

        List<String> names = new ArrayList<>();
        // removing duplicates using loop and iterator
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase("ahmed")) {
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("--------------------------------------------------------------------------");

       /*
        List<String> result = new ArrayList<>();
        for (String each : names) {
            if (!(result.contains(each))) {

                result.add(each);
            }
        }
        System.out.println(result);

 */

        System.out.println("--------------------------------------------------------------------------");

        List<String> names2 = new ArrayList<>();
        // removing duplicates using removeIf()
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        names2.removeIf(p -> p.equalsIgnoreCase("ahmed"));

        System.out.println(names2);

        System.out.println("--------------------------------------------------------------------------");

        // finding the nth max number
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9));

        int nth = 4;

        // using the loop to remove max number one at a time
        for (int i = 0; i < nth-1; i++) {
            numbers.removeIf(p -> Collections.max(numbers) == p); // removing max number
        }
        System.out.println(numbers);

        int max = Collections.max(numbers);
        System.out.println(max);





    }
}
