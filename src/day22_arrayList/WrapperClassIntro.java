package day22_arrayList;

public class WrapperClassIntro {

    public static void main(String[] args) {

        String str = "java";

        int a1 = 10;
        Integer a2 = a1;

        System.out.println("-----------------------------------");

        int b1 = 100;

        Integer b2 = b1; // autoboxing

        // wrapper class can ONLY accept primitives from its own type
        // example: Integer accepts int, Long accepts long and so on
        // Long b3 = b1;  // wrong wrapper class // compiler error
        // aautoboxing and unboxing is done implicitly

        char ch = 'A';
        Character ch1 = ch; // autoboxing

        double d1 = 5.5;  // autoboxing
        Double d2 = d1;

        System.out.println("----------------------------------------------");

        Integer n2 = 20;
        int n3 = n2;  // unboxing
        long n4 = n2; //



    }


}
