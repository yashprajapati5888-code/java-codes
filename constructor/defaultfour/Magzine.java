package constructor.defaultfour;

public class Magzine {
    private String item;
    private int id;

    Magzine() {
        item = "Tech Monthly";
        id = 204;
    }
    void show() {
        System.out.println("Magzine Info → Item: " + item + ", Id: " + id);
    }

}
