package day19_array;

import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0] = "Abdellatif";
        myGroup[1] = "Nazar";
        myGroup[2] = "Zaid";
        myGroup[3] = "Lamya";
        myGroup[myGroup.length-1]= "Rado";

        System.out.println(Arrays.toString(myGroup));

        myGroup[1] = "Ahlam"; // change the name of one element // Arrays are mutable

        System.out.println(Arrays.toString(myGroup));

        System.out.println("--------------------------------");

        for (int i = myGroup.length-1; i >= 0; i--) {

            System.out.println(myGroup[i]);

        }

        System.out.println("--------------------------------");








    }

}
