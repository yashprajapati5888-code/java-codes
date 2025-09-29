package constructor.defaultten;

public class Shelf {

    private String name;
    private int code;

    Shelf() {
        name = "outer";
        code = 266;
    }
    void display() {
        System.out.println("Shelf Info → Name: " + name + ", Code: " + code);
    }
}
