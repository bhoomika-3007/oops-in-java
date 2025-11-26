class BankDetails {
    final String bankName = "State Bank of India";  // final variable (constant)
    double balance;

    BankDetails(double balance) {
        this.balance = balance;
    }

    // final method (cannot be overridden)
    final void showBankName() {
        System.out.println("Bank: " + bankName);
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankDetails {

    SavingsAccount(double balance) {
        super(balance);
    }

    // Not allowed — showBankName() is final
    // void showBankName() { }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
}

public class TestFinal2 {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(5000);

        acc.showBankName();   // final method from parent
        acc.showBalance();
        acc.deposit(2000);
        acc.showBalance();

        // Not allowed — bankName is final
        // acc.bankName = "HDFC";
    }
}
