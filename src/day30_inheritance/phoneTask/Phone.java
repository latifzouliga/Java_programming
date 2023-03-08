package day30_inheritance.phoneTask;

public class Phone {

    private String brand,model, size, color;
    private double price;


    public Phone(String brand,String model, String size, String color, double price) {
        setBrand(brand);
        setModel( model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println(getBrand()+ " is calling "+phoneNumber);
    }

    public void  text(long phoneNumber){
        System.out.println(getBrand()+ " is texting "+ phoneNumber);
    }


    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                "model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
