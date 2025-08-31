package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;


public class Mobiles implements Comparable<Mobiles>{
          
	        String name;
	        int price;
	        int ram;
	public Mobiles(String name, int price, int ram)
	{
		 this.name = name;
		 this.price = price;
		 this.ram = ram;
	}

	public String toString() {
        return  "[" + name + ", " + price + ", " + ram + "]";
    }
	
	public static void main(String[] args) {
		  
		    Mobiles m1 = new  Mobiles("oppo",15000,8);
		    Mobiles m2 = new  Mobiles("vivo",10000,6);
		    Mobiles m3 = new  Mobiles("samsung",25000,12);
		    Mobiles m4 = new  Mobiles("realme",20000,16);
		    Mobiles m5 = new  Mobiles("apple",50000,48);
		    
		    ArrayList<Mobiles> a1= new ArrayList<Mobiles>();
		    a1.add(m1);
		    a1.add(m2);
		    a1.add(m3);
		    a1.add(m4);
		    a1.add(m5);
		    
		    System.out.println(a1);
		    
		    Collections.sort(a1);
		    System.out.println(a1);

	      }

	
	public int compareTo(Mobiles obj) {
		
		if(this.price>obj.price)
		{
			return 1;
		}
		else if(this.price<obj.price)
		{
			return -1;
		}
		return 0;
	}
    

}
