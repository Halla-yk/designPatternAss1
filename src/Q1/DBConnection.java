/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hala
 */
public class DBConnection {

    private static DBConnection mySql;
    private static DBConnection oracle;
    private Connection connection;

    private DBConnection(String dbName) throws SQLException {
        if (dbName.equalsIgnoreCase("oracle")) {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");

               this.connection = DriverManager.getConnection(
                        "jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
            } catch (ClassNotFoundException ex) {
                System.out.println("Database Connection Creation Failed : " + ex.getMessage());
            }
        }
        if (dbName.equalsIgnoreCase("mySql")) {

            try {
                Class.forName("org.postgresql.Driver");
                this.connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/library?serverTimezone=UTC", "root", "");
            } catch (ClassNotFoundException ex) {
                System.out.println("Database Connection Creation Failed : " + ex.getMessage());
            }
        }
    }

    public static DBConnection getMySql(String dbName) throws SQLException {
        if (mySql == null) {
            mySql = new DBConnection(dbName);
        }
        return mySql;
    }

    public static DBConnection getOracle(String dbName) throws SQLException {
        if (oracle == null) {
            oracle = new DBConnection(dbName);
        }
        return oracle;
    }}