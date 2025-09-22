package polymorphism.overloadone;

public class StudentDetail {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "yash";
        s1.age = 20;

        s1.printInfo = (s1.name);

    }
}
