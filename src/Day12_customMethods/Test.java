package Day12_customMethods;

public class Test {

    public static void main(String[] args) {

        // accessing the oddOrEven method from a different class

        int number = 3441;

        CustomMethodWithParameter.oddOrEven(number);

        // accessing the initial method from a different class

        String firstname = "Ahlam",
                lastName = "Hallooma";

        CustomMethodPractice.initial(firstname,lastName);





    }

}
