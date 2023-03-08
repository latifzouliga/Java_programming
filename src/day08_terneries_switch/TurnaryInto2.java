package day08_terneries_switch;

public class TurnaryInto2 {

    public static void main(String[] args) {

        int num = 23;
/*

        String result = "";

        if (num2 >0){
            result = "Positive";
        }else if (num2 < 0){
            result = "Negative";
        }else {
            result = "Zero";
        }
        System.out.println(result);

*/
        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

        System.out.println(result);

        System.out.println("-----------------------------------");


        /*
        int n = 1;
        String day = "Monday";
        if (n ==2){
            day = "Tuesday";
        } else if (num2 == 3) {
            day = "Wednesday";
        } else if (num2 == 4) {
            day = "Thursday";
        }  else if (num2 == 5) {
            day = "Friday";
        } else if (num2 == 6) {
            day = "Sturday";
        } else{
            day = "Sunday";

        }

         */
        int num2 = 7;
        String day = (num2 == 1) ? "Monday" : (num2 == 2) ? "Thusday" : (num2 == 3) ? "Wednesday" : (num2 == 4) ? "Thursday"
                : (num2 == 5) ? "Friday" : (num2 == 6) ? "Sturday" : "Sunday";

        System.out.println(day);

        System.out.println("-----------------------------------------------");

        int month = 12;

        String nameofmonth = (month == 1)?"January":(month ==2)?"February":(month == 3)?"March":(month== 4)?"April"
                :(month== 5)?"May":(month == 6)?"June":(month ==7)?"July":(month == 8)?"August":(month == 9)?"September"
                :(month== 10)?"October":(month ==11)?"November": "december";

        System.out.println(nameofmonth);

    }
}
