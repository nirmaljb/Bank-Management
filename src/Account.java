public class Account {
    private String accountId;
    private Customer customer;
    private double balance = 0.0;

    protected Account(String accountId, Customer customer, double initialAmount) {
        this.accountId = accountId;
        this.customer = customer;
        this.balance = initialAmount;
    }

    protected String getAccountId() {
        return this.accountId;
    }

    private void withdrawAmount(double amount) {
        if(amount > this.balance) {
            throw new IllegalArgumentException("Amount should be within the bank balance");
        }
    }
}
