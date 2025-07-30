public class OnlineOrder extends Product
{
  int quantity;
  int deliveryCharge;

public OnlineOrder(String productName, int price,int quantity,int deliveryCharge)
{
  super(productName,price);
  this.quantity = quantity;
  this.deliveryCharge = deliveryCharge;

}

public static void main(String[] args)
{ 
  OnlineOrder onlineOrder = new OnlineOrder("Realme",15000,2,100);
  onlineOrder.calculateBillAmount();
  onlineOrder.displayProductDetails();

}

public int calculateBillAmount()
{

  return(price * quantity + deliveryCharge);

}
public void displayProductDetails()
{
  System.out.println("ProductName    : " + productName);
  System.out.println("Price          : " + price);
  System.out.println("Quantity       : " + quantity);
  System.out.println("DeliveryCharge : " + deliveryCharge);
  System.out.println("TotalCost      : " + calculateBillAmount());
}
}