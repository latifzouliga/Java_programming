package Day14_forLoop;

public class MethodOverloadingPractice {

    public static void main(String[] args) {

        System.out.println(sum(10, 20)); // executes the sum() method with two parameters
        System.out.println(sum(10, 20, 30)); // executes the sum() method with three parameters
        System.out.println(sum(10, 20, 30, 40));  // executes the sum() method with four parameters

        System.out.println(sum(10, 20.5)); // int + double // sum() method with double type will be executed

    }


    // Method overloading allows us to have methods with the same name but different parameters
    public static int sum(int num1, int num2) {
        return num1 + num2;

    }  //same method name with 2 parameters

    public static int sum(int num1, int num2, int num3) {
        return sum(num1, num2) + num3;

    } // same method name with 3 parameters


    public static int sum(int num1, int num2, int num3, int num4) {
        return sum(num1, num2, num3) + num4;

    }  // same method name with 4 parameters

    //---------------------------------------------------------------------------------------------------------------
    // these last 3 methods are the same as the first 3 methods but with different data-type
    public static double sum(double num1, double num2) {
        return num1 + num2;

    } // the same method but with different data-type

    public static double sum(double num1, double num2, double num3) {
        return sum(num1, num2) + num3;

    }


    public static double sum(double num1, double num2, double num3, double num4) {
        return sum(num1, num2, num3) + num4;

    }


}
