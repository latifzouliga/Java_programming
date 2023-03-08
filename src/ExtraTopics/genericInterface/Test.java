package ExtraTopics.genericInterface;

public class Test {

    public static void main(String[] args) {

        // for functional interface we need to use lambda expression
        MyFunction<Integer> displayCube = (a) -> {
            System.out.println(a * a * a);
        };

        displayCube.function(5);

        System.out.println("----------------------------------------------");

        // if lambda expression is taking on variable only, it is not needed to place it in parentheses
        // if lambda expression is taking one code fragment only, it is not necessary to place it into curly braces
        MyFunction<String> thirdChar = a -> System.out.println("The third character is: "+a.charAt(2));

        thirdChar.function("Zouliga");  // print character 'u'

    }
}
