package encapsulation.encapusulsix;

public class Movie {
    private String name;
    private double rating;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setRating(double r){
        rating = r;
    }
    public double getRating(){
        return rating;
    }
}
