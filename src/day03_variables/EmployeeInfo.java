package day03_variables;
/*
1. Create a class named EmployeeInfo.java
        2. Declare the following variable with appropriate data types:
            1. name
            2. age
            3. gender
            4. companyName
            5. employeeId
            6. jobTitle
            7. salary
            8. isFullTime
*/

public class EmployeeInfo {
    public static void main(String[] args) {

        String name = "Abdellatif Zouliga";
        int age = 36;
        char gender = 'F';
        String CompanyName = "Stitches Embroidery",
                jobTitle = "Machine Operator",
                employeeId = "A23";
        int salary = 50500;
        boolean isFullTime = false;

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("CompanyName = " + CompanyName);
        System.out.println("employeeId = " + employeeId);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);



    }

}
