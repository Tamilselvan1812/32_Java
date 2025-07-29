public class Practice
{
     String prod_name;
     int price;

public Practice(String prod_name,int price)
{
    this(10);                                    // used for current class constructor
    this.prod_name = prod_name;
    this.price = price;
}

public Practice(int i)
{

}
    
public static void main(String[] args)
{
    Practice prod1 = new Practice("abc",1000);
    Practice prod2 = new Practice("xyz",100);
    Practice.buy(prod2);
  
}
public static void buy(Practice prod2)
{


}
}