public abstract class Account {
    protected final String accountNo;
    protected final Customer customer;
    protected double balance = 0.0;

    protected Account(String accountNo, Customer customer, double initialAmount) {
        this.accountNo = accountNo;
        this.customer = customer;
        this.balance = initialAmount;
    }

    public abstract void withdrawAmount(double amount);

    public void depositAmount(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("The Amount should be within Double datatype limit");
        }
        this.balance += amount;
    }

    public double getBalance() {
        return this.balance;
    }
}
