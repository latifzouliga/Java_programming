package day06_ifStatements;
/*
Warmup task:
	1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)
 */
public class OddOrEven {

    public static void main(String[] args) {
        int number = 50;

        boolean isEven = number % 2 == 0; // when the number is divided by 2 and the remainder is 0, it means the number in even

        // boolean isOdd = number % 2 != 0; // when the number is divided by 2 and the remainder is NOT 0, it means the number in odd

        boolean isOdd = !isEven; // if the number is not even, then it is odd

        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number + " is an even number: " + isOdd);



    }
}
