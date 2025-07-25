public class Products 
{
    String productName;
    double price;

    public Products(String productName, double price)
   {
        this.productName = productName;
        this.price = price;
            
   }

    public void displayProductDetails()
   {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
    }

    
}
