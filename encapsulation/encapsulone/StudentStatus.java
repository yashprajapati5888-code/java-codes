package encapsulation.encapsulone;

public class StudentStatus {
    public static void main(String[] args) {
        Student obj = new Student();

        obj.setName("Yash");
        obj.setAge(20);

        System.out.println("My name is :"+ obj.getName());
        System.out.println("My age :"+ obj.getAge());
    }
}
