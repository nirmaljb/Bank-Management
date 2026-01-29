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

    public String getFullName() {
        return this.fullName;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    public String getAadhaarCard() {
        return this.aadhaarNumber;
    }
}
