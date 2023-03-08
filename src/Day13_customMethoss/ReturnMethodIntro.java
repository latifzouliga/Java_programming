package Day13_customMethoss;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        // int total = sum(20,40); // sum is a void method, does not return any data

        int total = addition(10, 20); // return data can be assigned a variable to make it reusable

        int t = square(10);
        System.out.println(square(10));

        System.out.println(cube(5));
        int q = cube(5);

    }
/*
    public static void sum(int n1, int n2){

        int result = n1 + n2;

        System.out.println(result);

    }
 */


    public static int addition(int n1, int n2) {

        int result = n1 + n2;
        return result;

    }  // This is the first return type method


    public static int square(int num) {

        int square = num * num;
        return square;


    }
    public static int cube(int nun){

        int cube = nun * square(nun); // calling the square method
        return cube;

    }


}
