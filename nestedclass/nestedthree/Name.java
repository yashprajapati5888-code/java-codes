package nestedclass.nestedthree;

public class Name {
    public class Inner{
        public String name;
        public Inner(String name){
            this.name = name;
        }
        public void display(){
            System.out.println("Name: " + name);
        }
    }
}
