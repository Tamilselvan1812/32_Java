public class SuperMarket  
{

static String shopName = "Rajeshwari";                      //class information
String prodName;                                            //object information and global variable
int price;

public static void main(String[] args) 
{

//    int i;
//    System.out.println(i);                                // for local variables there is default datatype value
    
//    SuperMarket product2 = new SuperMarket("xyz",1000);   //object info is given inside ()
//
//    System.out.println(product1.prodName) ;               // it will print default values of string and int
//    System.out.println(product1.price) ; 
//
//    System.out.println(product2.prodName) ; 
//    System.out.println(product2.price) ;  

// compile time polymorphism  - Method overloading
// same method name with diff no.of.args  
// diff type of args 

  SuperMarket product1 = new SuperMarket();
  product1.buy(10); 
  product1.buy(15,100); 
  product1.buy(10.5);
  product1.buy(10.5f);

  System.out.println(10);        // all datatypes can be printed using println method 
  System.out.println(10.5f); 
  System.out.println("hii"); 




}

 void buy(double dd){
    System.out.println("buy one double args "+dd);        //we can store small datatype inside big datatype
}
 void buy(int no)
{
     System.out.println("buy one args "+no); 
}

 void buy(int no1,int no2)
{
    System.out.println("buy two args "+no1 +" "+no2);
}



}
