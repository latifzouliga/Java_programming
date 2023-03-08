package day27_accessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {

    public StaticBlock_vs_InstanceBlock_vs_Constructor() {
        System.out.println("Constructor");
    } // takes arguments

    {  // number of executions depends on how many we created // does not take arguments
        System.out.println("Instance Block");
    } // it depends on objects, needs to create an object inorder to be executed

    static {
        System.out.println("Static Block");
    } // execute one time only. does not depend on objects // number of executions is one only

    public static void main(String[] args) {

        System.out.println("Main method");

        StaticBlock_vs_InstanceBlock_vs_Constructor obj1 = new StaticBlock_vs_InstanceBlock_vs_Constructor();
        StaticBlock_vs_InstanceBlock_vs_Constructor obj2 = new StaticBlock_vs_InstanceBlock_vs_Constructor();

    }
}

