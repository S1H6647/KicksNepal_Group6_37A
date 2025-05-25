
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
