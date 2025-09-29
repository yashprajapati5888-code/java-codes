package abstraction.abstrationeight;

public class applianceStatus {
    public static void main(String[] args) {
        Appliance obj = new Fan();
        Appliance obj1 = new Fan();

        obj.turnon();
        obj1.turnoff();

    }
}
