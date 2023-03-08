package day10_string;

import java.util.Scanner;

public class StringMethod1 {

    public static void main(String[] args) {

        String str = "Cydeo";
        //            01234
        // chaAt() Method
        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        char thirdChar = str.charAt(2);
        char fourthChar = str.charAt(3);
        char fifthChar = str.charAt(4);


        System.out.println(firstChar);
        System.out.println(secondChar);
        System.out.println(thirdChar);
        System.out.println(fourthChar);
        System.out.println(firstChar);

        System.out.println("-------------------------------------------------------------");

        // length() Method

        String sentence = "Java Programming Language";

        int length = sentence.length();  // to count the number of characters

        System.out.println(length);

        int lastLength = length -1; // to get the last index number

        System.out.println(lastLength);

        System.out.println("---------------------------------------------------------------");

        String s1 = "Wooden Spoon";

        int lenght1 = s1.length();

        char frstChar = s1.charAt(0);

        int lstchar = s1.length() -1;

        char lst = s1.charAt(lstchar);

        System.out.println("num of characters: "+ lenght1);
        System.out.println("first character: "+ frstChar);
        System.out.println("last character: "+  lst);

        System.out.println("---------------------------------------------------------------");

        String name1 = "Umran";
        String name2 = new String("Umran");

        System.out.println(name1 == name2); // false // same value but different objects
        System.out.println(name1.equals(name2)); // true // compares the value of objects only

        System.out.println("---------------------------------------------------------------");

        String r1 = "Java";
        String r2 = "Java";

        String r3 = new String("Java");

        System.out.println(r1 == r2);  // false
        System.out.println(r1 == r3);  //false
        System.out.println(r1 == r3);  //false

        System.out.println(r1.equals(r3));  //true
        System.out.println(r2.equals(r3));  //true

        System.out.println("---------------------------------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("Are you a US citizen? yes/no");
        String answer = input.next();

         if (age >= 18 && answer.equalsIgnoreCase("yes")){
             System.out.println("Eligible to vote");
         }else {
             System.out.println("Not eligible to vote");
         }





    }


}
