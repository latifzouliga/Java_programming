package day29_inheritance.incapsulation;

public class Student {
    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);

    }

    public String getName() {
        return name;
    }

    private void setName(String name) {

        if (name.trim().length() != name.length()) {
            System.err.println("Name should not start or end with space");
            System.exit(1);
        }

        if (name.isBlank() || name.isEmpty()) {
            System.err.println("Name is blank or empty");
            System.exit(1);
        }
        // checking whether the first char is an upper case letter
        boolean upperCase = name.startsWith(name.toUpperCase().substring(0, 1));
        boolean original = name.startsWith(name.substring(0, 1));
        if (upperCase != original) {
            System.err.println("Name should not start with lower case letter");
            System.exit(1);
        }


        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        if (age < 5 || age > 90) {
            System.err.println("Invalid age");
            System.exit(1);
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        switch (gender) {
            case 'm':
            case 'M':
            case 'f':
            case 'F':
                break;
            default:
                System.err.println("Invalid gender");
                System.exit(1);
        }

        this.gender = gender;
    }

    public char getGrade() {

        return grade;
    }

    public void setGrade(char grade) {

        switch (grade) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'F':
                break;
            default:
                System.err.println("Invalid grade");
                System.exit(1);
        }

        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", grade=" + getGrade() +
                ", schoolName='" + getSchoolName() + '\'' +
                '}';
    }
}
