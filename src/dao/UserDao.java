/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.*;
import model.User;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;

/**
 *
 * @author sanji
 */
public class UserDao {
    public void signup(User user){
        MySqlConnection mysql = new MySqlConnection();
        Connection connection = mysql.openConnection();
        String sql = "INSERT INTO users (username, phoneNum, email, password) VALUES (?,?,?,?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPhoneNum());
            pstmt.setString(3, user.getEmail());
            pstmt.setString(4, user.getPassword());
            pstmt.executeUpdate();
    }
        catch (SQLException e){
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE,null,e);
        }
        finally {
            mysql.closeConnection(connection);
        }
    }

    public boolean checkUser(User user){
        MySqlConnection mysql = new MySqlConnection();
        Connection connection = mysql.openConnection();
        String sql = "SELECT * FROM users WHERE email = ? OR username = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setString(1, user.getEmail());
            pstmt.setString(2, user.getUsername());
            ResultSet result = pstmt.executeQuery();
            return result.next();
        }
        catch (SQLException e) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE,null,e);
        }
        finally {
            mysql.closeConnection(connection);
        }
        return false;
    }
    
    public boolean login(User user){
        MySqlConnection mysql = new MySqlConnection();
        Connection connection = mysql.openConnection();
        String sql = "SELECT * FROM users WHERE email = ? OR password = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setString(1, user.getEmail());
            pstmt.setString(2, user.getPassword());
            ResultSet result = pstmt.executeQuery();
            return result.next();
        }
        catch (SQLException e) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE,null,e);
        }
        finally {
            mysql.closeConnection(connection);
        }
        return false;
    }
}
