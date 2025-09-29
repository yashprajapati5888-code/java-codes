package finalclass.finalseven;

public final class Device {
    private String model;
    private int price;

    public Device(String model, int price){
        this.model = model;
        this.price = price;
    }
    public String getModel(){
        return model;
    }
    public int getPrice(){
        return price;
    }
}
