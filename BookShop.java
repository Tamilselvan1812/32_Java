public class BookShop
{
    static String shopName = "payilagam";
    String bookName;
    int price;

//this refers to current object
public BookShop(String bookName, int price){
    this.bookName = bookName;
    this.price = price;
}

public static void main(String[] args)
{
    BookShop book1 = new BookShop("tamil",100);
//    book1.bookName = "tamil";
//    book1.price = 100;

    BookShop book2 = new BookShop("english",120);
//    book2.bookName = "english";
//    book2.price  = 120;
//    System.out.println(bookName);
//    System.out.println(price);
    book2.buy();
}

public void buy(){
    System.out.println(bookName);
    System.out.println(price);
}

}
