package collectiondemo;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueWordCounter {

	public static void main(String[] args) {
		
		   HashSet<String> h1 = new HashSet<>();
		   Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a paragraph:  ");
	        String paragraph = sc.nextLine();

	      

	        String[] Words = paragraph.split("\\s+");
	        for (String i : Words) {
	            h1.add(i); 
	        }
	      
	       
	        System.out.println("\nUnique Words: " + h1);
	        System.out.println("Words Count: " + h1.size());

	        sc.close();
		   

	}

}
