package day27_accessModifiers;

public class StaticInitializationBlock {

    public static int a;
    public static double b;
    public static String c;

    // public static ExelSheet sheet; // it needs static block to set up steps to make it except automatically

    static {
        a = 100;
        b = 20.5;
        c = "Java";
    }



}
