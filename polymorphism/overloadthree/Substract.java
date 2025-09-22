package polymorphism.overloadthree;

public class Substract {
    public void subtract(int a, int b){
        System.out.println("Subtract:" +(a-b));

    }
    public void substract(int a, int b, int c){
        System.out.println("Substract:" +(a-b-c));
    }

    public static void main(String[] args) {
        Substract obj = new Substract();
        obj.substract(10,20,30);
    }

}
