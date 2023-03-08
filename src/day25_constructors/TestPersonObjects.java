package day25_constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestPersonObjects {


    public static void main(String[] args) {

        Person person1 = new Person("Latif", 'M', LocalDate.of(1986, 7, 10), true, true);

        person1.eat("berger");
        person1.drink("juice");
        person1.sleep();
        String date = person1.dateOfBirth.format(DateTimeFormatter.ofPattern("EEEE, MMM-d-y"));

        System.out.println(date);
    }

}
