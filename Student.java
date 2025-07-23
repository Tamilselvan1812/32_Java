public class Student
{
                                              
     String name;                                 // Instance variables: name, rollNo, marks1, marks2, marks3
     int rollNo;
     int marks1;
     int marks2;
     int marks3;

public Student(String name,int rollNo, int marks1, int marks2, int marks3)
{
    this.name = name;
    this.rollNo = rollNo;                       // Constructor to initialize all values
    this.marks1 = marks1;
    this.marks2 = marks2;
    this.marks3 = marks3;
}
public static void main(String[] args)

{
    Student s1 = new Student("Mukila",001,98,99,100);    // obj1
    Student s2 = new Student("Pavithra",002,99,100,100); // obj2
    s1.displayDetails();
    s2.displayDetails();                                 // method calling statements
    
}

public void displayDetails()                   // Method displayDetails() to print student details and average marks

{
    System.out.println("Name : "+name);
    System.out.println("RollNo : "+rollNo);
    int avg = calculateAverage();              // method calling statement
    System.out.println("Avg : "+ avg);
}

public int calculateAverage(){                 // Method calculateAverage() to return average of 3 marks

    int sum = marks1+marks2+marks3;
    int avg = sum/3;
    return avg;
}

}
