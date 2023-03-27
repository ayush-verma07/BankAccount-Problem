public class BondAccount extends SavingsAccount{
    
    private int years;

    public BondAccount(String n, double i, double a) {
        super(n, i);
        deposit(a);
        years = 5;
    }

    public int getTimeLeft() {
        return years;
    }

    public void addInterest() {
        super.addInterest();
        years--;
    }

    public void withdraw(int num) {
        int y = getTimeLeft();
        double dollar = 0;
        if(y > 0) {
            switch (y) {
            case 5:
                dollar = (num * 1.25);
                break;
            case 4:
                dollar = (num * 1.2);
                break;
            case 3:
                dollar = (num * 1.15);
                break;
            case 2:
                dollar = (num * 1.1);
                break;
            case 1:
                dollar = (num * 1.05);
                break;
        }
        }
        else {
            dollar = num;
        }
        super.withdraw(dollar);
    }
}