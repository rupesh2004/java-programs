class BankAccount {
    String accountno;
    int balance;

    public BankAccount(String accountno, int balance) {
        this.accountno = accountno;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited Amount : " + amount);
        System.out.println("Updated Balance : " + balance);
    }

    public void withdraw(int amount) {
        balance -= amount;
        System.out.println("Withdraw Amount : " + amount);
        System.out.println("Updated Balance : " + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountno, int balance) {
        super(accountno, balance);
    }

    @Override
    public void withdraw(int amount) {
        if (balance - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("amount cannot be withdraw");
        }
    }
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("12345", 500);
        s.deposit(400);
        s.withdraw(700);
        s.withdraw(100);
    }
}
