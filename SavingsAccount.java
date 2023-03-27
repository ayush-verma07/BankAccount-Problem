public class SavingsAccount extends BankAccount{
    
    private double interest;

    public SavingsAccount(String n, double i) {
        super(n);
        interest = i;
    }

    public void addInterest() {
        double x = getAmount() * (interest);
        deposit(x);
    }
}