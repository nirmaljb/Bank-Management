public class CurrentAccount extends Account {

    public CurrentAccount(String accNo, Customer customer, double initialAmount) {
        super(accNo, customer, initialAmount);
    }

    @Override
    public void withdrawAmount(double amount) {
        if (amount <= 0 || amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }
}
