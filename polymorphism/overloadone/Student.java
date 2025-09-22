package polymorphism.overloadone;

public class Student {
    public String name;
    public int age;
    public String printInfo;


    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
}
