package constructor.defaultfive;

public class NewsPaper {
    private String item;
    private int id;

    NewsPaper() {
        item = "DailyPaper";
        id = 209;
    }
    void show() {
        System.out.println("NewsPaper Info → Item: " + item + ", Id: " + id);
    }
}
