package exceptionhandling;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		  
         
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter no 1");
          int no1 = scanner.nextInt();
          System.out.println("Enter no 2");
          int no2 = scanner.nextInt();
         
          
	
	try {
		 int no = no1/no2;
         System.out.println("Division of two numbers" + no);
	}
	catch(ArithmeticException e)
	{
		 System.out.println("Error: no2 should not be zero.");
	}
	scanner.close();
}}
