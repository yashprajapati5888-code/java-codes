package polymorphism.overloadfour;

public class Area {
    public void Traingle(int length,int breadth){
        System.out.println("Area of a Traingle:"+(length*breadth));
    }
    public void Square(int side){
        System.out.println("Area of Square:"+(side*side));
    }

    public static void main(String[] args) {
        Area obj = new Area();

        obj.Traingle(2,3);
        obj.Square(2);
    }
}
