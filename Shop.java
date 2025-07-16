public class Shop
{

    static String shopName = "seenu";
    String product_name = "pen";
    int product_price = 10;

public static void main(String[] args)
{
    Shop product = new Shop();
     //method calling statement  
   String greeting =  product.buy();
   System.out.println(greeting);
     //product.sell(greeting);

}

String buy()
{
    System.out.println("buy method");
    return "thank you";
}

}

//static and non-static
//object
//method
//return type
//local and global variable


