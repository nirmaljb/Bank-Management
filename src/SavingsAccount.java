public class SavingsAccount extends Account{
    final double MINIMUM_AMOUNT = 1000;

    public SavingsAccount(String accountNo, Customer customer, double initialAmount) {
        super(accountNo, customer, initialAmount);
    }

    @Override
    public void withdrawAmount(double amount) {
        if(amount <= 0 || this.balance - amount < MINIMUM_AMOUNT) {
            throw new IllegalArgumentException("Minimum balance violated. You need to have ₹" + MINIMUM_AMOUNT + " in your account.");
        }
        this.balance -= amount;
    }
}
