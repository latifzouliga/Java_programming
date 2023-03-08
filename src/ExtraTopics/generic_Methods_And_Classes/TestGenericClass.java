package ExtraTopics.generic_Methods_And_Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestGenericClass {

    public static void main(String[] args) {

        System.out.println("-------------------testing Array with generic type--------------------------");

        Integer[] numbers = {10, 20, 30, 40, 50};

        Double[] decimals = {1.5, 2.5, 3.5, 4.5, 5.5};

        Character[] characters = {'A', 'B', 'C', 'D', 'E'};

        String[] strings = {"Java", "Python", "SQL", "Wooden Spoon"};


        var obj = new GenericClass();  // Creating an object ot access generic methods
        obj.printEach(characters);  // Accessing generic methods through an object


        System.out.println("----------------------Lists-----------------------------");

        List<Integer> integerList = new ArrayList<>();
        integerList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7));

        List<Double> doubleList = new ArrayList<>();
        doubleList.addAll(Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5));

        List<Character> characterList = new ArrayList<>();
        characterList.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));

        List<String> stringList = new ArrayList<>();
        stringList.addAll(Arrays.asList("Java", "Python", "SQL", "Wooden Spoon"));



        GenericClass<String> listObj = new GenericClass<>();  // Creating an object to access generic methods
        listObj.printEach(stringList);  // calling generic method through an object

    }
}
