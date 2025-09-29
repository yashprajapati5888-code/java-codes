package constructor.defaultnine;

public class Librarian {

    private String name;
    private int code;

    Librarian() {
        name = "Mr. yash";
        code = 104;
    }
    void show() {
        System.out.println("Librarian Info → Name: " + name + ", Code: " + code);
    }
}
