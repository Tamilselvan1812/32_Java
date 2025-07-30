public class BankAccount
{
  int accountNumber;
  String holderName;
  int balance;

public BankAccount(int accountNumber,String holderName,int balance)
{
  this.accountNumber = accountNumber;
  this.holderName = holderName;
  this.balance = balance;

}

public double calculateInterest()
{
   return 0;

}

public void displayAccountInfo()
{
  System.out.println("AccountNumber :" + accountNumber);
  System.out.println("HolderName :" + holderName);
  System.out.println("Balance :" + balance);
}

}