/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import database.MySqlConnection;


/**
 *
 * @author sanji
 */
public class DatabaseConnectionChecker {
    public static void main(String[] args) {
        MySqlConnection sql = new MySqlConnection();
        sql.openConnection();
    }
}
