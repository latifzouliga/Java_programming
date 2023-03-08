package day08_terneries_switch;

public class SwitchIntro {

    public static void main(String[] args) {



        /*
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
         */
        char grade = 'q';
        String result = "";

        switch (grade){
            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result = "Great Job";
                break;
            case 'C':
                result = "Good";
                break;
            case 'D':
                result = "Passed";
                break;
            case 'E':
                result ="Failed";
                break;
            default:
                result = "Invalid Grade";
        }
        System.out.println(result);

        System.out.println("------------------------------------");





    }
}
