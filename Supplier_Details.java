package library_management_system;
import java.sql.*;
import java.util.Scanner;
public class Supplier_Details {
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    Connection connect = null;


    void SupplierOperation() {
        Connection conn = null;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (Exception e) {
                System.out.println(e);
            }

conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/library_management_system?" + "user=root");

            String query = "SELECT * FROM supplier_details";

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next())
            {
                String supplier_Id  = rs.getString("supplier_Id");
                String supplier_name = rs.getString("supplier_name");
                String contact_no  = rs.getString("contact_no");
               
System.out.format("||%s||%s||%s||\n",supplier_Id,supplier_name,contact_no);
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
