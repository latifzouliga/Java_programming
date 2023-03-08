package Day13_customMethoss;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        boolean odd = isOdd(11);    // Odd number
        System.out.println(odd);

        boolean even = isEven(21);  // Even number
        System.out.println(even);

        System.out.println(max(112,44)); // Maximum number


    }

    public static boolean isOdd(int num) {

        return (num % 2 != 0) ? true : false;

    }  // Method for odd numbers


    public static boolean isEven(int num) {

        return (!isOdd(num));


    }  // Method for even numbers


    public static int max(int n1, int n2) {

        // return n1 > n2 ? n1 : n2; // ternary

        if (n1 > n2){
            return n1;
        }
        return n2;


    }   // Method for Maximum numbers















}
