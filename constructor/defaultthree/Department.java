package constructor.defaultthree;

public class Department {
    private String name;
    private int code;

    Department() {
        name = "Computer Science";
        code = 103;
    }
    void display() {
        System.out.println("Department Info → Name: " + name + ", Code: " + code);
    }
}
