package ExtraTopics.functionalInterface;

public class Test {

    public static void main(String[] args) {

        MyFunction cube = num -> System.out.println(num * num * num);

        cube.test(10);

        System.out.println("---------------Odd or even------------------");

        MyFunction oddOrEven = (a) -> {
           if (a % 2 == 0)
            System.out.println("Even");
           else
               System.out.println("Odd");
        };

        oddOrEven.test(11);
    }

}


