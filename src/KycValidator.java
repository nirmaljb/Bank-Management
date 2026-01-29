import java.time.LocalDate;
import java.time.Period;

public class KycValidator {

    public static void validate(Customer customer) {
        validateAge(customer.getDob());
        validateAadhaar(customer.getAadhaarCard());
    }

    private static void validateAge(LocalDate dob) {
        if(Period.between(dob, LocalDate.now()).getYears() < 18) {
            throw new IllegalArgumentException("Customer must be 18+");
        }
    }

    private static void validateAadhaar(String aadhaarCard) {
        if (!aadhaarCard.matches("\\d{12}")) {
            throw new IllegalArgumentException("Invalid Aadhaar number");
        }
    }
}
