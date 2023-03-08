package day04_concatenation;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {

        // ---------- Implicit Casting -----------------
        byte a = 13;

        short b = a;
        //  short b = a;
        System.out.println(b);

        int c  = a; // implicit casting

        long d = 3000L;

        float f = d; // implicit casting

        // ------------- Explicit Casting -------------
        int x = 100;

        byte y = (byte)x; // explicit casting by adding casting operand

        float z = 20.8F;

        short g = (short)z; // z = 20.8

        System.out.println(g);

        double n1 = 2.5;

        byte n2 = (byte) n1; // explicit casting

        System.out.println(n2);

        int r = 50000;

        short r1 = (short) r;

        System.out.println(r1);

        System.out.println("-------------------------");

        double u = 3000.5;

        int p = (int) u; // explicit casting



    }



}
