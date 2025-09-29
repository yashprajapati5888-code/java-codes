package encapsulation.encapsulseven;

public class BankCustomerStatus {
    public static void main(String[] args) {
        BankCustomer c = new BankCustomer();
        c.setAccountNumber(1234567890L);
        c.setPin(1234);

        System.out.println("Account Number: " + c.getAccountNumber());
    }
}
