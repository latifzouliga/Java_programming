package ExtraTopics.builtIn_Functional_Intreface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_Interface {

    public static void main(String[] args) {

        // Predicate is a built-in functional interface that returns boolean
        // Represent a function which takes one object argument and always returns boolean

        System.out.println("-----------isOdd---------");

        Predicate<Integer> isOdd = a -> (a % 2 != 0); // return true or false

        boolean b1 = isOdd.test(101);
        System.out.println(b1);

        System.out.println("-------------Palindrome--------------");

        List<String> list = new ArrayList<>();
        list.add("Ana");
        list.add("Latif");
        list.add("Ahlam");
        list.add("racecar");

        // returns true if it is palindrome otherwise false
        Predicate<String> isPalindrome = s -> {
            String reversed = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                reversed += s.toLowerCase().charAt(i);
            }
            return reversed.equals(s.toLowerCase());

        };

        System.out.println(isPalindrome.test("Ana"));

        // using isPalindrome function to check if a word is palindrome and comparing the length of each palindrome
        String result = "";
        int max = list.get(0).length();

        for (String each : list) {
            if (isPalindrome.test(each)) {
                if (each.length() > max) {
                    max = each.length();
                    result = each;
                }
            }
        }
        System.out.println(result);

        System.out.println("------------------------------------------");

        Predicate<Integer> p = a -> (a > 4);

        System.out.println(p.test(10));  // true
        System.out.println(p.test(2));   // false


        Predicate<String> pr = a -> (a.length() > 5);

        System.out.println(pr.test("hello"));
        System.out.println(pr.test("Zouliga"));


    }
}
