public class AccountRunner {
    
    public static void main(String[] args) {
        BankAccount Dave = new BankAccount("Dave");
        Dave.deposit(500.0);
        System.out.println(Dave.toString());
        Dave.withdraw(150.43);
        System.out.println(Dave.toString());
        SavingsAccount HeidiSaves = new SavingsAccount("Heidi", 0.0035);
        BondAccount HeidiBonds = new BondAccount("Heidi", 0.025, 5000.00);
        HeidiSaves.deposit(5000);
        for(int i = 120; i > 0; i--) {
              HeidiSaves.addInterest();
           if(i % 12 == 0) {
              HeidiBonds.addInterest();
              HeidiSaves.withdraw(200);
              HeidiBonds.withdraw(200);
           }
        }
        System.out.println(HeidiSaves.toString());
        System.out.print(HeidiBonds.toString());
    }
}
