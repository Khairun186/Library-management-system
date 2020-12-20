package library_management_system;

import java.sql.*;
import java.util.Scanner;
public class User {
    
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    Connection connect = null;

    void userOperation() {
        Connection conn = null;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (Exception e) {
                System.out.println(e);
            }

conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/library_management_system?" + "user=root");

            String query = "SELECT * FROM  user";

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery(query);

            
            while (rs.next())
            {
                String  member_id = rs.getString("member_id");
                String member_name = rs.getString("member_name");
                String address = rs.getString("address");
                String contact_no = rs.getString("contact_no");
                String membership_status = rs.getString("membership_status");
                
System.out.format("||%s||%s||%s||%s||%s||\n",member_id,member_name,address,contact_no,membership_status);
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
