package constructor.defaultfourteen;

public class Dress { private String name;
    private int code;

    Dress() {
        name = "Kurta Pajama";
        code =455;
    }
    void display() {
        System.out.println("Dress Info → Name: " + name + ", Code: " + code);
    }
}
