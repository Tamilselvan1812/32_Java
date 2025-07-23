public class Book
{
 String title;                                            // Variables: title, author, price
 String author;
 double price;

public Book(String title, String author, double price)    // Constructor to initialize
{
this.title = title;
this.author = author;
this.price = price;
}

public static void main(String[] args)
{

  Book b1 = new Book("Java","JamesGosling",500);           // obj1
  Book b2 = new Book("Javascript","BrendanEich",600);      // obj2
  Book b3 = new Book("css","WiumLie",700);                 // obj3

  b1.printDetails();                                       // method calling statements before discount
  b2.printDetails();
  b3.printDetails();

  b1.applyDiscount(10.0);                                  // method calling statements for applying discount
  b2.applyDiscount(15.0);                              
  b3.applyDiscount(20.0);                                 

  System.out.println("After applying discounts");          // method calling statements after applying discount 
  b1.printDetails();
  b2.printDetails();
  b3.printDetails();

}


public void printDetails()                                // does not return anything so used void
{
    System.out.println("Title : " + title);
    System.out.println("Author: " + author);
    System.out.println("Price : " + price);

}

 public void applyDiscount(double percent)                // does not return anything so used void

 {
      double discountAmount = (price * percent) / 100;
      price = price - discountAmount;
   
 }


}