package day28_incapsulation.encapsulation;

public class Test {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setAge(10); // setting the age
        System.out.println(student1.getAge()); // getting the age

        //student1.setName("Aar1on");
        System.out.println(student1.getName());


    }
}
