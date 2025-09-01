	package collectiondemo;
	import java.util.List;
	import java.util.Scanner;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;
	
	public class StudentManagement {
	
		public static void main(String[] args)throws IOException {
			     Students s1 = new Students("Tamil",1,100);
			     Students s2 = new Students("Kts",2,98);
			     Students s3 = new Students("selvan",3,95);
			     
			     System.out.println(s1);
			     System.out.println(s2);
			     System.out.println(s3);
			     
			     List<Students> a1 = new ArrayList<>();
			     a1.add(s1);
			     a1.add(s2);
			     a1.add(s3);
			     
			     Scanner scan = new Scanner(System.in);
			     for (int i = 1; i <= 3; i++)
			     {
			     System.out.println("\nEnter details for Student " + i);
			    
			     System.out.println("Enter Name");
			     String student_name = scan.next();
			     System.out.println("Enter rollno");
			     int roll_no = scan.nextInt();
			     System.out.println("Enter mark");
			     int mark = scan.nextInt();
			     
			     Students s4 = new Students(student_name,roll_no,mark);
			     a1.add(s4);
			     }
			     scan.close();
			     Collections.sort(a1);
			     System.out.println(a1);
		
		
		    FileWriter fw = new FileWriter("D:\\Tamil\\Students.csv");
		    BufferedWriter bw = new BufferedWriter(fw);
		    
		    bw.write("Name,Roll,Marks");
		    bw.newLine();
		    
		    for (Students s : a1)
		    {
	            bw.write(s.name + "," + s.roll + "," + s.marks );
	            bw.newLine();
	        }
		    
	        bw.close();
	        System.out.println("File written successfully!");
		}
	}

