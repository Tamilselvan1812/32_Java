public abstract class Mother                   // use abstract keyword in classname,abstract keyword is non access modifier
{

public Mother()
{

  System.out.println("Mother-const");          // we can create constructor in abstract class because we have object in child class

}
public static void main(String[] args)
{
 
  // Mother mother = new Mother();             // Mother is abstract; cannot be instantiated(we cannot create object in abstract class)
  // mother.workHard();
  // mother.motivate();

}

public abstract void study();                 // no body in method(abstract method) so use abstract keyword

public void workHard()                        // abstract class can have both abstract and regular methods
{
 System.out.println("workHard");
}

public void motivate()
{
 System.out.println("Motivate");
}

}