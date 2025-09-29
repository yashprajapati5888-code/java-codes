package constructor.defaultfourteen;

public class Borrow {
    private String item;
    private int id;

    Borrow() {
        item = "Dress";
        id = 661;
    }
    void show() {
        System.out.println("Borrow Info → Item: " + item + ", Id: " + id);
    }
}
