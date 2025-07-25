
public class OnlineOrder extends Products
 {
    int quantity;
    double deliveryCharge;

    public OnlineOrder(String productName, double price, int quantity, double deliveryCharge)
     {
        super(productName, price);                                                             // super() - Call parent constructor 
        this.quantity = quantity;
        this.deliveryCharge = deliveryCharge;
     
    }

    
    public static void main(String[] args)
     {
        OnlineOrder order = new OnlineOrder("Smartphone", 18000, 1, 150);
        order.showInvoice();
    }

  public double calculateBillAmount() 
    {
        return (price * quantity) + deliveryCharge;
    }

    public void showInvoice() 
 {
        displayProductDetails();                                                                   //inherited  from parent class
        System.out.println("Quantity        : " + quantity);
        System.out.println("Delivery Charge : " + deliveryCharge);
        System.out.println("Total Bill      : " + calculateBillAmount());
    }
}
