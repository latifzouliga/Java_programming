package Day13_customMethoss;

public class ReturnStatement {

    public static void main(String[] args) {

        eligible(25);

        System.out.println("----------------------------------------------");


        System.out.println("Test 1 started");
        boolean exit = true;
        if (exit){
            return;  // main method gets terminated her when exit evaluated to true.
        }

        System.out.println("Test completed");

        System.out.println("Test 2 started");



    }

    public static void eligible(int age){

        if (age < 0 || age > 150){
            System.err.println("Invalid age: "+ age);
            return; // exits the method only and does not return any value because the return type is VOID
        }

        if (age  >= 21){
            System.out.println("You are eligible to vote.");
        }else {
            System.out.println("You are not eligible to vote");
        }


    }
    public static int multiplication(int num1, int num2){

        int result = num1 * num2;
        return result;  // it returns a value when exiting the method, because the return type is an int

    }





}
