/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author sanji
 */
public interface Database {
    Connection openConnection();
    void closeConnection(Connection connection);
    ResultSet runQuery(Connection connection, String query);
    int executeUpdate(Connection connection, String query);
}
