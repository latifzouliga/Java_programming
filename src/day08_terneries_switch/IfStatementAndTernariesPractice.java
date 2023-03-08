package day08_terneries_switch;

public class IfStatementAndTernariesPractice {

    public static void main(String[] args) {

        int score = 222;
        String result = "Your grade is: ";

       // nested ternary with if statement

        if (score >= 0 && score <= 100)
              result = (score  >= 90)?"A":(score>=80)?"B":(score >= 70)?"C":(score >=60)?"D":"Failed";
        else {
            result = "Invalid Result";
        }
        System.out.println(result);

        System.out.println("--------------------");

        // ternary without if statement // nested ternary

        String result2 = (score >= 0 && score <= 100)?
                           (score  >= 90)?"A":(score>=80)?"B":(score >= 70)?"C":(score >=60)?"D":"Failed"
                  :"Invalid Result";
        System.out.println(result2);

    }
}
