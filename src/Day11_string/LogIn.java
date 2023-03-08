package Day11_string;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        String correctUserName = "Cydeo",
                correctPassword = "WoodenSpoon";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String username = input.nextLine();

        System.out.println("Enter your password");
        String password = input.nextLine();

        input.close();

        if(username.equals(correctUserName)&& password.equals(correctPassword)){
            System.out.println("You are now logged in successfully");
        }else {
            System.err.println("Invalid Username or Password");
        }



    }
}
