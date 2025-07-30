public class SavingsAccount extends BankAccount
{
 double interestRate;

public SavingsAccount(int accountNumber,String holderName,int balance,int interestRate)
{
  super(accountNumber, holderName, balance);
  this.interestRate = interestRate;

}

public static void main(String[] args)
{
   SavingsAccount savingsAccount = new SavingsAccount(12345,"Tamil",10000,10);
   savingsAccount.calculateInterest();
   savingsAccount.displayAccountInfo();


}
public double calculateInterest()
{
   return(balance * interestRate / 100);

}
 
public void displayAccountInfo()
{
  System.out.println("AccountNumber :" + accountNumber);
  System.out.println("HolderName :" + holderName);
  System.out.println("Balance :" + balance);
  System.out.println("Interest :" + calculateInterest());
  
}


}