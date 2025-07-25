public class Salary extends Employee
 {
    int bonus;                                                                 //Instance Variable

    public Salary(String empName, int empId, int basicSalary, int bonus)       //constructor is called when salary object is created
  {
        super(empName, empId, basicSalary);                                    //This calls the constructor of the parent class (Employee) and initialize values
        this.bonus = bonus;
    }

   
    public static void main(String[] args) {
      
        Salary emp = new Salary("Tamil", 12345, 15000, 2000);
        emp.displaySalarySlip();
    }



 public int calculateTotalSalary()                                            // Returns the sum of basic salary and bonus
  {
         return(basicSalary + bonus);
        
    }

  public void displaySalarySlip()
 {
        displayEmployeeDetails();                                             //This method is inherited from Employee.
        System.out.println("Bonus         : " + bonus);
        System.out.println("Total Salary  : " + calculateTotalSalary());
    
      
    }
}
