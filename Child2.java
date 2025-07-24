package chennai;          
import salem.Parent;                      // for different packages we have to import that package of different class
public class Child2
{

public static void main(String[] args)
{
    Child2 ch = new Child2();
    Parent pp = new Parent();            // we can create object for different classes and we will access methods from that class
    pp.useLaptop();
    ch.study(); 
}

public void study()
{
    System.out.println("studying");
}

}
