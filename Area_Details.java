package library_management_system;
import java.sql.*;
import java.util.Scanner;
public class Area_Details {
  Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    Connection connect = null;

    void AreaOperation() {
        Connection conn = null;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (Exception e) {
                System.out.println(e);
            }

conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/library_management_system?" + "user=root");

            String query = "SELECT * FROM  area_details";

            Statement st = conn.createStatement();

            
            ResultSet rs = st.executeQuery(query);

            
            while (rs.next())
            {
                String day  = rs.getString("day");
                String area_name = rs.getString("area_name");
                String time  = rs.getString("time");
                String duration = rs.getString("duration");
              
System.out.format("||%s||%s||%s||%s||\n",day,area_name,time,duration);
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
