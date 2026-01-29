import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate parsedDate = LocalDate.parse("2005-12-03");

        Customer csm1 = new Customer("Nirmal Jyoti Biswas", parsedDate, "564221235646");

        Bank sbi = new Bank("State Bank of India");
        Account sbi_account = sbi.register(csm1, 10000, AccountType.Savings);

        sbi_account.withdrawAmount(9500);
        System.out.println(sbi_account.getBalance());

    }
}