package abstraction.abstractsix;

public interface Vehicle {
    public void start();
}
class car implements Vehicle{
    public void start() {
        System.out.println("car start");

    }
}
