package collectiondemo;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class StudentManagement {

	public static void main(String[] args) {
		     Students s1 = new Students("Tamil",1,100);
		     Students s2 = new Students("Kts",2,98);
		     Students s3 = new Students("selvan",3,95);
		     
		     System.out.println(s1);
		     System.out.println(s2);
		     System.out.println(s3);
		     
		     Scanner scan = new Scanner(System.in);
		     System.out.println("Enter Name");
		     String student_name = scan.next();
		     System.out.println("Enter rollno");
		     int roll_no = scan.nextInt();
		     System.out.println("Enter mark");
		     int mark = scan.nextInt();
		     
		     Students s4 = new Students(student_name,roll_no,mark);
		     
		     
		     List<Students> a1 = new ArrayList<>();
		     a1.add(s1);
		     a1.add(s2);
		     a1.add(s3);
		     a1.add(s4);
		     
		     Collections.sort(a1);
		     System.out.println(a1);
	}

	
}
