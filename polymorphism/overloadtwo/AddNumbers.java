package polymorphism.overloadtwo;

public class AddNumbers {

    public void add(int a, int b){
        System.out.println("sum:" +(a+b));
    }
    public void add(int a, int b, int c){
        System.out.println("sum:" +(a+b+c));
    }

public static void main(String args[]) {
    AddNumbers obj = new AddNumbers();
    obj.add(10, 20, 30);
}
}

