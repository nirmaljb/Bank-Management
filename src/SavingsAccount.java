import java.time.LocalDateTime;
import java.util.UUID;

public class SavingsAccount extends Account {
    private final double MINIMUM_AMOUNT = 1000;
    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(String accountNo, Customer customer, double initialAmount) {
        super(accountNo, customer, initialAmount);
    }

    @Override
    public void withdrawAmount(double amount) {
        if(amount <= 0 || this.balance - amount < MINIMUM_AMOUNT) {
            throw new IllegalArgumentException("Minimum balance violated. You need to have ₹" + MINIMUM_AMOUNT + " in your account.");
        }
        this.balance -= amount;

        String uuid = UUID.randomUUID().toString();
        LocalDateTime currentTime = LocalDateTime.now();
        transactions.add(new Transactions(uuid, accountNo, amount, TransactionType.WITHDRAW,currentTime));
    }

    public void applyMonthlyInterest() {
        this.balance += this.balance * INTEREST_RATE / 12;
    }
}
