/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.*;
import model.User;
import java.sql.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;

import static kicksnepal_group6_37a.KicksNepal_Group6_37A.loggedInUser;

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
        String sql = "SELECT * FROM users WHERE username = ? OR phoneNum = ? OR email = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPhoneNum());
            pstmt.setString(3, user.getEmail());
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
        String sql = "SELECT * FROM users WHERE email = ? AND password = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setString(1, user.getEmail());
            pstmt.setString(2, user.getPassword());
            ResultSet result = pstmt.executeQuery();
            if (result.next()) {
                loggedInUser.setId(result.getInt("user_id"));
                loggedInUser.setUsername(result.getString("username"));
                loggedInUser.setPhoneNum(result.getString("phoneNum"));
                loggedInUser.setEmail(result.getString("email"));
                loggedInUser.setFavFood(result.getString("favFood"));
                loggedInUser.setFavPet(result.getString("favPet"));
                return true;
            }
        }
        catch (SQLException e) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE,null,e);
        }
        finally {
            mysql.closeConnection(connection);
        }
        return false;
    }
    
    public boolean questions(User user){
        MySqlConnection mysql = new MySqlConnection();
        Connection connection = mysql.openConnection();
        String usersSql = "SELECT * FROM users WHERE email = ?";
        String questionsSql = "UPDATE users SET favFood = ?, favPet = ? WHERE email = ?";
        boolean isOkay = true;

        try {
            PreparedStatement pstmt = connection.prepareStatement(usersSql);
            pstmt.setString(1,user.getEmail());
            ResultSet result = pstmt.executeQuery();
            if (!result.next()){
                isOkay = false;
            }
            else {
                PreparedStatement pstmt1 = connection.prepareStatement(questionsSql);
                pstmt1.setString(1, user.getFavFood());
                pstmt1.setString(2, user.getFavPet());
                pstmt1.setString(3,user.getEmail());
                pstmt1.executeUpdate();
            }
        }
        catch (SQLException e) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE,null,e);
        }
        finally {
            mysql.closeConnection(connection);
        }
        return isOkay;
    }

    public boolean forgotPassword(User user) {
        MySqlConnection mysql = new MySqlConnection();
        Connection connection = mysql.openConnection();
        String updateSql = "UPDATE users SET password = ? WHERE email = ? AND favFood = ? AND favPet = ?";

        try {
            PreparedStatement pstmt1 = connection.prepareStatement(updateSql);
            pstmt1.setString(1, user.getPassword());
            pstmt1.setString(2, user.getEmail());
            pstmt1.setString(3, user.getFavFood());
            pstmt1.setString(4, user.getFavPet());

            int rowsAffected = pstmt1.executeUpdate();
            return rowsAffected > 0;
        }
        catch (SQLException e){
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE,null,e);
            return false;
        }
        finally {
            mysql.closeConnection(connection);
        }
    }

    public String getUsername(User user){
        MySqlConnection mysql = new MySqlConnection();
        Connection connection = mysql.openConnection();

        ResultSet result = null;
        String username = null;
        String sql = "SELECT username FROM users WHERE email = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setString(1,user.getEmail());
            result = pstmt.executeQuery();
            while (result.next()){
                username = result.getString("username");
            }
            return username;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
