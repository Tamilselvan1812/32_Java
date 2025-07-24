package salem;
public class Parent
{
public Parent(){
    System.out.println("parent-const");                 // default constructor
}
public Parent(int i){
    System.out.println("parent-one arg - const");       // one argument constructor
}
public void useLaptop()                                 // non static method
{
    System.out.println("using laptop");
}
}
