package pojoclass.pojofive;

public class Circle {
    private double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*(radius * radius);
    }
}
