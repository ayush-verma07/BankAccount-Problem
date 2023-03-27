import java.text.NumberFormat;

public class BankAccount {
    
    private String name;
    private double amount;

    public BankAccount(String n) {
        name = n;
        amount = 0.0;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public void withdraw(double num) {
        amount -= num;
    }

    public void deposit(double num) {
        amount += num;
    }

    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(amount);
    }
}