package day09_scanner;

import java.util.Scanner;

public class NextLine_vs_next {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt(); // 33 + ENTER // ENTER  is stored in scanner memory and passed to input.nextLine()

        input.nextLine(); // reads Enter which is provided after we enter the age 33 and hit ENTER

        System.out.println("Enter your Full name:");
        String name = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("name = " + name);

        input.close();


    }
}
