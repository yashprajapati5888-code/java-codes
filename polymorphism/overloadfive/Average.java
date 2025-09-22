package polymorphism.overloadfive;

public class Average {
    public void Avg(int a,int b){
        System.out.println("Average of two no." +(a+b)/2 );
    }
    public void Avg(int a, int b, int c) {
        System.out.println("Average of Three no." + (a + b + c) / 3);
    }

    public static void main(String[] args) {
        Average obj = new Average();

        obj.Avg(3,4);
        obj.Avg(2,3,5);
    }
}
