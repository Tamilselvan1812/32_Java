package collectiondemo;
import java.lang.Comparable;



public class Students implements Comparable<Students>{
	
	String name;
	int roll;
	int marks;

	public Students(String name, int roll, int marks) {
		
		   this.name = name;
		   this.roll = roll;
		   this.marks = marks;
	}
	public String toString() {
        return  "[" + name + ", " + roll + ", " + marks + "]";
    }
	
	public int compareTo(Students obj) {
		     
		if(this.marks>obj.marks) {
			return 1;
		}else if(this.marks<obj.marks)
		{
			return -1;
		}
		return 0;
	}
	
}
