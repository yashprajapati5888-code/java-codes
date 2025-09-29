package finalclass.finaltwo;

public final class StudentDetail {
    private String name;

    public StudentDetail(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Student Name: " + name);
    }
}
