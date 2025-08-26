package objectLearn;


public class Mobiles implements Comparable<Mobiles>               // if we use Generic
{
	int price,ram,mp;
	public Mobiles(int price,int ram,int mp)
	{
		this.price = price;
		this.ram = ram;
		this.mp = mp;
	}

	public static void main(String[] args) {
		
           //      double i = 10.5;
           //      int j =(int) i;                                // narrowing casting(downcasting) - primitive data type
           //      System.out.println(j);
		
		   Mobiles oppo = new Mobiles(12000,8,50);
		   Mobiles vivo = new Mobiles(10000,12,64);
           int res = oppo.compareTo(vivo);                        // Compare the two objects using compareTo()
           
              if (res > 0) {
               System.out.println("Oppo is costlier than Vivo");
           } else if (res < 0) {
               System.out.println("Oppo is cheaper than Vivo");
           } else {
               System.out.println("Both have same price");
           }
	}


	public int compareTo(Mobiles obj) {                           // Here we are comparing based on price only
		
		 if (this.price > obj.price)          
		 {
	            return 1;                      
	        } 
		 else if (this.price < obj.price)
		 {
	            return -1;                     
		 }
		return 0;
	}

}
