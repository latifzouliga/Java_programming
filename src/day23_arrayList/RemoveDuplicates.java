package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeya");
        names.add("Sumeya");
        names.add("Ali");
        names.add("Symeya");

        ArrayList<String> nonDup = new ArrayList<>();


        for (String each : names) {
            if (!nonDup.contains(each)){
                nonDup.add(each);
            }
        }
        System.out.println(nonDup);   // [Vasyl, Sumeya, Ali, Symeya]

        names = nonDup;  // unreferencing the original ArrayList so that it can be eligible for garbage collection

        System.out.println(names);  // [Vasyl, Sumeya, Ali, Symeya]




    }


}
