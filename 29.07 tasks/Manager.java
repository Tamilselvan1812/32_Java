public class Manager extends Employee
{
   int bonus;

public Manager(String empName,int empId,int basicSalary,int bonus)
{
   super(empName,empId,basicSalary);
   this.bonus = bonus;
}

public static void main(String[] args)
{
   Manager manager = new Manager("Tamil",12345,10000,1000);
   manager.calculateSalary();
   manager.displayDetails();	
  }

public int calculateSalary()
{
  
 return basicSalary + bonus;                                   // basicSalary = basicSalary + bonus;   original basicSalary value is overridden

}

public void displayDetails()
{
  System.out.println("Employee name :" + empName);
  System.out.println("Employee id :" + empId);
  System.out.println("Employee Salary :" + basicSalary);
  System.out.println("Employee bonus :" + bonus);
  System.out.println("Total Salary :" + calculateSalary());



}
}