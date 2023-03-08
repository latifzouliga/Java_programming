package day38_Exceptions;

import java.util.InputMismatchException;

public class Person {

    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);

        boolean isValid = gender == 'M'|| gender == 'm'|| gender == 'F' || gender == 'f';

        if (!isValid){  // if the age is invalid
            // throw an exception and crash the program
            throw new InputMismatchException("Invalid gender: "+ gender);
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if (age == 0){
            throw new RuntimeException("Age has not been set");
        }
        return age;
    }

    public void setAge(int age) {

        if (age < 0 || age > 150){ // if the given age is invalid
            // threw runtime exception, and crash the program
            throw new RuntimeException("Invalid age: "+ age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person-->|" +
                "name: " + name +
                ", age: " + age +
                ", gender: " + gender +
                '|';
    }
}
