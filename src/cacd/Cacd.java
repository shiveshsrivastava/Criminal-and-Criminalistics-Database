/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cacd;

/**
 *
 * @author RR
 */
import java.sql.*;

public class Cacd {

    /**
     * @param args the command line arguments
     */
     public static Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            
            String url = "jdbc:sqlite:C:/Users/Shivesh Srivastava/Documents/NetBeansProjects/cacd/c.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            return conn;
            
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            System.out.println(e.getMessage());
            return null;
        }

    /**
     *
     * @param args
     */
     }
}
