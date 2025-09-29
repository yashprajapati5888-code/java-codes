package constructor.defaultsix;

public class Author {
    private String item;
    private int id;

    Author() {
        item = "Will of Fire";
        id =125;
    }
    void show() {
        System.out.println("Author Info → Item: " + item + ", Id: " + id);
    }
}
