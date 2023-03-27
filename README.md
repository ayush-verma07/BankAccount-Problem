# BankAccount-Problem

You are going to create series of class to help solve a problem.

**First you going to create a BankAccount Class**

It will have two PIV's

A String to store the name of the account owner.
A double to store the dollar amount of the account.

**Constructor:**

The constructor will only receive the name of the account owner and set the amount in the account to 0.

**Methods:**

getName() - will return the name of the account owner

getAmount() - will return the amount in the account.

withdraw(double num) - will subtract the parameter num from the amount in the account. Will not return anything.

deposit(double num) - will add this parameter num to the amount in the account. Will not return anything.

toString() - will return a string representation of the amount in the account.  We are going to use the NumberFormat class to format out total correctly to a actual dollar figure.  I have already imported the NumberFormat Class in for you. Just add the two lines of code to the method and it will work.

NumberFormat formatter = NumberFormat.getCurrencyInstance();

return formatter.format(amount);

**Test the class:**

In the Runner class create an account for "Dave".

Deposit $500 into his account.  Then, using the toString() method print up the account.

Withdraw 150.43 from his account.  Then, using the toString() method print up the account.

**Now complete the SavingsAccount class.  The SavingsAccount class is a subclass of the BankAccount class.**

A savings account works like a regular bank account, but earns a small bit of interest every month.

Create the following additional PIV

It should have a double to store the interest rate of the account.

**Constructor**

Should only have 1 constructor that receives the name of the account owner and the interest rate.

**Methods**

addInterest() - This method will need to make calls to the super class to figure out how much interest the account earned, then add it back into the account.

**Create the BondAccount class.  The BondAccount class is a subclass of the SavingsAccount class.**

The bond account works like a SavingsAccount class but has a 5 year maturity date.  It will have a larger interest rate but will only be applied once a year. Also it must start with an amount.

**PIV's**

It will have one additional PIV int that tracks the years.

**Constructor**

The constructor should receive the name, interest rate and an amount to start the account off with.  You will need to call the deposit method from the constructor to add the money in.  It should also set the PIV for years to 5.

**Methods**

getTimeLeft() - will return the PIV that represents years left of the account

addInterest() - will override the method the method and subtract one year off when the method is called.

withdraw() - will override the method with will deduct a penalty amount for withdrawing before the end of the 5 years.  If they withdraw when it still has 5 years left it should take out and additional 25% of how much they are withdrawing.  So if they withdraw $100 it would take out $125.  Every year it will have a 5% smaller penalty till the number of years reaches 0. So 4 years would be 20%, 3 years 15%, 2 years 10% and 1 year 5%. It is possible for years to be negative with the way the program is written, so make sure anything smaller then zero no penalty is applied but the money is still withdrawn.

 

**Now to use the classes**
Heidi notices that her bank has a savings account that has a .35% interest rate that is added in every month.  However there is a Bond account that has a 2.5% interest rate added yearly.  She has $5000 she wants to deposit and wonders which account would be better over the next 10 years.  The thing is at the end of every year she will be withdrawing $200 to cover some expenses.  She will wait till the interest hits the account before removing the money.

Using the classes you just build find out how much Heidi will have in a Savings account and Bond account, to see which one she should choose.

Just print the totals in each account.

_I answered the problem above in the AccountRunner class._
