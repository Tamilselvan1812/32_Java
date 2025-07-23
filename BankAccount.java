public class BankAccount{

int accountNumber;
String holderName;
int balance;

public BankAccount(int accountNumber,String holderName, int balance)
{
  this.accountNumber = accountNumber;                      //Instance variables: accountNumber, holderName, balance
  this.holderName = holderName;                            //Constructor to initialize account
  this.balance = balance;


}

public static void main(String[] args)
{
   BankAccount a1 = new BankAccount(12345,"Tamil",200);      //obj1
        
         a1.deposit(300);                                    //method calling statements
         int currentBalance1 = a1.balance;                   //storing return variable
         a1.displayBalance();
         
         a1.withdraw(100);                     
         a1.displayBalance();                  

   BankAccount a2 = new BankAccount(67890,"selvan",400);     //obj2

        a2.deposit(200);                                     //method calling statements
        int currentBalance2 = a2.balance; 
        a2.displayBalance();


        a2.withdraw(150);
        a2.displayBalance();
}

public int deposit(int amount)
{
    balance = balance + amount;                  //it returns balance so int datatype is used
    return balance;
    
}
public void withdraw(int amount)                 //it doesnot return anything so used void
{
     balance = balance - amount;
     
}
public void displayBalance()
{       
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Current Balance: " + balance);
}

}