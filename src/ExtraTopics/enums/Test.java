package ExtraTopics.enums;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        // String day = "Pencil";
        Day day = Day.MONDAY;

        // using enum in switch statement is pretty straight forward
        switch (day) {
            case MONDAY:
                System.out.println("It is monday");
                break;
            case TUESDAY:
                System.out.println("It is tuesday");
                break;
            case WEDNESDAY:
                System.out.println("It is Wednesday");
                break;
            case THURSDAY:
                System.out.println("It is Thursday");
                break;
            case FRIDAY:
                System.out.println("It is Friday");
                break;
            case SATURDAY:
                System.out.println("It is Saturday");
                break;
            case SUNDAY:
                System.out.println("It is Sunday");

        }


        // to get all enum values, we can use enum method (values()), and store is an array

        // array data type needs to be en enum
        Day[] week = Day.values();

        System.out.println(Arrays.toString(week)); // [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]

        // using loop to iterate through enum

        for (Day eachDay : Day.values()) {
            System.out.println(eachDay);
        }
        System.out.println("-----------------------enums months----------------------");


       Months[] months =  Months.values();
       Months oneMonth = Months.JULY;

        ArrayList<Months> list = new ArrayList<>();
        for (Months each : months) {
            list.add(each);
        }
        System.out.println(list);

        switch (oneMonth){
            case JULY:
                System.out.println("1");
                break;
            case JANUARY:
                System.out.println("2");
                break;
            case FEBRUARY:
                System.out.println("3");
                break;
            case MARCH:
                System.out.println("4");
                break;
        }


    }
}
