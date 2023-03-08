package day03_variables;

public class PrimitiveDataTypesIntro {

    public static void main(String[] args) {

        // DataType variableName = Date;

        // byte a = "Java"; // byte ONLY accepts integer values (-128 ~ 127)
        // byte a = 20.05; //  byte can not take decimal numbers
        // byte a = 2000; // out of Byte' range (-128 ~ 127)
        byte a = 20;

        // price of the car is $17500
        short p = 17500;
        System.out.println("p"); // can not use double quote to call a variable
        System.out.println(p);

        // salary is $95000
        int s = 95000; // preferred
        System.out.println(s);

       // int n = 99999999999; Out of int range
        long n = 9999999999L; // must use 'l' or 'L' in order to make it be taken as 'long'

        // gpa = 3.5
        double gpa1 = 3.5; // preferred
        float gpa2 = 3.5f; /* must add letter 'l' at the end of the number in order to force the compiler to take
                           as a float */

    }
}
