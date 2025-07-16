public class Home
{

//non-static object specific information
   String name1 = "dhanush";
   int age1 = 25;
//static refers to class specific information
    static String name2 = "tamil";
    static int age2 = 15;

public static void main(String[] ramesh)
{
    System.out.println(Home.name2);
    System.out.println(Home.age2);

    Home person = new Home();            //new object
    System.out.println(person.name1);
    System.out.println(person.age1);   

}

}
