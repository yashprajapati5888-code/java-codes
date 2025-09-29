package encapsulation.encapsulfour;

public class Employe {
    private int id;
    private double salary;

    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
    public void setSalary(double s){
        salary = s;
    }

    public double getSalary() {
        return salary;
    }
}
