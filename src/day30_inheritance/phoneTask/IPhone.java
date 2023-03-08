package day30_inheritance.phoneTask;

public class IPhone extends Phone {

    public IPhone(String model, String size, String color, double price){
        super("Iphone",model,size,color,price);
    }

    public static boolean hasApplePay = true;


    public void faceTime(long phoneNumber){
        System.out.println(getBrand() + " is face timing "+ phoneNumber );
    }

    public void faceTime(String email){
        System.out.println(getBrand() + " is face timing "+ email );
    }

}
