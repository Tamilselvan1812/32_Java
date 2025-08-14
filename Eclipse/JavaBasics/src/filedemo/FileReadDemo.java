package filedemo;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReadDemo {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("D:\\Tamil\\Hi.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line!=null)
			{
				System.out.println(line);
				line = br.readLine();
			}
			
			
			br.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
