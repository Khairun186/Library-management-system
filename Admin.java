package library_management_system;
import java.sql.*;
import java.util.Scanner;
public class Admin {
   
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    Connection connect = null;
    void AdminOperation() {
        Connection conn = null;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (Exception e) {
                System.out.println(e);
            }
conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/library_management_system?" + "user=root");

            String query = "SELECT * FROM  administration";

            Statement st = conn.createStatement();

            
            ResultSet rs = st.executeQuery(query);

            
            while (rs.next())
            {
                String  admin_name = rs.getString("admin_name");
                String admin_id = rs.getString("admin_id");
                

                
                System.out.format("||%s||%s||\n", admin_name, admin_id);
            }
            st.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}
  

