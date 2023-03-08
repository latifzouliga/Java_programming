package day07_ifStatements;

public class Grade2_MultiBranchIf {

    public static void main(String[] args) {

        char grade = 'Q';
        String result = "";

        if (grade == 'A') {
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        } else {
            result = "Failed";
        }

        System.out.println(result);


    }
}
/*
Create a class Grade, a char variable grade is given. write a program to print the following message:
     'A': Excellent
     'B': Great job
     'C': Good
     'D': Passed
     'E': Failed

 Note: Do Not use more than one print statement
 */