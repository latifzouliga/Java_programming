package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person[]  person = { new Person(), new Person(), new Person(),new Person(), new Person()} ;

        person[0].setInfo("Abellatif",'M', LocalDate.of(1986,7,10));
        person[1].setInfo("Latifa",'F', LocalDate.of(2000,10,3));
        person[2].setInfo("Ziad",'M',LocalDate.of(1953,10,23));
        person[3].setInfo("Akram",'M',LocalDate.of(1966,6,15));
        person[4].setInfo("Najat",'F',LocalDate.of(2003,9,28));

        ArrayList<Person> students = new ArrayList<>();

        students.addAll(Arrays.asList(person));

        // print names and date of birth of each person

        for (Person each : students) {
            String info = each.name + " age: " + each.age;
            System.out.println(info);
        }
        System.out.println("---------------------------------------------");
        // remove  all the  person objects that has the age > 55
        students.removeIf(p -> p.age > 55);

        for (Person each : students) {
            System.out.println(each.name + " age "+ each.age);
        }







    }
}
