
package library_management_system;

import java.sql.*;
import java.util.Scanner;
public class Search {
    
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet result = null;
    Connection connect = null;
    Scanner sc = null;

    void searchOperation() {
        try {
            int p=1;
            connect = Library_Management_System.getInstance();
            sc = new Scanner(System.in);


     preparedStatement = connect.prepareStatement("SELECT * FROM  book_details WHERE  book_name=?");

            while (p==1) {
                System.out.println("Insert a Book name\n");
                preparedStatement.setString(1, sc.nextLine());
                result = preparedStatement.executeQuery();

                while (result.next()) {
                    System.out.println("Book name: " + result.getString("book_name"));
                   System.out.println("Book code: " + result.getString("book_code"));
                 
                    System.out.println("Author name: " + result.getString("author_name"));
                    System.out.println("Category: " + result.getString("category"));
                    System.out.println("Edition: " + result.getString("edition"));
                    System.out.println("Page no: " + result.getInt("page_no"));
                    System.out.println("Price: " + result.getInt("price"));
                    

                }
                
                System.out.println("\n\npress: 0 to exit");
                Scanner wel= new Scanner(System.in);
                int u= wel.nextInt();
                if(u==0)
                { p++;}

            }

        }

        catch (Exception ex) {
            System.out.println("MyError: " + ex);
        }
        finally {
          Library_Management_System.close();
        }
    }

   
}
