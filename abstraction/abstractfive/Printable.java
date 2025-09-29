package abstraction.abstractfive;

public interface Printable {
    public void print();
}

    class Document implements Printable{
        public void print() {
            System.out.println("Document print");

        }

}
