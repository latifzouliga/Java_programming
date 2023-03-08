package day16_nestedLoop;

import java.util.Scanner;

public class LoopPractices {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++){
            System.out.println("Hello For " + i);
        }

        System.out.println("------------------------------------------");
        int j =0;
        while (j < 5){
            System.out.println("Hello While " + j);
            j++;
        }
        System.out.println("------------------------------------------");

        int k = 0;
        do {
            System.out.println("Hello Do While "+ k);
            k++;
        }while (k < 5);

        System.out.println("------------------------------------------");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score:");
        int score = input.nextInt();

        while (score < 0 || score > 100){
            System.out.println("Invalid score");
            score = input.nextInt();

        }

        if (score >= 60){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }





    }
}
