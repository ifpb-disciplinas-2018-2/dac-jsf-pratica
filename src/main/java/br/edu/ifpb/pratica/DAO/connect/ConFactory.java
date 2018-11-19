package br.edu.ifpb.pratica.DAO.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rodger
 */
public class ConFactory{
   public static Connection getConnection(String url, String user, 
           String password, String classForName)
           throws ClassNotFoundException, SQLException {
       
        Connection conn = null;
        Class.forName(classForName);
        conn = DriverManager.getConnection(url, user, password);
        return conn;
        
    }
}
