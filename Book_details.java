package library_management_system;
import java.sql.*;
import java.util.Scanner;
public class Book_details {
     Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    Connection connect = null;


    void BookOperation() {
        Connection conn = null;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (Exception e) {
                System.out.println(e);
            }

conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/library_management_system?" + "user=root");

            String query = "SELECT * FROM  book_details";

            Statement st = conn.createStatement();

            
            ResultSet rs = st.executeQuery(query);

            
            while (rs.next())
            {
                String book_name  = rs.getString("book_name");
                String author_name = rs.getString("author_name");
                String category  = rs.getString("category");
                int  price = rs.getInt("price");
                
System.out.format("||%s||%s||%s||%d||\n",book_name,author_name,category,price);
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
