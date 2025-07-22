public class Store
{
  static String storeName = "Tamil";
  String prodName;
  int price;

public Store(String s,int x)                       //constructor - default,argument
{                                                  //no return type,same name as class name
  prodName = s;                                    //called automatically when object is created -default(JVM)
  price = x;                                       //used for initializing object specific values(non static)
}                                                  //if argument is passed - argument constructor


public Store()
{
                                                  // zero argument constructor
}

public static void main(String[] args)
{

  System.out.println(Store.storeName);           //static variable is printed using class name,object name
   
 Store prod1 = new Store("abc",100);             //object 1
 System.out.println(prod1.prodName);          
 System.out.println(prod1.price);

 Store prod2 = new Store("xyz",1000);            //object 2
 System.out.println(prod2.prodName);
 System.out.println(prod2.price);
 
 Store prod3 = new Store();                      //object 3
 
}



}
