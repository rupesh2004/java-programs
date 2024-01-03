class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited amount: " + amount);
        System.out.println("Updated balance: " + balance);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn amount: " + amount);
        System.out.println("Updated balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal failed. Account balance should not fall below $100.");
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("123456", 500, 0.05);
        savingsAccount.deposit(200);
        savingsAccount.withdraw(50);
        savingsAccount.withdraw(400);
    }
}