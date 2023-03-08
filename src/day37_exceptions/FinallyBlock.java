package day37_exceptions;

public class FinallyBlock {

    public static void main(String[] args) {



        try {
            System.out.println(9/0);
        }catch (NullPointerException e){
            System.out.println("Runtime exception has been caught");
            e.printStackTrace();
            System.exit(1); // to stop finally from being executed
        }finally {   // always gets executed
            System.out.println("Finally Block");
        }
        System.out.println("Program ended");
    }
}
