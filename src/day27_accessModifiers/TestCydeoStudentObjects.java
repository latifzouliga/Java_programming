package day27_accessModifiers;

public class TestCydeoStudentObjects {


    public static void main(String[] args) {

        System.out.println(CydeoStudent.schoolName);

        CydeoStudent student1 = new CydeoStudent("Abdellatif",36,'M');
        CydeoStudent student2 = new CydeoStudent("Ahlam",25,'F');

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

        System.out.println(student1.secretCode);
        System.out.println(student2.secretCode);

    }
}
