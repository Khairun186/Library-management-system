package library_management_system;
import java.sql.SQLException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws SQLException {
        int run = 0;
        while (run == 0) {
            System.out.println("***Welcome to Library Management System Project***");
            System.out.println("PRESS: 1 - To Search a Book");
            System.out.println("PRESS: 2 - To Create a Book");
            System.out.println("PRESS: 3 - To Delete a Book");
            System.out.println("PRESS: 4 - To Read User Information");
            System.out.println("PRESS: 5 - To Read Admin Information");
            System.out.println("PRESS: 6 - To Read Supplier Information");
            System.out.println("PRESS: 7 - To Read Area Information");
            System.out.println("PRESS: 8 - To See Updated Book Information");
            
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a == 1) {
                Search db = new Search();
                db.searchOperation();
            }
            if (a == 2) {
                Create db = new Create();
                db.AddBookOperation();
            }
            if (a == 3) {
                Delete db = new Delete();
                db.deleteBookOperation();
            }
            if (a == 4) {
                User db = new User();
                db.userOperation();
            }
            if (a == 5) {
                Admin db = new Admin();
                db.AdminOperation();
            }
            if (a == 6) {
                Supplier_Details db = new Supplier_Details();
                db.SupplierOperation();
            }
            if (a == 7) {
                Area_Details db = new Area_Details();
                db.AreaOperation();
            }
           if (a == 8) {
                Book_details db = new Book_details();
                db.BookOperation();
            } 
        }
    }
}
