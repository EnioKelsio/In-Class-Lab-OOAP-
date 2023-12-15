/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aadp_lab_soccersimulator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author eniomagalhaes
 * 
 * This class manages the database for the soccer simulator
 */
public class DataBaseManager {
    
    
    // These are the instance variables for the class
      private final String dbName;
      private final String[] teams;
      private final String DB_URL;
      private final String USER;
      private final String PASS;
      private Connection connct;
    
    // This is the constructor for the class
    public DataBaseManager(String dbName, String[] teams, String DB_URL, String USER, String PASS) 
            
            // This method sets up the database       
            throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        this.dbName = dbName;
        this.teams = teams;
        this.DB_URL = DB_URL;
        this.USER = USER;
        this.PASS = PASS; {

    }
    
        // Load the MySQL driver
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        
        try {
            // Establish a connection to the database
            Connection connct = DriverManager.getConnection("jdbc:mysql://localhost/", USER, PASS);
            Statement stmt = connct.createStatement();
            
            // Create the schema if it doesn't exist
            stmt.execute("CREATE SCHEMA IF NOT EXISTS " + dbName +";");
            stmt.execute("USE " + dbName + ";");
            
            // Create a table for each team
            for (String team : teams) {
                stmt.execute(
                        "CREATE TABLE IF NOT EXISTS "+ team + " ("
                                + "name VARCHAR(30) NOT NULL,"
                                + "number INT NOT NULL PRIMARY KEY,"
                                + "birth VARCHAR(30),"
                                + "position VARCHAR(30),"
                                + "goalsScored INT,"
                                + "background TEXT(1000));"
                );                
            }
        } catch (SQLException e) {
            // Print the stack trace for any SQL exceptions

        }
    }
}
    
    

