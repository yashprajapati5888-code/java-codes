package encapsulation.encapsulthree;

public class Amount {
    private double balance;

    public void setBalane(double amount) {
        if (amount > 0) {
            balance = amount;
        } else {
            System.out.println("Invalid Amount");
        }
    }
        public double getBalance(){
            return balance;
        }

}
