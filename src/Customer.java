import java.time.LocalDate;

public class Customer {
    private String fullName;
    private LocalDate dob;
    private String aadharNumber;

    public void create(String fullName, LocalDate dob, String aadharNumber) {
        this.fullName = fullName;
        this.dob = dob;
        this.aadharNumber = aadharNumber;
    }

    public String getFullName() {
        return this.fullName;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    public String getAadharCard() {
        return this.aadharNumber;
    }
}
