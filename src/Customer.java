import java.time.LocalDate;

public class Customer extends Person {
    private final String aadhaarNumber;

    public Customer(String fullName, LocalDate dob, String aadhaarNumber) {
        super(fullName, dob);
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getAadhaarCard() {
        return this.aadhaarNumber;
    }
}
