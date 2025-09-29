package constructor.defaultseven;

public class Publisher {
    private String item;
    private int id;

    Publisher() {
        item = "Dainik Bhaskar";
        id = 204;
    }
    void show() {
        System.out.println("Publisher Info → Item: " + item + ", Id: " + id);
    }
}
