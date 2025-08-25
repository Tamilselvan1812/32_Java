package stringlearn;

public class StringDemo {

	public static void main(String[] args) {
		
		String str = "abc";                    // using string literal,it will store in SCP memory
        System.out.println(str);               
        str = "xyz";                           // if we store another variable xyz in str ,it will point to same object
        System.out.println(str);    

        
        String str1= new String("abc");        // using new keyword
        System.out.println(str1);              // it will store in heap memory
         
        
        
        String s1 = "abc";                    // == vs .equals()
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println(s1 == s2);         // true (same SCP reference)
        System.out.println(s1 == s3);         // false(heap vs SCP)
        System.out.println(s1.equals(s3));    // true (content check)

        
        String s = "hello";                   // string is immutable 
        s.concat(" world");
        System.out.println(s);                // it will print "hello" only

     

	}

}
