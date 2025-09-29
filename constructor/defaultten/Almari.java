package constructor.defaultten;

public class Almari {
    private String item;
    private int id;

    Almari() {
        item = "Fully Functional";
        id = 656;
    }
    void show() {
        System.out.println("Almari Info → Item: " + item + ", Id: " + id);
    }
}
