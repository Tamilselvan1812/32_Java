package grocery;
import electronics.Mobile;
public class Rice extends Mobile               //different package subclass - protected,public
{


public static void main(String[] args)
{



    Rice mob = new Rice();
    mob.call();
    mob.satellitecall();
}

}
