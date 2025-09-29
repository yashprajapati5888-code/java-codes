package constructor.defaultfifteen;

public class Anchor {
    private String name;
    private int code;

    Anchor() {
        name = "Mishti";
        code = 528;
    }
    void display() {
        System.out.println("Anchor Info → Name: " + name + ", Code: " + code);
    }
}
