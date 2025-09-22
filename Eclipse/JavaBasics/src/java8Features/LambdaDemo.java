package java8Features;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {
    	   List<String> names = new ArrayList<>();
           names.add("Alice");
           names.add("Bob");
           names.add("Charlie");

           System.out.println(names); 

          
      names.forEach(name -> System.out.println(name.toUpperCase()));   // Iterate using forEach and lambda
       }
}
