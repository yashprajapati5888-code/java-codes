package encapsulation.encapsulten;

public class Circle {
    private double radius;

    public void setRadius(double r) {
        radius = r;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}
