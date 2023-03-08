package day27_accessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;

    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
        {
            name = "James";
            age = 25;
        }


     */  // instance block is better in setting up default value for instance variables

    public static void main(String[] args) {

        /*
        InstanceInitializationBlock obj1 = new InstanceInitializationBlock();
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock();

        System.out.println(obj1.name);
        System.out.println(obj2.name);


         */  // all objects have the same default value

        InstanceInitializationBlock obj1 = new InstanceInitializationBlock("James", 34);
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock("John",23);

        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }
}
