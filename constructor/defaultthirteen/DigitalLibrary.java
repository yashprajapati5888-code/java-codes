package constructor.defaultthirteen;

public class DigitalLibrary {

    private String name;
    private int code;

    DigitalLibrary() {
        name = "Google";
        code =646;
    }
    void display() {
        System.out.println("Digital Library Info → Name: " + name + ", Code: " + code);
    }
}
