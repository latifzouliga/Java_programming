package day07_ifStatements;

public class MonthName {

    public static void main(String[] args) {

        int num = -8;

        String month = "";

        if (num >= 1 && num <=12)

            if (num == 1) month = "January";
            else if (num == 2) month ="Fabruary";
            else if (num == 3) month ="March";
            else if (num == 4) month ="April";
            else if (num == 5) month ="May";
            else if (num == 6) month ="June";
            else if (num == 7) month ="july";
            else if (num == 8) month ="August";
            else if (num == 9) month ="September";
            else if (num == 10) month ="October";
            else if (num == 11) month ="November";
            else  month ="December";

        else
            month = "No such a month";
        System.out.println(month);

    }
}
