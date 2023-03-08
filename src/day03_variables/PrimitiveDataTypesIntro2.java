package day03_variables;

import day02_escapeSequences.AboutMe;

public class PrimitiveDataTypesIntro2 {

    public static void main(String[] args) {

     // DataType variableName = Date;

        // char is a single charcter and can not accept more than that.
        char a = '@'; // single chararcter must be inside single quote.
        char b = '!';
        // char ab = 'ab' // comiler error, more than 1 character.

        System.out.println(a);
        System.out.println(b);

        System.out.println("-------------------------------");

        char char3 = 20000;
        System.out.println(char3);

        System.out.println("-------------------------------");

        int sum = 'A' + 'B';
        //         65 + 66 = 131

        System.out.println(sum);

        System.out.println("---------------------");

        // char ch4 = -100;

        // boolean t1 = 123;
        // boolean t2 = 2.5;
        // boolean can be assigned to True or False only or to any expression that can be True or False
        boolean d1 = true;
        boolean d2 = false;
        boolean d3 = 3 > 4;

        System.out.println(d1);
        System.out.println(d3);






    }


}
