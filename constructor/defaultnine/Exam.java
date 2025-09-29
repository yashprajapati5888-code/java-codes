package constructor.defaultnine;

public class Exam {

    private String name;
    private int code;

    Exam() {
        name = "Engineering";
        code = 104;
    }
    void display() {
        System.out.println("Exam Info → Name: " + name + ", Code: " + code);
    }
}
