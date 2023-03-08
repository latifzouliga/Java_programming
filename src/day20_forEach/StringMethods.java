package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cydeo School";

        // to get each char of string and return it as a char array
        char[] chr = str.replace(" ","").toLowerCase().toCharArray();

        System.out.println(Arrays.toString(chr));

        String str2 = "Today is a great day to learn java";

        // to split a string into  elements

        String[] words = str2.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("--------------------------------------------------------------");

        // reverse a sentence
        
        String sentence = "I love Java";

        String[] wrd = ArraysUtility.reverse(sentence.split(" "));

        System.out.println(Arrays.toString(wrd));


        // concatenate reverse sentence into a string
        String reverseSentence = "";

        for (int i = 0; i < wrd.length; i++) {

            reverseSentence += wrd[i]+ " ";
            
        }
        System.out.println(reverseSentence);






    }

}
