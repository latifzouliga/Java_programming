package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = input.next();

        System.out.println("Enter your password:");
        String p = input.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")){
            System.out.println("Logged in");
        }else {
            for (int i = 0; i < 3; i++) {
                if (i != 2){
                    System.err.println("incorrect username or password, please re-enter");
                }else {
                    System.err.println("This is your last chance. Please re-enter your username and password");
                }


                System.out.println("Enter your username:");
                u = input.next();

                System.out.println("Enter your password:");
                p = input.next();


                if (u.equals("Cydeo") && p.equals("Cydeo123")){ // if the user enters valid credentials
                    System.out.println("You are now logged in");
                    break;
                }
            }
            if (!(u.equals("Cydeo") && p.equals("Cydeo123"))){ // after all the three attempt,
                System.err.println("Your account is locked, please contact with the suppord team");
            }

        }
        input.close();


    }

    public static void cydeoLogin(String sername, String passward){


    }



}
/*
7. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow the user to have three attempts to
                enter correct credentials and

                if all three attempts are failed, then print "Your account is lucked."
 */