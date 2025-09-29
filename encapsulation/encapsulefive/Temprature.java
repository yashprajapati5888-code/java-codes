package encapsulation.encapsulefive;

public class Temprature {
    private double celcius;

    public void setCelcius(double temp){
        celcius = temp;
    }
    public double getFahrenheit(){
        return (celcius*9/5)+32 ;
    }
}
