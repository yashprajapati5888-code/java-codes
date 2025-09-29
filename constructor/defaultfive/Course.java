package constructor.defaultfive;

public class Course {

    private String name;
    private int code;

    Course() {
        name = "IOT";
        code = 108;
    }
    void display() {
        System.out.println("Course Info → Name: " + name + ", Code: " + code);
    }
}
