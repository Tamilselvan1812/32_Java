package jdbcdemo;
import java.sql.*;                                                                             //1.import the package

public class JdbcDemo {
          public static void main(String[] args) throws Exception 
          {
        	  
        	 
        		  
//			 Class.forName("com.mysql.cj.jdbc.Driver");                                         //2.load and register the driver
		     
        	  String url = "jdbc:mysql://localhost:3306/jdbcforyoutube";
        	  String username="root";
        	  String password = "Kts@1812";
        	  Connection con = DriverManager.getConnection(url,username,password);              //3.establish a connection 
              Statement st = con.createStatement();                                             //4.create the statement(statement,prepared statement, callablestatement)
              
              String sql = "select * from student ";      
              
              ResultSet rs = st.executeQuery(sql);                                              //5.execute the statement
              
              while( rs.next())                                  // skipping the header
              {
            	  System.out.println(rs.getInt("rno")+" "+rs.getString("name")+" "+rs.getString("location")); //6.process the result
              }                       
              
             
              
              con.close();                                                                      //7.close the connection
              
             
			 
          }
}
