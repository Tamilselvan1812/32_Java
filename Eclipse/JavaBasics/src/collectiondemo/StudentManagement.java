	package collectiondemo;
	import java.util.List;
	import java.util.Scanner;
	import java.util.ArrayList;
	import java.util.Collections;
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
			        int choice;
			        do {
			            
			            System.out.println("1. Add Student");
			            System.out.println("2. View Students");
			            System.out.println("3. Delete Student");
			            System.out.println("4. Find Topper");
			            System.out.println("5. Edit Student");
			            System.out.println("6. Find Student by Roll No");
			            System.out.println("7. Exit");
			            System.out.print("Enter your choice: ");
			            choice = scan.nextInt();
			            
			            switch (choice) {
			                case 1: 
			                    System.out.print("Enter Name: ");
			                    String name = scan.next();

			                    System.out.print("Enter Roll No: ");
			                    int roll = scan.nextInt();

			                    System.out.print("Enter Marks: ");
			                    int marks = scan.nextInt();

			                    Students s4 = new Students(name, roll, marks);
			                    a1.add(s4);
			                    System.out.println("Student added successfully");
			                    break;

			                case 2: 
			                   {
			                	    System.out.println("\n--- Student List ---");
			                        System.out.println(a1 + "\n");
                    	        }
			                    break;
			                    
			                case 3: 
			                    System.out.print("Enter Roll No of student to delete: ");
			                    int delRoll = scan.nextInt();
			                    boolean removed = false;

			                    for (int i = 0; i < a1.size(); i++) {
			                        if (a1.get(i).roll == delRoll) {
			                            a1.remove(i);
			                            removed = true;
			                            System.out.println("Student removed successfully");
			                            break;
			                        }
			                    }
			                    if (!removed) {
			                        System.out.println(" Student not found");
			                    }
			                    break;

			                case 4: 
			                   {
			                        
			                        Students topper = Collections.max(a1);
			                        System.out.println("Topper: " + topper);
			                    }
			                    break;

			                case 5:
			                    System.out.print("Enter Roll No of student to edit: ");
			                    int editRoll = scan.nextInt();
			                    boolean found = false;

			                    for (Students st : a1) {
			                        if (st.roll == editRoll) {
			                            System.out.print("Enter new Name: ");
			                            st.name = scan.next();

			                            System.out.print("Enter new Marks: ");
			                            st.marks = scan.nextInt();

			                            found = true;
			                            System.out.println(" Student updated successfully!");
			                            break;
			                        }
			                    }
			                    if (!found) {
			                        System.out.println("Student not found!");
			                    }
			                    break;

			                case 6:
			                    System.out.print("Enter Roll No to search: ");
			                    int searchRoll = scan.nextInt();
			                    boolean exists = false;

			                    for (Students st : a1) {
			                        if (st.roll == searchRoll) {
			                            System.out.println("Student Found: " + st);
			                            exists = true;
			                            break;
			                        }
			                    }
			                    if (!exists) {
			                        System.out.println("Student not found");
			                    }
			                    break;
     

			                case 7: 
			                    System.out.println("\nExiting menu...");
			                    break;

			                default:
			                    System.out.println("Invalid choice");
			            }
			        } while (choice != 7);

			        
			        Collections.sort(a1);
			        System.out.println("\n Sorted Student List ");
			        for(Students st : a1)
			        {
			        System.out.println(st);
			        }
                         scan.close();
			     
	
		

		}
	}

