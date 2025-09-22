package inheritance.inheritthree;

public class Herarchial {
    public static void main(String[] args) {
        Bike obj = new Bike();
        Car obj1 = new Car();

        obj.ride();
        obj.start();

        obj1.drive();
        obj1.start();
    }
}
