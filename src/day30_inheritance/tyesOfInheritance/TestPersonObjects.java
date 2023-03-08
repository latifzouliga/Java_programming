package day30_inheritance.tyesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {

    public static void main(String[] args) {

        Student student = new Student("Lucy",'F', LocalDate.of(1990,5,16),'A',"A01");

        President president = new President("John",'M', LocalDate.of(1950,5,17),LocalDate.of(2017,10,15));

        Employee employee = new Employee("Omar",'M',LocalDate.of(1986,10,7),"Java devoloper","A23",15000);

        Teacher teacher = new Teacher("Nora",'F',LocalDate.of(1989,2,12),"High school teach","B78",80000);

        System.out.println(student);
        System.out.println(teacher);
        System.out.println(president);
        System.out.println(employee);

        student.study();
        teacher.teach();
        president.lie();

        System.out.println("---------------------------------");

        student.eat("Burger");
        teacher.drink("Coffee");
        president.drink("tea");

        student.drink("Milk");
        teacher.drink("Tea");
        president.drink("Coffee");




    }


}
