package Day13_customMethoss;

import java.util.Scanner;

public class ReturnStatementPractice {

    public static void main(String[] args) {

        System.out.println("Enter your grade:");

        char grade = new Scanner(System.in).next().charAt(0);

        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';

        if (!isValid){
            System.err.println("Invalid grade");
            return;  // terminates the method and does not return any value
        }
        System.out.println((grade == 'A')?"Execellent"
                :(grade == 'B')? "Great job"
                :(grade == 'C')?"Good"
                :(grade == 'D')? "Passed"
                :"Failed");





    }


}
