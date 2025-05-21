/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*;

/**
 *
 * @author sanji
 */
public class MySqlConnection implements Database{
    @Override
    public Connection openConnection() {
        try {
            String username = "root";
            String password = "s1h3347";
            String database = "kicksnepal";
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/" + database,username,password
            );
            if (connection == null){
                System.out.println("Database connection fail!");
            }
            else {
                System.out.println("Database connection success!");
            }
            return connection;
        }
        catch (SQLException e){
            System.out.println("Connection error: "+ e);
            return null;
        }
    }

    @Override
    public void closeConnection(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()){
                conn.close();
                System.out.println("Connection closed");
            }
        }
        catch (SQLException e){
            System.out.println("Connection error: "+ e);
        }
    }

    @Override
    public ResultSet runQuery(Connection conn, String query) {
        try {
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query);
            return result;
        }
        catch (SQLException e){
            System.out.println(e);
            return null;
        }
    }

    @Override
    public int executeUpdate(Connection conn, String query) {
        try {
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(query);
            return result;
        }
        catch (SQLException e){
            System.out.println(e);
            return -1;
        }
    }
}
