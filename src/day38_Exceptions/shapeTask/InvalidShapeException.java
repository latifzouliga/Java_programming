package day38_Exceptions.shapeTask;

public class InvalidShapeException extends RuntimeException{

    public InvalidShapeException(String message) {
        super(message);
    }

    public InvalidShapeException(){

    }

}
