package constructor.defaultthirteen;

public class Archive {
    private String item;
    private int id;

    Archive() {
        item = "Artifacts";
        id = 644;
    }
    void show() {
        System.out.println("Archive Info → Item: " + item + ", Id: " + id);
    }
}
