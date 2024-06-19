import java.util.Scanner;

public class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful. New balance: " + balance);
    }

    void withdraw(double amount) {
        if (balance - amount < 500) {
            System.out.println("Minimum balance of 500 Rs/- required. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
        }
    }

    void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount("123456", "ACC1", 50000);

        System.out.print("Enter the amount to deposit: ");
        double depositAmount = input.nextDouble();
        bankAccount.deposit(depositAmount);

        System.out.print("Enter the amount to withdraw: ");
        double withdrawAmount = input.nextDouble();
        bankAccount.withdraw(withdrawAmount);

        bankAccount.displayInfo();
        input.close();
    }
}
