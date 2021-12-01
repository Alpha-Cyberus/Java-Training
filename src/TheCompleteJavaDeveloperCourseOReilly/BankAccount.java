package TheCompleteJavaDeveloperCourseOReilly;

public class BankAccount {
    private final String owner;
    private int balance;

    public BankAccount(String owner) {
        this(owner, 0);
    }

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Value for balance MUST be greater than 0.");
        }
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Not enough money! Deposit at least 1.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <=balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Withdraw amount must be more than 0 and less than balance. Current balance is still: " + balance);
        }
    }

    public String getOwner() { return owner; }
    public int getBalance() { return balance; }
}
