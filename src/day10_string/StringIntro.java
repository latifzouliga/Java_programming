package day10_string;

import java.util.Scanner;

public class StringIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = "Java";

        System.out.println();
        input.close();

        System.out.println("--------------------");

        // literal Strings are all strings in double quotations' exp: "Java", "dog" ...

        String s1 = "Cat";     // s1 and s3 and s4 will create only one memory allocation in the STRING POOL
        String s2 = "Dog";

        String s3 = "Cat";  // s1 and s3 and s4 will not be duplicated and will share the same memory in STRING POOL
        String s5 = "Cat";

        System.out.println( s1 == s3);
        System.out.println(s1 == s5);
        System.out.println(s3 == s5);

        String str1 = new String("Java");
        String str2 = new String("Java");

        System.out.println(str1 == str2); // Prints false
        // because they are two different objects and are stored outside the String pool,
        //but it still allocates memory in STRING POOL

        System.out.println("----------------------------------------");

        String t1 = "Python"; // this object creates memory allocation in the String Pool
        String t2 = new String("Python"); // new memory in the heap
        String t3 = new String("Python"); // another new memory in the heap

        System.out.println(t1); // Python
        System.out.println(t2); // Python
        System.out.println(t3); // Python

        System.out.println(t1 == t2);  // false
        System.out.println(t3 == t2);  // false






    }
}
