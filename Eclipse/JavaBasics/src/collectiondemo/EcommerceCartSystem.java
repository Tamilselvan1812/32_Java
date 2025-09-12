package collectiondemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EcommerceCartSystem {

	public static void main(String[] args) {
		
		Map<String,Integer> h1 = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do
		{
			System.out.println("1.Add product to cart ");
			System.out.println("2.Remove product from cart");
			System.out.println("3.Update quantity of a product");
			System.out.println("4.Show all items in cart");
			System.out.println("5.Total items in cart");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
			
				    System.out.println("Enter product name:");
				    String productName = sc.next();
				    System.out.println("Enter product qty:");
			        int qty = sc.nextInt();
			        h1.put(productName, qty);
			        break;
			
			case 2:
				 System.out.print("Enter product name to remove: ");
                 String removeProduct = sc.next();
			     h1.remove(removeProduct);
			     break;
			     
			case 3:
				 System.out.print("Enter product name to update: ");
                 String updateProduct = sc.next();
                 System.out.print("Enter new quantity: ");
                 int newQty = sc.nextInt();
                 h1.put(updateProduct, newQty);
			     break;
			     
			case 4:
				 System.out.println("Items in cart");

			     for (String i : h1.keySet()) {               
			    	 
			    	 System.out.println("ProductName:" + i + " qty:"+ h1.get(i));
			    	 
			     }
			     break;
			     
			case 5:
				int total = 0;
                for (int val : h1.values()) {
                    total += val;
                }
                System.out.println("Total items in cart = " + total);
			      break;
			
	        default:
                System.out.println("Invalid choice");
			
			}
		}
		
		while(choice !=5);
		
		sc.close();
		

	}

}
