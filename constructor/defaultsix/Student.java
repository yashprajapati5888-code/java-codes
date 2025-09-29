package constructor.defaultsix;

public class Student {

    private String name;
    private int code;

    Student() {
        name = "yash";
        code = 508;
    }
    void display() {
        System.out.println("Student Info → Name: " + name + ", Code: " + code);
    }
}
