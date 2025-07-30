public class Product 
{

 String productName;
 int price;

public Product(String productName, int price)
{
  this.productName = productName;
  this.price = price;

}

public void displayProductDetails()
{
  System.out.println("ProductName : " + productName);
  System.out.println("Price : " + price);

}
}