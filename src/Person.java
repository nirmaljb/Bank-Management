import java.time.LocalDate;

public class Person {
    private String fullName;
    private LocalDate dob;

    protected Person(String fullName, LocalDate dob) {
        this.fullName = fullName;
        this.dob = dob;
    }

    public String getFullName() {
        return this.fullName;
    }

    public LocalDate getDob() {
        return this.dob;
    }
}
