public class Employee
{
  protected String empName;
  protected int empId;
  protected int basicSalary;

public Employee(String empName,int empId,int basicSalary)
{
   this.empName = empName;
   this.empId = empId;
   this.basicSalary = basicSalary;
 
}

public int calculateSalary()
{
  
   return basicSalary;

}

public void displayDetails()
{
  System.out.println("Employee name :" + empName);
  System.out.println("Employee id :" + empId);
  System.out.println("Employee Salary :" + basicSalary);

}

}