public class Rider extends PetrolBunk
{
public static void main(String[] args)
{
    PetrolBunk pb = new PetrolBunk();
    Rider rider = new Rider();
    rider.display(pb);                           // parent class object is binded with all methods inside that parent class so we can pass object as arguments..


//    pb.display();
//    pb.price = 11;
//    System.out.println(pb.price);
//============================================

//    int price = pb.getPrice();
//    System.out.println("before "+price);       
//    pb.setPrice(10);
//    price = pb.getPrice();
//    System.out.println("after set value "+price);
}
public void display(PetrolBunk obj)
{
    System.out.println(obj.getPrice());
}


}
