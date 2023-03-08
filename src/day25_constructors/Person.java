package day25_constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    public String name;
    public char gender;
    public LocalDate dateOfBirth;
    public boolean isMarried;
    public boolean isEmployed;

    public Person(String name, char gender, LocalDate dateOfBirth, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }


    public String toString() {
        LocalDate today = LocalDate.now();

        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("MMM-d-yyyy")) +
                ", age=" + (today.getYear() - dateOfBirth.getYear()) +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';

    }



}

/*
name, age, gender, dateOfBirth, isMarried, isEmployed

Add a constructor that can set all the fields once an object is created

toString(), eat(String food), sleeping(), drink(String drink)
 */