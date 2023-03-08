package day40_collections;

import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );


        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            String word = it.next();
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            if (word.equalsIgnoreCase(reversed)) {
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("---------------------------------------------------------------------------------------");


        List<String> names2 = new ArrayList<>();
        names2.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

        // removing Palindromes using removeIf and custom method
        names2.removeIf(p -> StringUtility.reverse(p).equalsIgnoreCase(p));

        System.out.println(names2);

        System.out.println("---------------------------------------------------------------------------------------------");

        List<String> names3 = new ArrayList<>();
        names3.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

        // Removing Palindromes with removeIf() and passing a loop to the body of removeIf()
        names3.removeIf(p -> {
            for (int i = 0; i < p.length() / 2; i++) {
                char ch = p.charAt(i);
                char ch2 = p.charAt(p.length() - 1 - i);
                if (ch == ch2) {
                    return true;
                }
            }
            return false;
        });
        System.out.println(names2);

        System.out.println("---------------------------------------------------------------------------------------------");

        List<String> names4 = new ArrayList<>();
        names4.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

        // Removing Palindromes with removeIf() and passing a loop to the body of removeIf()
        names4.removeIf(p -> {
            String  reversed = "";
            for (int i = p.length() -1 ; i >= 0 ; i--) {
                reversed += p.charAt(i);
            }
            if (p.equalsIgnoreCase(reversed)){
                return true;
            }
            return false;
        });
        System.out.println(names4);

        System.out.println("---------------------------------------------------------------------------------------------");

        List<String> names5 = new ArrayList<>();
        names5.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

        // Removing Palindromes using removeIf() and StringBuilder()

        names5.removeIf(p -> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p));

        System.out.println(names5);


    }
}
