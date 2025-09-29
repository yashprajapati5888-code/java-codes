package constructor.defaulteleven;

public class Hostel {

    private String name;
    private int code;

    Hostel() {
        name = "RSK Hostel";
        code = 645;
    }
    void display() {
        System.out.println("Hostel Info → Name: " + name + ", Code: " + code);
    }
}
