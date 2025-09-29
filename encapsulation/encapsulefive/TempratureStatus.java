package encapsulation.encapsulefive;

public class TempratureStatus {
    public static void main(String[] args) {
        Temprature obj = new Temprature();

        obj.setCelcius(10);

        System.out.println("Fahrenheit:" + obj.getFahrenheit());
    }
}
