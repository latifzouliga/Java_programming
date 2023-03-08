package day08_terneries_switch;

public class TernaryIntro3 {

    public static void main(String[] args) {

        int score = 44;
        /*

        if (score >= 0 && score <= 100) {   //  If the score is valid
            if (score >= 60) {    // if the score is greater or equal to 60
                System.out.println("Passed");
            } else {      // if the score is less than 60
                System.out.println("Failed");
            }

        } else {  // Invalid score
            System.out.println("Invalid Score");
        }

         */
        String result = (score >= 0 && score <= 100) ?
                (score >= 60) ? "Passed" : "Failed"
                : "Invalid";
        System.out.println(result);

        System.out.println("-----------------------------");

        int n = 22;

        String day = (n >= 1 && n <= 7) ?
                (n == 1) ? "Moday" : (n == 2) ? "Thuesday" : (n == 3) ? "Wednesday" : (n == 4) ? "Thursday"
                        : (n == 5) ? "Friday" : (n == 6) ? "Saturday" : "Sunday"
                : "No such a day";
        System.out.println(day);


    }
}
