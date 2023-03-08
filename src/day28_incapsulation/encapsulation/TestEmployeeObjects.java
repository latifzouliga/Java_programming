package day28_incapsulation.encapsulation;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        /*
        Employee employee1 = new Employee();

        employee1.setSalary(10000);
        System.out.println(employee1.getSalary());

        //employee1.setName("");
        System.out.println(employee1.getName());

         */

        Employee employee1 = new Employee("", 30,"Java Developer",100000);

        System.out.println(employee1);


    }
}
