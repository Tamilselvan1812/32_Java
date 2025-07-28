public class PrintClass
{
public static void main(String[] args)
{
  PrintClass pc = new PrintClass();            
  pc.display();                      //method overloading
  pc.display("abc"); 
  pc.display(10);

  System.out.println(10);           //println is default method 
  System.out.println();             //method overloading
  System.out.println("abc");

}

public void display(String s)
{

}
public void display()
{

}

public void display(int i)
{

}
}