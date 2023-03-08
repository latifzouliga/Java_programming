package day22_arrayList;

import java.util.ArrayList;

public class IteratingArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3,255);

       // numbers.add(300, 2000);  //  compiler error // Index: 300, Size: 6

        System.out.println(numbers);     // [100, 200, 300, 255, 400, 500]

        System.out.println("------------------------------------------------------------------");

                                    // iterating ArrayList


        // iterating Arraylist from first element to last one

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("'------------------------------------------------------");
        // iterating Arraylist from last element to the first one

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }

        System.out.println("------------------------------------------------------");

        // iterating ArrayList with for each loop

        // need to make sure that the data type is 
        for (Integer each : numbers) {
            System.out.println(each);
        }







    }



}
