
package library_management_system;

import java.sql.*;
import java.util.Scanner;
public class Delete {
    
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    Connection connect = null;


    void deleteBookOperation() {
        Connection conn = null;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (Exception e) {
                System.out.println(e);
            }
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/library_management_system?" + "user=root");

            System.out.println("\nEnter the Book name you want to delete:");
            Scanner si= new Scanner(System.in);
            String fd = si.nextLine();

            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/library_management_system?" + "user=root");

            String query = "DELETE FROM book_details where  book_name=?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString  (1, fd);

            preparedStmt.executeUpdate();

            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        
    }
}
    
