public class Children extends Parents
{
int age = 28;
public static void main(String[] args)
{
                                                 // same method name, same no.of args, in two diff classes(parent-child) - method overriding or runtime polymorphism
    Children ch = new Children();
    ch.fixMarriage();   
    ch.printAge();
}
public void printAge(){
    System.out.println(this.age);                // this refers to current object
    System.out.println(super.age);               // super refers to super class object(parent class)
}
                                                     
public void fixMarriage()                        // we cannot reduce access in method overriding
{                                                       
   super.fixMarriage();
   System.out.println("child - opinion");        // first priority is child method
}

}
