public class BankAccount{
    String accountHolder;
    double balance;

    void deposit(double amount) 
    {
        balance += amount;
    }

    void withdraw(double amount) 
    {
        if (amount <= balance)
            {
                balance -= amount;
            }
        else
            {
                System.out.println("Insufficient Balance!");
            }
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountHolder = "Bhoomika";
        acc.balance = 1000;

        acc.deposit(500);
        acc.withdraw(300);
        acc.display();
    }
}
