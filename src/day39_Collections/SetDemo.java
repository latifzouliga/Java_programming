package day39_Collections;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(list);

        /** ------------------------------ HashSet ------------------------------------
         * It maintains a random order, never be abe to predict which object is first or last
         * It doesn't accept duplicates
         * accepts null
         * The performance of hashSet is faster than LinkedSet and treeSet
         */

        HashSet<Integer> set1 = new HashSet<>();

        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(null, null, null, null));

        System.out.println(set1);


        /** ----------------------------------- LinkedHashSet -------------------------------------
         * It preserves insertion order
         * It doesn't accept duplicates
         * Accepts null
         */

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();

        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(null, null, null, null));

        System.out.println(set2);

        /** ------------------------------------- TreeSet --------------------------------------------
         * It is sorted, because it has a Is relationship with Interface SortedSet
         * It preserves insertion order
         * It doesn't accept duplicates
         * It doesn't have index number
         * It doesn't accept null keyword // NullPointerException
         */

        TreeSet<Integer> set3 = new TreeSet<>();

        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        // set3.addAll(Arrays.asList(null, null, null, null));  // NullPointerException

        System.out.println(set3);

        System.out.println("--------------------------------------------------------------");

        String[] words = {"Java", "Java", "Java", "Python", "Python", "Python", "C#", "C++", "Ruby", "C#", "C#"};

        System.out.println("Removing duplicates with with loop ");
        // removing the element with a loop
        ArrayList<String> result = new ArrayList<>();
        for (String each : words) {
            if (!(result.contains(each))) {
                result.add(each);
            }
        }
        System.out.println(result);


        System.out.println("Removing duplicates with LinkedHashSet");
        // removing elements without sorting
        LinkedHashSet<String> removeDup = new LinkedHashSet<>();
        removeDup.addAll(Arrays.asList(words));
        System.out.println(removeDup);

        // to get the second element is not an option in Set, because there is no index number
        // so it the other option it to pass it to one of the List sub-classes constructor

        System.out.println(new ArrayList<>(removeDup).get(1)); // Python


        System.out.println("Removing duplicates with TreeSet and sorting ");
        // converting array words to TreeSet to remove duplicates and sort elements
        Set<String> sortedWords = new TreeSet<>(Arrays.asList(words));
        System.out.println(sortedWords); //

        for (String each : sortedWords) {

        }

        System.out.println("Converting TreeSet to an array");
        words = sortedWords.toArray(new String[0]);
        System.out.println(Arrays.toString(words));

        System.out.println("-----------------------------------------------------------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 10, 10, 20, 20, 20, 30, 30, 30, 30, 40, 1, 1, 6, 6, 3, 3, 34, 99, 0, 23));

        System.out.println(new TreeSet<>(numbers)); // Sorting and removing duplicates by converting List to TreeSet


    }


}
