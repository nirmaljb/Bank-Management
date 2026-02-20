import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.println("Enter date of birth (yyyy-MM-dd): ");
        String dobString = scanner.nextLine();
        LocalDate parsedDate = LocalDate.parse(dobString);

        System.out.println("Enter Aadhaar Card: ");
        String aadhaarCard = scanner.nextLine();

        Customer csm1 = new Customer(customerName, parsedDate, aadhaarCard);

        System.out.println("Enter bank name: ");
        String bankName = scanner.nextLine();
        Bank bank = new Bank(bankName);
        double initialAmount = 0.0;
        boolean checker = true;

        System.out.println("Enter account type (1 for Savings, 2 for Current): ");
        int accountTypeChoice = scanner.nextInt();
        AccountType accountType = (accountTypeChoice == 1) ? AccountType.Savings : AccountType.Current;

        System.out.println("Do you want to deposit any initial amount initial deposit (y/n): ");
        while(checker) {
            char choice = scanner.next().charAt(0);
            choice = Character.toLowerCase(choice);

            switch(choice) {
                case 'y':
                    System.out.println("Enter the amount: ");
                    initialAmount = scanner.nextDouble();
                    checker = false;
                    break;
                case 'n':
                    System.out.println("Thanks for visiting the " + bank.getBankName());
                    System.exit(0);
                    checker = false;
                    break;
                default:
                    System.out.println("Incorrect option, Do you want to deposit any initial amount initial deposit (y/n): ");
            }
        }
            
        Account account = bank.register(csm1, initialAmount, accountType);

        while(true) {
            System.out.println("What do you want to do?");
            System.out.println("Press 1 to Check Balance");
            System.out.println("Press 2 to Deposit Amount");
            System.out.println("Press 3 to Withdraw Amount");
            System.out.println("Press 4 to Close Amount");
            System.out.println("Press 5 to exit");

            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The Balance is : " + account.getBalance());
                    break;
                case 2:
                    System.out.println("Enter the Amount that you want to deposit : ");
                    double amount = scanner.nextInt();
                    account.depositAmount(amount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdrawAmount(withdrawAmount);
                    break;
                case 4:
                    checker = true;
                    System.out.println("Are you sure that you want to close your account (y/n) ? : ");
                    while(checker) {
                    char ch = scanner.next().charAt(0);
                    switch (ch) {
                        case 'y':
                            bank.closeAccount(account.getAccountNo());
                            System.out.println("Your account has been closed.");
                            System.exit(0);
                            break;
                        case 'n':
                            checker = false;
                            break;
                        default:
                            System.out.println("Incorrect Option selected");
                    }
                }
                    break;
                case 5:
                    System.out.println("Thanks for visiting the " + bank.getBankName());
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, selected");
            }
        }
    }
}