package constructor.defaulteight;

public class Subject {

    private String name;
    private int code;

    Subject() {
        name = "Mathematics";
        code = 204;
    }
    void display() {
        System.out.println("Subject Info → Name: " + name + ", Code: " + code);
    }
}
