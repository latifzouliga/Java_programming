package day07_ifStatements;

public class LoanApplication {

    public static void main(String[] args) {

        int salary = 80000;
        int creditScore = 680;
        String result = "";



        if (salary >= 45000 && creditScore >= 700){
            result = "Eligible";
        }else {
            result = "not Eligible";
        }
        System.out.println(result);


    }

}
/*
Create a class named LoanApplication. two variables named salary and createScore are declared and given. write a program
that can check if the person is eligible to apply foe a loan
    Nor: In order to be eligible for a loan:
         1. salary: at least 45k
         2. credit score: at least 700
 */