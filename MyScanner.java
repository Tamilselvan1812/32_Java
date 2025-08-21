import java.util.Scanner;                                               //we have to import first

public class MyScanner
 {
    public static void main(String[] args)

 {
        Scanner scanner = new Scanner(System.in);                      //scanner is utility class that is used to read input
                                                                       //create an object of the class and use any of the available methods found in the Scanner class documentation.
        System.out.print("Enter no1: ");                       
        int no1 = scanner.nextInt();

        System.out.print("Enter no2: ");
        int no2 = scanner.nextInt();

        int sum = no1 + no2;
        System.out.println("Addition (no1 + no2): " + sum);

        int product = no1 * no2;
        System.out.println("Multiplication (no1 * no2): " + product);

   try
        {
            int result = no1 / no2;
            System.out.println("Result of no1 / no2: " + result);
        }
   catch (ArithmeticException e)
        {
            System.out.println("Error: no2 should not be zero.");     //arithematic exception - unchecked exception (handled by try and catch)
        }

        scanner.close();
    }
}
