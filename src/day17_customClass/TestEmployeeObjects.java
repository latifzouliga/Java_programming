package day17_customClass;

public class TestEmployeeObjects {

    public static void main(String[] args) {
                                //constructor
        Employee employee1 = new Employee();
        employee1.setInfo("Abdellatif",36,'M',"SDET",150000,"A1232");

        Employee employee2 = new Employee();
        employee2.setInfo("Zouliga",37,'M',"Java Dev",160000,"A1234");

        Employee employee3 = new Employee();
        employee3.setInfo("Zaid",18,'M',"Java Dev",160000,"A1df32");


        // change one variable value
        employee1.age = 40;
        employee3.name = "Mohammed";
        employee2.jobTitle = "Cyber Security";

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        // change one variable value
        employee1.age = 40;
        employee3.name = "Mohammed";

        employee1.work();
        employee2.work();
        employee3.work();





    }
}
