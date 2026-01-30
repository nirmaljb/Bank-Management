import java.time.LocalDate;
import java.time.LocalDateTime;

enum TransactionType {
    WITHDRAW,
    DEPOSIT,
    TRANSFER_IN,
    TRANSFER_OUT,
}

public class Transactions {
    private final String id;
    private final String accountNo;
    private final double amount;
    private final TransactionType type;
    private final LocalDateTime timestamp;

    public Transactions(String id, String accountNo, double amount, TransactionType type, LocalDateTime timestamp) {
        this.id = id;
        this.accountNo = accountNo;
        this.amount = amount;
        this.type = type;
        this.timestamp = timestamp;
    }
}
