package salem;
public class Child extends Parent
{
public Child(){
    super(10);                             // new Parent(10);
    System.out.println("child-cosnt");
}
public static void main(String[] args)
{
    Child ch = new Child();               // An object of Child class acting as an object of Parent class - inheritance

//    Parent pp = new Parent();           // without extends keyword we have to create object
//    pp.useLaptop();

    ch.play();                             //  this super
    ch.useLaptop();                        //  this() super() 
}
public void play()
{
    System.out.println("playing");
}

}
