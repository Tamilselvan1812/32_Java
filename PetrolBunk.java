public class PetrolBunk
{
                                           // pojo - 100 to 200
  private int price = 101;                 // pojo class = all variables declared in private
  private int discount = 10;
 
public int getDiscount()
{
    return this.discount;                  // getter method = meaningfull name
}
public int getPrice()
{
   return this.price;
}
public void setPrice(int price)            // setter method
{
    if(price >= this.price)
        this.price = price;                // this.price = 101,price = new price
}
}
