package day07_ifStatements;

public class GradeReport {

    public static void main(String[] args) {

        int score = 80;
        String result = "Your grade is: ";

        if (score >= 90) {          // false: if score is less 90
            result += "A";
        } else if (score >= 80) {    // false: if score is less 90
            result += "B";
        } else if (score >= 70) {    // false: if score is less 80
            result += "C";
        } else if (score >= 60) {     // false: if score is less 70
            result += "D";
        } else {
            result += "F";            // false: if score is less 60
        }

        System.out.println(result);

    }
}
/*
1. Create a class named GradeReport.java
2. An integer variable named score is declared and given, Write a program that can print the grade of the student
        Ex:
              score = 95
        output:
               Your grade is A
     Note: Assume that the given score is between 0 ~ 100
 */