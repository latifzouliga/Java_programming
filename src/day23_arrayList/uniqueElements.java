package day23_arrayList;

import java.util.ArrayList;

public class uniqueElements {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeya");
        names.add("Sumeya");
        names.add("Ali");
        names.add("Sumeya");
        names.add("Marika");
        names.add("Marika");

        for (String each : names) {
            if (names.indexOf(each) == names.lastIndexOf(each)){
                System.out.println(each);
            }
        }






    }
}
