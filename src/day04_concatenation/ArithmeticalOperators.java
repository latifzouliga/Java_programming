package day04_concatenation;

public class ArithmeticalOperators {

    public static void main(String[] args) {

        System.out.println(100 + 200);
        System.out.println(40 -10);
        System.out.println(50 / 6); // the result is int because the numerator and the denominator are int
        System.out.println(50 / 6.0); // the result is always double as long as one number is double
        System.out.println(50D / 6); // 50 is converted to double because we added letter "D" to 50
        System.out.println((int) (2.5/1.5)); // converting the data type by casting int Operator
        System.out.println(10 * 2);
        System.out.println(20 % 6); // the remainder is the left over of the division as long as there is a decimal number
        System.out.println(100 % 13);
        System.out.println(45 % 8);

    }


}
