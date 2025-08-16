package jdbcdemo;
import java.sql.*;

public class JdbcDemo {
          public static void main(String[] args) throws ClassNotFoundException
          {
        	  
        	 
        		  Class.forName("com.mysql.cj.jdbc.Driver");
        		  System.out.println("MySQL Driver loaded successfully");

			 
          }
}
