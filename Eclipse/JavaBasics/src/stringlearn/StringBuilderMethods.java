package stringlearn;

public class StringBuilderMethods {
	 public static void main(String[] args) {
	        
	        StringBuilder sb = new StringBuilder("Hello");                     // Create a StringBuilder object

	        // 1. append()
	        sb.append(" World");
	        System.out.println("append: " + sb);   // Hello World

	        // 2. insert()
	        sb.insert(5, " Java");
	        System.out.println("insert: " + sb);   // Hello Java World

	        // 3. replace()
	        sb.replace(6, 10, "Python");
	        System.out.println("replace: " + sb);   // Hello Python World

	        // 4. delete()
	        sb.delete(5, 12);
	        System.out.println("delete: " + sb);    // Hello World

	        // 5. reverse()
	        sb.reverse();
	        System.out.println("reverse: " + sb);    // dlroW olleH
	        sb.reverse(); // reverse back

	        // 6. charAt() & setCharAt()
	        System.out.println("charAt(1): " + sb.charAt(1)); // e
	        sb.setCharAt(0, 'h');
	        System.out.println("setCharAt: " + sb);    // hello World

	        // 7. length()
	        System.out.println("length: " + sb.length());     // 11

	        // 8. capacity() & ensureCapacity()
	        System.out.println("capacity: " + sb.capacity()); // default 16 + length
	        sb.ensureCapacity(50);
	        System.out.println("capacity after ensure: " + sb.capacity()); // >= 50
	    }
}
