package collectiondemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
            
	    public static void main(String[] args)
	    {
	    	HashSet h1 = new HashSet();               //store unique elements
	    	h1.add(5);
	    	h1.add(2);
	    	h1.add(6);
	    	h1.add(2);
	    	h1.add("hii");
	    	System.out.println(h1);
	    	
	    	LinkedHashSet h2 = new LinkedHashSet();  // store unique elements with insertion order
	    	h2.add(5);
	    	h2.add(2);
	    	h2.add(6);
	    	h2.add(2);
	    	h2.add("hii");
	    	System.out.println(h2);
	    	
	    	TreeSet h3 = new TreeSet();              // store unique elements with sorting order
	    	h3.add(5);
	    	h3.add(2);
	    	h3.add(6);
	    	h3.add(2);
	    	
	    	System.out.println(h3);
	    	
	    	for(Object obj:h1)                       // for iterating set use for each loop
	    	{
	    		System.out.println(obj);
	    	}
	    	
	    	Iterator it = h1.iterator();             // another way of iterating using iterator interface and iterator method
	    	while(it.hasNext())
	    	{
	    		System.out.println(it.next());
	    	}
	    	
	    	
	    }
}
