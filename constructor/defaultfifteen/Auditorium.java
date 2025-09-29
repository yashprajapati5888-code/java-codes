package constructor.defaultfifteen;

public class Auditorium {
    private String name;
    private int id;

    Auditorium() {
        name = "Commity hall";
        id = 101;
    }
    void show() {
        System.out.println("Auditorium Info → Item: " + name + ", Id: " + id);
    }
}
