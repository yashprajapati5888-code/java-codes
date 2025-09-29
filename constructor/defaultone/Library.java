package constructor.defaultone;

public class Library {
    private String item;
    private int id;

     Library() {
         item = "Central Library";
         id = 201;
     }
    void show() {
         System.out.println("Library Info → Item: " + item + ", Id: " + id);
    }
}
