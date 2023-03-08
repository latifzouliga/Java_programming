package ExtraTopics.builtIn_Functional_Intreface;

import java.util.function.BiConsumer;

public class BiConsumer_Interface {

    public static void main(String[] args) {


        // Represent a function that takes two argument (any object) and does not return any value
        // void accept(T t, U u)

        // printing a string for a number of times
        // a is string and b is number of reputation
        BiConsumer<String, Integer> print = (a, b) -> {
            for (int i = 0; i < b; i++) {
                System.out.println(a);
            }
        };

        print.accept("Hello World!",5);


    }
}
