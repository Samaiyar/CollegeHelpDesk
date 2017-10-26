
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell-laptop
 */
public class myconnec {
     public static Connection con;
   public static PreparedStatement pst;

    public  myconnec() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=complaint;selectMethod=cursor", "sa", "abc123");
            pst = con.prepareStatement(" ");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }

    }
}
