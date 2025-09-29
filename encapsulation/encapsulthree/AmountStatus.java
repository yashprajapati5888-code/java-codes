package encapsulation.encapsulthree;

public class AmountStatus {
    public static void main(String[] args) {
        Amount obj = new Amount();

        obj.setBalane(2000);

        System.out.println("Amount:" + obj.getBalance());
    }
}
