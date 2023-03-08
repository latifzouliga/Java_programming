package day38_Exceptions;

public class Library {

    public static void sleep(double seconds){

        try {
            // sleep method requires long argument
            Thread.sleep((long)(seconds * 1000));
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }


    }

}
