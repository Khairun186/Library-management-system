package library_management_system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Library_Management_System {
    
    private static Connection connection = null;

    static java.sql.Connection getInstance() throws ClassNotFoundException, SQLException {
        if (connection==null)
        {
            Class.forName("com.mysql.jdbc.Driver");
connection = DriverManager.getConnection("jdbc:mysql://localhost/library_management_system?" + "user=root");
        }
        return connection;
    }

    public static void close() {
    }
}

