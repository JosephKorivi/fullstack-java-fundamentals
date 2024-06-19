
class BankAccount {
    // Instance variables
    private String accountNumber;
    private double balance;

    // Static variable
    private static String bankName = "Unique Bank";

    // Parameterized constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Default constructor
    public BankAccount() {
        this.accountNumber = "Unknown";
        this.balance = 0.0;
    }

    // Static method
    public static String getBankName() {
        return bankName;
    }

    // Instance method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Main.java
public class BankAccountDemo {
    public static void main(String[] args) {
        // Create instances of BankAccount using different constructors
        BankAccount account1 = new BankAccount("12345678", 1000.0);
        BankAccount account2 = new BankAccount();

        // Display account information using instance method
        account1.displayAccountInfo();
        System.out.println();
        account2.displayAccountInfo();

        // Display bank name using static method
        System.out.println("\nBank Name: " + BankAccount.getBankName());
    }
}
