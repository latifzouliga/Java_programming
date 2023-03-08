package day21_multiDimentianlArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveExtraSpaces {

    public static void main(String[] args) {

        String str = "  Hello world      I      love      Java    ";

        System.out.println(str);

        String[] words = str.split(" ");

        System.out.println(Arrays.toString(words));

        str = "";

        for (String each : words) {   //
            if (!each.isEmpty()) {       //
                str += each + " ";
            }
        }
        str = str.trim();
        System.out.println(str);


        String[] str1 = {"Ahlam", "Latif"};
        String[] str2 = {"Lamya", "Zaid"};

        String[] str4 = ArraysUtility.merge(str1,str2);

        System.out.println(Arrays.toString(str4));







    }








}
/*
1. Write a program that can remove all the extra space from string
 			Ex:
 				str = "  Hello world      I      love      Java    "

         	Output:
         		Hello world I love Java
 */