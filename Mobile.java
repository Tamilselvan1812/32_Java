package electronics;
public class Mobile                     //sameclass - private,public,protected,default
{
 
 public Mobile()
 {  
       System.out.println("Mobile constructor");        //default constructor is always in default access modifier
    }

public static void main(String[] args)
{
    Mobile mob = new Mobile();
    mob.call();
    mob.satellitecall();
}
protected void call()
{
    System.out.println("calling");
}

protected void satellitecall()
{
    System.out.println("satellitecall");
}
}
