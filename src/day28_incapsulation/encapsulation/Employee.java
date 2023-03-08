package day28_incapsulation.encapsulation;

public class Employee {

    private String name;
    private int age;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, String jobTitle, double salary) {
        setName(name);
        setAge(age);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 16 || age > 65) {
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.isEmpty() || jobTitle.isBlank()) {
            System.err.println("Job title of the employee can not empty or blank");
            System.exit(1);
        }

        this.jobTitle = jobTitle;
    }

    public String getName() {

        if (name == null) {
            return "Unknown";
            //System.err.println("Name is not set");
            //System.exit(1);
        }
        return name;
    }

    public void setName(String name) {

        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Employee name can not be empty or blank");
            System.exit(1);
        }


        this.name = name;
    }

    public double getSalary() {  // read

        return salary;
    }

    public void setSalary(double salary) { // write

        if (salary < 0) {
            System.err.println("Salary can not be negative: " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
