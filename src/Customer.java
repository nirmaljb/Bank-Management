import java.time.LocalDate;

public class Customer {
    private final String fullName;
    private final LocalDate dob;
    private final String aadhaarNumber;

    public Customer(String fullName, LocalDate dob, String aadhaarNumber) {
        this.fullName = fullName;
        this.dob = dob;
        this.aadhaarNumber = aadhaarNumber;
    }

    protected String getFullName() {
        return this.fullName;
    }

    protected LocalDate getDob() {
        return this.dob;
    }

    protected String getAadhaarCard() {
        return this.aadhaarNumber;
    }
}
