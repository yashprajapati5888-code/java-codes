package constructor.defaultone;

public class University {
    private String name;
    private int code;

    University() {
        name = "Harvard";
        code = 101;
    }

        void display(){
            System.out.println("University Info → Name: " + name + ", Code: " + code);
        }

}
