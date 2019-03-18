
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rashika
 */
public class DBConnection {
    
    private static Connection conn;
    static
    {
      try
     {
        Class.forName("oracle.jdbc.OracleDriver");
        conn=DriverManager.getConnection("jdbc:oracle:thin:@//Rashika-PC:1521/XE", "myproject", "rashika");
        JOptionPane.showMessageDialog(null,"Connected successfully to the database","Sucess!",JOptionPane.INFORMATION_MESSAGE);
     }
     catch(ClassNotFoundException ex)
     {
         JOptionPane.showMessageDialog(null,"error in loading the driver"+ex,"Error!",JOptionPane.ERROR_MESSAGE);
         ex.printStackTrace();
     }
      catch(SQLException ex)
    {
         JOptionPane.showMessageDialog(null,"SQL Error"+ex,"Error!",JOptionPane.ERROR_MESSAGE);
         ex.printStackTrace();
    }
    }
      public static Connection getConnection()
              {
                  return conn;
              }
          
    }

    

