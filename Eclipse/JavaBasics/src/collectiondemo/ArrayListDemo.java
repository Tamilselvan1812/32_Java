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
		 
       System.out.println(s1.contains("hii"));  // contains()
		 
		 System.out.println(s1.indexOf(20));   // indexof()
		 
		 s1.clear();                           // clear()
		 System.out.println(s1);
		 
		 ArrayList s2 = new ArrayList();
		 
		 s2.add(1);
		 s2.add(2);
		 s2.add(3);
		 s2.add("Tamil");
		 System.out.println(s2);
		 
		 System.out.println(s2.isEmpty());      // isempty()
		 
		 s2.remove(2);
		 System.out.println(s2);                // remove() with index
		 
		Object[] arr =  s2.toArray();           // toArray() - we created s2 with no generics ,so return type is object[]
		for(Object i : arr)
		{
			System.out.print(i+" ");
		}
		 

	}

}
