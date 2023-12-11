//Task -- 3
import java.util.Scanner;

public class ATM {

    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the ATM!");
        while (true) {
            System.out.println("\n1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check balance");
            System.out.println("4. Exit\n");
            System.out.print("Please choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private void withdraw() {
        System.out.print("\nPlease enter the amount you want to withdraw: ");
        double amount = scanner.nextDouble();
        if (account.getBalance() < amount) {
            System.out.println("Insufficient funds.");
        } else {
            account.withdraw(amount);
            System.out.println("Successfully withdrawn Rs. " + amount + ".");
        }
    }

    private void deposit() {
        System.out.print("\nPlease enter the amount you want to deposit: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.println("Successfully deposited Rs. " + amount + ".");
    }

    private void checkBalance() {
        System.out.println("\nYour current balance is: Rs. " + account.getBalance());
    }

    public static void main(String[] args) {
        // Create a new BankAccount with an initial balance
        BankAccount account = new BankAccount(100.00);

        // Create a new ATM object and link it to the account
        ATM atm = new ATM(account);

        // Start the ATM
        atm.start();
    }
}

class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
