package encapsulation.encapusulsix;

public class MovieStatus {
    public static void main(String[] args) {
        Movie obj = new Movie();

        obj.setName("Inception");
        obj.setRating(8.8);

        System.out.println("movie :" + obj.getName() + "rating" + obj.getRating());
    }
}
