package collectiondemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		 
		 ArrayList s1 = new ArrayList();        // creating arraylist without generics means we can store any datatype
		 s1.add(10);                            // add ()
		 s1.add(15);
		 s1.add("hii");
		 System.out.println(s1);
		 
		 s1.add(0, 5);                          // add() with index
		 System.out.println(s1);
	
		 System.out.println(s1.get(0));         // get()
		 
		 s1.set(2, 20);                         // set()
		 System.out.println(s1);
		 
		 s1.remove(0);                          // remove()
		 System.out.println(s1);
		 
		
		 System.out.println(s1.size());         // size()
		 

	}

}
