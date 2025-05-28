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
