package ExtraTopics.generic_Methods_And_Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestGenericMethods {

    public static void main(String[] args) {


        System.out.println("------------------------Array---------------------------");

        Integer[] numbers = {10, 20, 30, 40, 50};

        Double[] decimals = {1.5, 2.5, 3.5, 4.5, 5.5};

        Character[] characters = {'A', 'B', 'C', 'D', 'E'};

        String[] strings = {"Java", "Python", "SQL", "Wooden Spoon"};

        GenericStaticMethods.printEach(characters); // one generic method that accepts all data types

        System.out.println("----------------------Lists-----------------------------");

        List<Integer> integerList = new ArrayList<>();
        integerList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7));

        List<Double> doubleList = new ArrayList<>();
        doubleList.addAll(Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5));

        List<Character> characterList = new ArrayList<>();
        characterList.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));

        List<String> stringList = new ArrayList<>();
        stringList.addAll(Arrays.asList("Java", "Python", "SQL", "Wooden Spoon"));

        GenericStaticMethods.printEach(stringList);


        Integer[] number = {10, 20, 30, 40, 50};

        Object[] ar = reverse(number);
        System.out.println(Arrays.toString(ar));

        Object[] ar1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .filter(a -> (a >= 3 && a <= 7))
                .toArray();
        System.out.println(Arrays.toString(ar1));

        int[] arr = {59, 20, 44, 100, 19, 3,600 ,4, 2, 67, 1, 88};

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int k = i -1;
            while (k >= 0 && arr[k] > temp){
                arr[k + 1] = arr[k];
                k--;
            }
            arr[k + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));




    }


    public static <thing> Object[] reverse(thing[] array) {  //reverse double arrays


        Object[] reverse = new Object[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }

        return reverse;

    } // reverse double[]
}
