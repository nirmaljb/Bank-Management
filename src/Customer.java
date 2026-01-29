import java.time.LocalDate;

public class Customer {
    private String fullName;
    private LocalDate dob;
    private String aadharNumber;

    public Customer(String fullName, LocalDate dob, String aadharNumber) {
        this.fullName = fullName;
        this.dob = dob;
        this.aadharNumber = aadharNumber;
    }

    protected String getFullName() {
        return this.fullName;
    }

    protected LocalDate getDob() {
        return this.dob;
    }

    protected String getAadharCard() {
        return this.aadharNumber;
    }
}
