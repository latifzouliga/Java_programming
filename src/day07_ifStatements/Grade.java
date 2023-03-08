package day07_ifStatements;

public class Grade {
    public static void main(String[] args) {
        char grade = 'E';
        String result = "";
        if(grade == 'A'){
            result = "Excellent";
        }
        if(grade == 'B'){
            result = "Great job";
        }
        if(grade == 'C'){
            result = "Good";
        }
        if(grade == 'D'){
            result = "Passed";
        }
        if(grade == 'E'){
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