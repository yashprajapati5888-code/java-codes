package encapsulation.encapsulseven;

public class BankCustomer {
    private long accountNumber;
    private int pin;

    public void setAccountNumber(long acc) {
        accountNumber = acc;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setPin(int p) {
        pin = p;
    }
}
