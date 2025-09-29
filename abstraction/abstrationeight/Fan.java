package abstraction.abstrationeight;

public  class Fan extends Appliance{
    @Override
    public void turnon(){
        System.out.println("fan turnon");
    }
    @Override
    public void turnoff(){
        System.out.println("Fan turnoff");
    }
}
