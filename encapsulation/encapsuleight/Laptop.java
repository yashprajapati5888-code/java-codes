package encapsulation.encapsuleight;

public class Laptop {
    private String brand;
    private double price;

    public Laptop(String b, double p) {
        brand = b;
        price = p;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }
}
