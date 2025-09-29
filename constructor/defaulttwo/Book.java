package constructor.defaulttwo;

public class Book {
    private String item;
    private int id;


    Book() {
        item = "Java Programming";
        id = 202;
    }

    void display() {
        System.out.println("book Info → Name: " + item + ", Code: " + id);
    }
}
