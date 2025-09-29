package encapsulation.encapsuleight;

public class LaptopStatus {
    public static void main(String[] args) {
        Laptop l = new Laptop("HP", 55000);
        System.out.println("Laptop: " + l.getBrand() + ", Price: " + l.getPrice());
    }
}
