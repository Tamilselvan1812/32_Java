package stringlearn;

public class StringMethods {

	public static void main(String[] args) {
		 // 1. length()
        String str1 = "Hello";
        System.out.println("1.Length: " + str1.length());                 // 5

        // 2. charAt(int i)
        String str2 = "Java";
        System.out.println("2.Char at index 2: " + str2.charAt(2));       // v

        // 3. substring(int begin, int end)
        String str3 = "Programming";
        System.out.println("3.Substring(0,4): " + str3.substring(0, 4)); // Prog
        System.out.println("3.Substring(3): " + str3.substring(3));      // gramming

        // 4. equals(Object o)
        String str4a = "Java";
        String str4b = new String("Java");
        System.out.println("4.equals: " + str4a.equals(str4b));          // true (content check)
        System.out.println("4.== : " + (str4a == str4b));                // false (different objects)

        // 5. equalsIgnoreCase(String s)
        String str5a = "java";
        String str5b = "JAVA";
        System.out.println("5.equalsIgnoreCase: " + str5a.equalsIgnoreCase(str5b)); // true

        // 6. compareTo(String s)
        String str6a = "a";
        String str6b = "b";
        String str6c = "apple";
        String str6d = "z";
        String str6e = "a";
        System.out.println("6.compareTo (a vs b): " + str6a.compareTo(str6b));          // -1
        System.out.println("6.compareTo (apple vs apple): " + str6c.compareTo(str6c));  // 0
        System.out.println("6.compareTo (z vs a): " + str6d.compareTo(str6e));          // +25

        // 7. toUpperCase() / toLowerCase()
        String str7 = "Java";
        System.out.println("7.Uppercase: " + str7.toUpperCase());         // JAVA
        System.out.println("7.Lowercase: " + str7.toLowerCase());         // java

        // 8. trim()
        String str8 = "   Hello World   ";
        System.out.println("8.Trimmed: '" + str8.trim() + "'");           // "Hello World"

        // 9. replace(char old, char new)
        String str9 = "banana";
        System.out.println("9.Replace a->x: " + str9.replace('a', 'x'));   // bxnxnx
 
        // 10. replaceAll(String regex, String replacement)
        String str10 = "abc123xyz";
        System.out.println("10.ReplaceAll digits: " + str10.replaceAll("\\d", "*")); // abc***xyz

        // 11. split(String regex)
        String str11 = "a,b,c";
        String[] parts = str11.split(",");
        System.out.println("11.Split result: " + parts[0] + " | " + parts[1] + " | " + parts[2]);  // a | b | c

        // 12. contains(CharSequence s)
        String str12 = "hello world";
        System.out.println("12.Contains 'world'? " + str12.contains("world"));  // true

        // 13. startsWith() / endsWith()
        String str13 = "programming";
        System.out.println("13.Starts with 'pro'? " + str13.startsWith("pro"));  // true
        System.out.println("13.Ends with 'ing'? " + str13.endsWith("ing"));      // true

        // 14. intern()
        String str14a = new String("Java");
        String str14b = str14a.intern();
        String str14c = "Java";
        System.out.println("14.Intern test: " + (str14b == str14c));           // true (same pool reference)
	} 

}
