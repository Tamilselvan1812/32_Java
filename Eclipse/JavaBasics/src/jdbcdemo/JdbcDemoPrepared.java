package jdbcdemo;

import java.sql.*;                                                                    // 1. import the package

public class JdbcDemoPrepared {
    public static void main(String[] args) throws Exception {
        
        
        // Class.forName("com.mysql.cj.jdbc.Driver");                                // 2. (Optional in modern JDBC) load and register the driver

        
        String url = "jdbc:mysql://localhost:3306/jdbcforyoutube";
        String username = "root";
        String password = "Kts@1812";
        Connection con = DriverManager.getConnection(url, username, password);       // 3. establish a connection

        
        String sql = "SELECT * FROM student WHERE rno = ?";  // ? is a placeholder
        PreparedStatement ps = con.prepareStatement(sql);                             // 4. create the PreparedStatement

        
        ps.setInt(1, 1);   // ? = 2 (you can try with 1, 2, or 3)                     // 5. set the parameter value and execute the query
        ResultSet rs = ps.executeQuery();

       
        while (rs.next()) {                                                            // 6. process the result
            System.out.println(rs.getInt("rno") + " " + rs.getString("name") + " " + rs.getString("location"));
        }

        
        con.close();                                                                   // 7.close connection
    }
}