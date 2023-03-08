package Day14_forLoop;

public class OveloadingTheMainMethod {

    public static void main(String[] args) {
        System.out.println("A");

        main(25); // the main method with int parameter gets executed
        main(5.5); // the main method with double parameter gets executed
        main(true); // the main method with boolean parameter gets executed

    } // executes files because it is from Java system library


    // in order execute these main methods inside the real main method, we need to get rid of the square brackets []
    public static void main(int args) {
        System.out.println("B");

    }  // is not able to execute files because it is custom method


    public static void main(double args) {
        System.out.println("C");

    }


    public static void main(boolean args) {
        System.out.println("D");


    }


}
