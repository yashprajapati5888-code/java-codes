package abstraction.abstracttwo;

public class TestShape {
    public static void main(String[] args) {
        Shape obj = new Circle();
        Shape obj1 = new Square();

        obj.draw();
        obj1.draw();
    }
}
