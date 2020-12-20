
package library_management_system;
import java.sql.*;
import java.util.Scanner;

public class Create {
    
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    Connection connect = null;


    void AddBookOperation() {
        Connection conn = null;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("\nEnter book_name:");
            
            Scanner sg= new Scanner(System.in);
            String ft = sg.nextLine();
            System.out.println("\nEnter author_name:");
            Scanner si= new Scanner(System.in);
            String fn = si.nextLine();
            System.out.println("\nEnter category:");
            Scanner sn= new Scanner(System.in);
            String fp = sn.nextLine();
            System.out.println("\nEnter  price:");
            Scanner sa= new Scanner(System.in);
            String fpp = sa.nextLine();
conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/library_management_system?" + "user=root");

String query = "INSERT INTO book_details(book_name,author_name,category,price)"+"VALUES(?,?,?,?)";

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString (1, ft);
            preparedStmt.setString (2, fn);
            preparedStmt.setString (3, fp);
            preparedStmt.setString (4, fpp);

          
            preparedStmt.execute();


            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
