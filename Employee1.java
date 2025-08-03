public class Employee1 implements OfficeRules         // the interface must be "implemented" by another class with the implements keyword
{

public void comeOnTime()
{
  System.out.println("10am");                        // On implementation of an interface, you must override all of its methods
}

public void getSalary()
{

}

public void takeLeave()
{

}

public static void main(String[] args)
{
  
  Employee1 em = new Employee1();
  em.comeOnTime();

}

}