public class Employee1 implements OfficeRules,TrafficRules         // the interface must be "implemented" by another class with the implements keyword and we can use
{                                                                  // achieve multiple inheritance via interface....using commas
public static void main(String[] args)
{
    Employee1 emp = new Employee1();                               // static binding
    emp.leisure();
    emp.helmet();

//  emp.comeOnTime();
//  emp.getSalary();
//  emp.takeLeave();


    OfficeRules manager = new Employee1();                        // dynamic binding
    manager.comeOnTime();
    manager.getSalary();
    manager.takeLeave();
//  manager.leisure();                   
}

public void leisure()                                             // On implementation of an interface, you must override all of its methods
{
    System.out.println("chatting...");
}
public void comeOnTime()
{
     System.out.println("9.00AM");
}
public void getSalary()
{
    System.out.println("15000");
}
public void takeLeave()
{
    System.out.println("will inform");
}
public void helmet()
{
 System.out.println("helmet");
}

}
