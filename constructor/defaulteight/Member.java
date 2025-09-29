package constructor.defaulteight;

public class Member {
    private String item;
    private int id;

    Member() {
        item = "Community";
        id = 105;
    }
    void show() {
        System.out.println("Member Info → Item: " + item + ", Id: " + id);
    }
}
