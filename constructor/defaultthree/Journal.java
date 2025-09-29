package constructor.defaultthree;

public class Journal {
    private String item;
    private int id;

    Journal() {
        item = "Science Journal";
        id = 203;
    }
    void show() {
        System.out.println("Journal Info → Item: " + item + ", Id: " + id);
    }
}
