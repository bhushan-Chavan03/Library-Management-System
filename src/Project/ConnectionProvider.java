
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author bhush
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            //Class.forName("com.mysql.jdbc");
+            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","Admin@123");
            return con;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
