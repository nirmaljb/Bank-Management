public class CurrentAccount extends Account {
    private final double MAXIMUM_OVERDRAFT = 5000;
    public CurrentAccount(String accNo, Customer customer, double initialAmount) {
        super(accNo, customer, initialAmount);
    }

    @Override
    public void withdrawAmount(double amount) {
        if(this.balance - amount > -MAXIMUM_OVERDRAFT) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        this.balance -= amount;
    }
}
