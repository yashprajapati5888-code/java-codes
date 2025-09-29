package finalclass.finalnine;

public class ShowNested {
    public static void main(String[] args) {
        Nested outer = new Nested();
        Nested.Inner inner = outer.new Inner();
        inner.display();
    }
}
