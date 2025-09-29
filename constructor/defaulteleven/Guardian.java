package constructor.defaulteleven;

public class Guardian {
    private String item;
    private int id;

    Guardian() {
        item = "Mohan";
        id = 565;
    }
    void show() {
        System.out.println("Guardian Info → Item: " + item + ", Id: " + id);
    }
}
