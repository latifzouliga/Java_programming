package day38_Exceptions.shapeTask;

public class Square extends Shapes{

    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0){
            throw new InvalidShapeException("Square side can not be zero or negative: "+side);
        }
        this.side = side;
    }

    @Override
    public double calcArea(){
        return side * side;
    }
    @Override
    public double calcPerimeter(){
        return side * 4;
    }

    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof Square)){
            throw new InvalidShapeException("Invalid shape: "+ obj);
        }
        if (((Square)obj).side == side ){
            return true;
        }else {
            return false;
        }
    }
}
