package theCompleteJavaDeveloperCourseOReilly;

public class Proj7_1_BankAccountDemo {
    public static void main(String[] args) {
        BankAccount myBank = new BankAccount("Luffy", 15);

        System.out.println(myBank.getBalance());

        myBank.deposit(50);

        myBank.withdraw(250);
    }
}
