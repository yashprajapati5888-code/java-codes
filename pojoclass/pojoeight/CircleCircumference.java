package pojoclass.pojoeight;

public class CircleCircumference {
    private double radius;

    public CircleCircumference(int radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * Math.PI* radius;
    }
}
