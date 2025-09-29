package constructor.defaulttwo;

public class College {
    private String name;
    private int code;

    College() {
        name = "MIT";
        code = 102;

    }
    void display() {
        System.out.println("college Info → Name: " + name + ", Code: " + code);
    }
}
