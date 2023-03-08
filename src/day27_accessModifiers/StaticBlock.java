package day27_accessModifiers;

public class StaticBlock {

    public StaticBlock(){
        System.out.println("Constractor");
    }

    static {
        System.out.println("Static Block");
    }

    public static void main(String[] args) {

        System.out.println("Main Method");


        new StaticBlock();
        new StaticBlock();
        new StaticBlock();
    }
    static {
        System.out.println("Static Block");
    }

}
