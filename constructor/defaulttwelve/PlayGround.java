package constructor.defaulttwelve;

public class PlayGround {

    private String name;
    private int code;

    PlayGround() {
        name = "Kinder Garden";
        code = 949;
    }
    void display() {
        System.out.println("PlayGround Info → Name: " + name + ", Code: " + code);
    }
}
