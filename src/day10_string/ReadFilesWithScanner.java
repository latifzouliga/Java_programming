package day10_string;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFilesWithScanner {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(Path.of("src/day10_string/Test.txt"));
/*
        // reading line by line
        System.out.println(scan.nextLine()); // reads the first line
        System.out.println(scan.nextLine()); // reads the second line
        System.out.println(scan.nextLine()); // reads the third line
*/
        // reading word by word
        System.out.println(scan.next()); // reads the first word
        System.out.println(scan.next()); // reads the second word
        System.out.println(scan.next()); // reads the third word
        System.out.println(scan.next()); // reads the fourth word
        System.out.println(scan.next()); // reads the fifth word

        scan.close();




    }
}
