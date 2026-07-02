package questions;

//
//Write a Java program to create a base class BankAccount with methods deposit() and withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the withdraw() method in each subclass to impose different withdrawal limits and fees.
class BankAccount {
    protected double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs. " + amount);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Display balance
    public void showBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }
}

// Savings Account
class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 10000) {
            System.out.println("Savings Account: Withdrawal limit is Rs. 10,000.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Savings Account: Withdrawn Rs. " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

// Checking Account
class CheckingAccount extends BankAccount {

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        double fee = 50; // Transaction fee

        if (amount + fee <= balance) {
            balance -= (amount + fee);
            System.out.println("Checking Account: Withdrawn Rs. " + amount);
            System.out.println("Transaction Fee: Rs. " + fee);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(20000);
        CheckingAccount checking = new CheckingAccount(15000);

        System.out.println("Savings Account");
        savings.deposit(5000);
        savings.withdraw(8000);
        savings.showBalance();

        System.out.println();

        System.out.println("Checking Account");
        checking.deposit(2000);
        checking.withdraw(5000);
        checking.showBalance();
    }
}