public class Son extends Mother
{

public static void main(String[] args)
{

  Son son = new Son();                 // so we create object in child class
  son.study();
  son.workHard();
  son.motivate();
}

public void study()                  // The body is provided by the subclass
{
  System.out.println("BE");             
}
 
}