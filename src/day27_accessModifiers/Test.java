package day27_accessModifiers;

public class Test {

    public static void main(String[] args) {

        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

        System.out.println("----------------------------------------------------");

        System.out.println(AccessModifiers.publicDate);  // public is always accessible within the same class

        System.out.println(AccessModifiers.protectedData);  // protected is always accessible within the same class

        System.out.println(AccessModifiers.defaultData); // protected is always accessible within the same class

        //System.out.println(AccessModifiers.privateData); // private is not accessible within the same package


    }


}
