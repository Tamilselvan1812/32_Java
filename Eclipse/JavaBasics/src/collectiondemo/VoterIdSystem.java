package collectiondemo;

import java.util.HashSet;
import java.util.Scanner;

public class VoterIdSystem {

	public static void main(String[] args) {
		
		      HashSet<Integer> h1 = new HashSet<>();
		      h1.add(1);
		      h1.add(2);
		      h1.add(3);
		      h1.add(4);
		      h1.add(5);
		      
		      System.out.println(h1);
		      
		      Scanner s1 = new Scanner(System.in);
		      int choice;
		      do {
		    	 
		    	  System.out.println("1.Add VoterId");
		    	  System.out.println("2.Remove Duplicates");
		    	  System.out.println("3.Display all voter IDs");
		    	  System.out.println("Enter your option :" + " ");
		    	  choice = s1.nextInt();
		    	  
		    	  switch(choice)
		    	  {
		    	  case 1:
		    		  System.out.println("Enter your voter Id" + " ");
		    		  int id = s1.nextInt();
		    		  h1.add(id);
		    		  System.out.println("voter id added \n");
		    		  break;
		    	  case 2:
		    		  System.out.println("No duplicates found \n");
		    		  break;
		    	  case 3: 
		    		  
		    		  System.out.println(" Voter IDs "+ h1+"\n");
		    		  break;
		    	  default:
		    	           System.out.println("Invalid Option \n");
		    	           break;
		    	     
		    	  }
		      }while(choice!=3);
		      s1.close();

	}

}
