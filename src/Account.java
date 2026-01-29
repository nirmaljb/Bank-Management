public class Account {
    private String accountNo;
    private Customer customer;
    private double balance = 0.0;

    protected Account(String accountNo, Customer customer, double initialAmount) {
        this.accountNo = accountNo;
        this.customer = customer;
        this.balance = initialAmount;
    }

    protected void getCustomerDetails() {
        System.out.println("Full Name : " + customer.getFullName());
        System.out.println("Date of Birth : " + customer.getDob());
    }

    protected String getAccountNo() {
        return this.accountNo;
    }

    protected void withdrawAmount(double amount) {
        if (amount > this.balance || amount < 1000) {
            throw new IllegalArgumentException("Amount should be within the bank balance");
        }
        this.balance -= amount;
    }

    protected void depositAmount(double amount) {
        if(amount >= Double.MAX_VALUE) {
            throw new IllegalArgumentException("The Amount should be within Double datatype limit");
        }
        this.balance += amount;
    }

    protected double getBalance() {
        return this.balance;
    }
}
