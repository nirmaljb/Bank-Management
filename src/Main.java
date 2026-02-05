import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter date of birth (yyyy-MM-dd): ");
        String dobString = scanner.nextLine();
        LocalDate parsedDate = LocalDate.parse(dobString);

        System.out.print("Enter Aadhaar Card: ");
        String aadhaarCard = scanner.nextLine();

        Customer csm1 = new Customer(customerName, parsedDate, aadhaarCard);

        System.out.print("Enter bank name: ");
        String bankName = scanner.nextLine();
        Bank bank = new Bank(bankName);

        System.out.print("Do you want to deposit any initial amount initial deposit: ");
        double initialAmount = scanner.nextDouble();

        System.out.print("Enter account type (1 for Savings, 2 for Current): ");
        int accountTypeChoice = scanner.nextInt();
        AccountType accountType = (accountTypeChoice == 1) ? AccountType.Savings : AccountType.Current;

        Account account = bank.register(csm1, initialAmount, accountType);

        System.out.print("Do you want to deposit any further ? (Specify the amount): ");
        double depositAmount = scanner.nextDouble();
        account.depositAmount(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdrawAmount(withdrawAmount);

        System.out.println("\nFinal Balance: " + account.getBalance());
    }
}