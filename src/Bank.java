import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Bank  {
    private String bankName;
    private Map<String, Account> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new HashMap<>();
    }

    public Account register(Customer customer, double initialAmount) {
        KycValidator.validate(customer);
        String accountNo = generateAccountNo();
        Account account = new Account(accountNo, customer, initialAmount);
        accounts.put(accountNo, account);
        return account;
    }

    private boolean accountExists(String accountId) {
        return accounts.get(accountId) != null;
    }

    private Account getAccount(String accountId) {
        if(!accountExists(accountId)) {
            throw new IllegalArgumentException("No Account found with this id");
        }
        return accounts.get(accountId);
    }

    public void transfer(String senderId, String receiverId, double amount) {
        Account senderAccount = getAccount(senderId);
        Account receiverAccount = getAccount(receiverId);

        senderAccount.withdrawAmount(amount);
        receiverAccount.depositAmount(amount);
    }

    public void closeAccount(String accountId) {
        Account response = getAccount(accountId);
        if(response.getBalance() > 0) {
            throw new IllegalStateException("Balance must be zero inorder to close the account.");
        }
        accounts.remove(accountId);
    }

    private String generateAccountNo() {
        return UUID.randomUUID().toString();
    }
}
