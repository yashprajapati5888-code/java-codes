package encapsulation.encapsulfour;

public class EmployeeStatus {
    public static void main(String[] args) {
        Employe obj = new Employe();

        obj.setId(101);
        obj.setSalary(20000);

        System.out.println("Employee id"+ obj.getId());
        System.out.println("Employee salary" + obj.getSalary());
    }
}
