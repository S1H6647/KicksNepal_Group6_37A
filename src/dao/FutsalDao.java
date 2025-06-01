/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.MySqlConnection;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Futsal;

/**
 *
 * @author sanji
 */
public class FutsalDao {
    public void addFutsal(Futsal futsal){
        MySqlConnection mysql = new MySqlConnection();
        Connection connection = mysql.openConnection();
        String sql = "INSERT INTO futsals (futsalName, futsalLocation, futsalType, futsalPrice, futsalOpeningTime) VALUES (?,?,?,?,?)";
        
        try (PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setString(1, futsal.getFutsalName());
            pstmt.setString(2, futsal.getFutsalLocation());
            pstmt.setString(3, futsal.getFutsalType());
            pstmt.setString(4, futsal.getFutsalPrice());
            pstmt.setString(5, futsal.getFutsalOpeningTime());
            pstmt.executeUpdate();
        } catch (SQLException e){
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE,null,e);
        } finally {
            mysql.closeConnection(connection);
        }
    }

    public boolean checkFutsal(Futsal futsal){
        MySqlConnection mysql = new MySqlConnection();
        Connection connection = mysql.openConnection();
        String sql = "SELECT * FROM futsals WHERE futsalName = ? OR futsalLocation = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setString(1, futsal.getFutsalName());
            pstmt.setString(2, futsal.getFutsalLocation());
            ResultSet resultSet = pstmt.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE,null,e);
        } finally {
            mysql.closeConnection(connection);
        }
        return false;
    }

    public ArrayList<Futsal> getAllFutsals (){
        MySqlConnection mysql = new MySqlConnection();
        Connection connection = mysql.openConnection();

        ArrayList<Futsal> futsalArrayList = new ArrayList<>();

        String sql = "SELECT futsalName, futsalLocation, futsalType, futsalPrice, futsalOpeningTime FROM futsals";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)){
            ResultSet result = pstmt.executeQuery();

            while (result.next()){
                Futsal futsal = new Futsal(
                        result.getString("futsalName"),
                        result.getString("futsalLocation"),
                        result.getString("futsalType"),
                        result.getString("futsalPrice"),
                        result.getString("futsalOpeningTime")
                );
                futsalArrayList.add(futsal);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            mysql.closeConnection(connection);
        }
        return futsalArrayList;
    }

    public boolean removeFutsal(Futsal futsal){
        MySqlConnection mysql = new MySqlConnection();
        Connection connection = mysql.openConnection();
        String sql = "DELETE FROM futsals where futsalName = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setString(1, futsal.getFutsalName());
            int rowsAffected = pstmt.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            mysql.closeConnection(connection);
        }
    }
}
