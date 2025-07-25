public class Employee
{
   String empName;
   int empId;
   int basicSalary;

public Employee(String empName, int empId, int basicSalary)     // constructor for initialize variables
{ 
   this.empName = empName;
   this.empId = empId;
   this.basicSalary = basicSalary;

}

public static void main(String[] args)                           // only one main method will run for practice only i used main method here
{

   Employee first = new Employee("Tamil",12345,15000);
   first.displayEmployeeDetails();

}

public void  displayEmployeeDetails()
{
  System.out.println("Employee Name   : " + empName);
  System.out.println("Employee Id     : " + empId);
  System.out.println("Employee salary : " + basicSalary);
}
}