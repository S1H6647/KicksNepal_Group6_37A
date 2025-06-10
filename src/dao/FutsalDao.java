/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Futsal;
import model.User;

import static kicksnepal_group6_37a.KicksNepal_Group6_37A.loggedInUser;

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

        String sql = "SELECT * FROM futsals";

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
        String sql = "DELETE FROM futsals where futsalLocation = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setString(1, futsal.getFutsalLocation());
            int rowsAffected = pstmt.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            mysql.closeConnection(connection);
        }
    }

    public boolean editFutsal(Futsal futsal){
        MySqlConnection mysql = new MySqlConnection();
        Connection connection = mysql.openConnection();
        String sql = "UPDATE futsals SET futsalLocation = ? , futsalType = ?, futsalPrice = ?, futsalOpeningTime = ? WHERE futsalName = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setString(1, futsal.getFutsalLocation());
            pstmt.setString(2, futsal.getFutsalType());
            pstmt.setString(3, futsal.getFutsalPrice());
            pstmt.setString(4, futsal.getFutsalOpeningTime());
            pstmt.setString(5, futsal.getFutsalName());
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            mysql.closeConnection(connection);
        }
    }

    public boolean bookFutsal(Futsal futsal) {
        MySqlConnection mysql = new MySqlConnection();
        Connection connection = mysql.openConnection();

        try {
            connection.setAutoCommit(false);

            String checkSql = "SELECT COUNT(*) FROM bookings " +
                    "WHERE futsal_id = ? AND booking_date = ?";

            try (PreparedStatement checkStmt = connection.prepareStatement(checkSql)) {
                checkStmt.setInt(1, getFutsalID(futsal));
                checkStmt.setString(2, futsal.getFutsalBookingDate());
                ResultSet rs = checkStmt.executeQuery();

                if (rs.next() && rs.getInt(1) > 0) {
                    connection.rollback();
                    return false; // Already booked
                }
            }

            String insertSql = "INSERT INTO bookings (user_id, futsal_id, booking_date, booking_duration) " +
                    "VALUES (?, ?, ?, ?)";

            try (PreparedStatement insertStmt = connection.prepareStatement(insertSql)) {
                insertStmt.setInt(1, loggedInUser.getId());
                insertStmt.setInt(2, getFutsalID(futsal));
                insertStmt.setString(3, futsal.getFutsalBookingDate());
                insertStmt.setString(4, futsal.getFutsalBookingDuration());

                int rowsAffected = insertStmt.executeUpdate();
                connection.commit();
                return rowsAffected > 0;
            } catch (SQLException e) {
                connection.rollback();
                throw new RuntimeException("Error booking futsal: " + e.getMessage(), e);
            } finally {
                connection.setAutoCommit(true);
                mysql.closeConnection(connection);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error managing transaction: " + e.getMessage(), e);
        }
    }


    public Futsal getCurrentBooking() {
        MySqlConnection mysql = new MySqlConnection();
        Connection connection = mysql.openConnection();
        Futsal futsal = null;

        String sql = "SELECT f.* FROM futsals f JOIN bookings b ON f.futsal_id = b.futsal_id " + // Changed to futsal_id
                "WHERE b.user_id = ? " +
                "ORDER BY b.booking_date DESC";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, loggedInUser.getId());
            ResultSet result = pstmt.executeQuery();

            if (result.next()) {
                System.out.println(result.getString("futsalName"));
                futsal = new Futsal(
                        result.getString("futsalName"),
                        result.getString("futsalLocation"),
                        result.getString("futsalType"),
                        result.getString("futsalPrice"),
                        result.getString("futsalOpeningTime"),
                        result.getString("futsalBookingDate"),
                        result.getString("futsalBookingDuration")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving futsal booking: " + e.getMessage(), e);
        } finally {
            mysql.closeConnection(connection);
        }
        return futsal;
    }

    public int getFutsalID(Futsal futsal){
        MySqlConnection mysql = new MySqlConnection();
        Connection connection = mysql.openConnection();
        String sql = "SELECT futsal_id FROM futsals WHERE futsalName = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setString(1, futsal.getFutsalName());
            ResultSet resultSet = pstmt.executeQuery();
            if (resultSet.next()){
                return resultSet.getInt("futsal_id");
            } else {
                throw new RuntimeException("No futsal found with name: " + futsal.getFutsalName());
            }
        }catch (SQLException e){
            throw new RuntimeException("Error retrieving futsal ID: " + e.getMessage(), e);
        }finally {
            mysql.closeConnection(connection);
        }
    }
}
