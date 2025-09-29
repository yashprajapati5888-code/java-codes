package constructor.defaultseven;

public class Professor {
    private String name;
    private int code;

    Professor() {
        name = "Raghav";
        code = 104;
    }
    void display() {
        System.out.println("Professor Info → Name: " + name + ", Code: " + code);
    }
}
