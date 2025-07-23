public class Product{
  
String productName;                                               //Variables: productName, price
int price ;

public Product(String productName, int price)                    // Constructor to initialize values
{
 this.productName = productName;
 this.price = price;

}

  

public static void main(String[] args)
{

  Product p1 = new Product("pen",100);
  float discountPrice = p1.getDiscountPrice(10.0f);             // method calling statement and storing the return value
  System.out.println("Discounted price :" + discountPrice );
  

}

public float getDiscountPrice(float discountPercentage)          // it is returning floatvalue so we used float
{
   float discountAmount = (price * discountPercentage) / 100;    // we get discount amount
   float finalPrice = price - discountAmount;                    // we get finalPrice
   return finalPrice;
   
}

}