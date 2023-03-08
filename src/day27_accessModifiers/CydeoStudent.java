package day27_accessModifiers;

public class CydeoStudent {

    public String nem;
    public int age;
    public char gender;

    public static String schoolName;
    public static String secretCode;

    public CydeoStudent(String nem, int age, char gender) {
        this.nem = nem;
        this.age = age;
        this.gender = gender;
    }

    static {
        schoolName = "Cydeo School";
        secretCode = "Wooden Spoon";
    }


    public String toString() {
        return "CydeoStudent{" +
                "nem='" + nem + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
