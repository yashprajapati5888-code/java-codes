package constructor.defaultfour;

public class Faculty {
    private String name;
    private int code;

    Faculty() {
        name = "Engineering";
        code = 104;
    }
    void display() {
        System.out.println("Faculty Info → Name: " + name + ", Code: " + code);
    }
}
