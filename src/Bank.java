import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Bank  {
    private String name;
    private Map<String, Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new HashMap<>();
    }

    public Account register(Customer customer, double initialAmount) {
        String accountId = generateAccountId();
        Account account = new Account(accountId, customer, initialAmount);

        return account;
    }

    public



    private String generateAccountId() {
        return UUID.randomUUID().toString();
    }
}
