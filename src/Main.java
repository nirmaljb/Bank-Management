import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate parsedDate = LocalDate.parse("2005-12-03");

        Customer csm1 = new Customer("Nirmal Jyoti Biswas", parsedDate, "5642-6952-5646");

        Bank sbi = new Bank("State Bank of India");
        Account sbi_account = sbi.register(csm1, 10000);

        sbi_account.withdrawAmount(6000);


        double account_balance = sbi_account.getBalance();
        System.out.println(account_balance);
    }
}