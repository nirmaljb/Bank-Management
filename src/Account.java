import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

interface AccountModel {
    void withdrawAmount(double amount);
    void depositAmount(double amount);
    double getBalance();
}

public abstract class Account implements AccountModel {
    protected final String accountNo;
    protected final Customer customer;
    protected double balance = 0.0;

    protected List<Transactions> transactions = new ArrayList<>();

    protected Account(String accountNo, Customer customer, double initialAmount) {
        this.accountNo = accountNo;
        this.customer = customer;
        this.balance = initialAmount;
    }

    public abstract void withdrawAmount(double amount);

    public void depositAmount(double amount) {
        if(amount < 0) {
            throw new IllegalArgumentException("The Amount should be within Double datatype limit");
        }
        this.balance += amount;

        String uuid = UUID.randomUUID().toString();
        LocalDateTime currentTime = LocalDateTime.now();
        transactions.add(new Transactions(uuid, accountNo, amount, TransactionType.DEPOSIT, currentTime));
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountNo() {
        return this.accountNo;
    }

    public List<Transactions> getTransactions() {
        return List.copyOf(transactions);
    }
}
