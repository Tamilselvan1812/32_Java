package collectiondemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		  
		     HashMap<Integer,String> h1 = new HashMap<>();                //Store items in key-value pairs
		     h1.put(10, "Tamil");
		     h1.put(20, "Selvan");
		     h1.put(30, "kts");
		     System.out.println(h1);
		     
             LinkedHashMap<Integer,String> h2 = new LinkedHashMap<>();   //Store items in key-value pairs maintains insertion order     
             h2.put(2, "Selvan");
		     h2.put(1, "Tamil");
		     h2.put(3,"kts");
		     System.out.println(h2);
		     
		     TreeMap<Integer,String> h3 = new TreeMap<>();               //store keys in sorted order
		     h3.put(2, "Selvan");
		     h3.put(3, "kts");
		     h3.put(1, "Tamil");
		     System.out.println(h3);
		     
		     
		    
		     System.out.println( h3.get(1));                 // get()
		     
		     h3.remove(1);                                   // remove()
		     System.out.println(h3); 
		     
		     System.out.println(h3.containsKey(1));          // containsKey()
		     
		     System.out.println(h3.containsValue("kts"));    // containsValue()
		     
		     System.out.println(h3.keySet());                // keySet()
		     
		     System.out.println(h3.values());                // values()
		     
		     System.out.println(h3.entrySet());              // entryset()
		     
		     for (Integer i : h3.keySet()) {                 // iterate using foreach
		    	 
		    	 System.out.println("Key:" + i + " value:"+ h3.get(i));
		    	 
		     }
		     

	}

}
