package filedemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		 File myFile = new File("D:\\Tamil\\Hi.txt");
		   try {
	            myFile.createNewFile(); 
	           
	            System.out.println("File created successfully.");

	            
	            FileWriter writer = new FileWriter(myFile,true);
	            BufferedWriter bw = new BufferedWriter(writer);

	            bw.write("Tamilselvan K");
	            bw.newLine();
	            bw.write("hii");
	            bw.close();

	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

}}
