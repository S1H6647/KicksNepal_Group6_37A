/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import dao.FutsalDao;
import dao.UserDao;
import model.Futsal;
import model.User;
import view.*;

import javax.swing.*;

/**
 *
 * @author sanji
 */
public class UserDashboardController {
    private final UserDashboard userDashboard;
    private final FutsalDao futsalDao = new FutsalDao();
    private final UserDao userDao = new UserDao();
    private final CurrentBooking currentBooking = new CurrentBooking();
    private final Futsal futsal;
    private final User user;

    public UserDashboardController(UserDashboard userDashboard, User user, Futsal futsal){
        this.userDashboard = userDashboard;
        this.futsal = futsal;
        this.user = user;

        userDashboard.userProfileBtnListener(new UserDashboardBtnListener());
        userDashboard.getCurrentBookingBtn().addActionListener(e -> currentBookingBtn());
        loadFutsalPanels();
        setUsername(user);
    }
    
    public void openScreen(){
        userDashboard.setTitle("UserDashboard");
        userDashboard.setLocationRelativeTo(null);
        userDashboard.setResizable(false);
        userDashboard.setVisible(true);
    }
    
    public void closeScreen(){
        userDashboard.dispose();
    }
    
    class UserDashboardBtnListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ae){
        try {
            closeScreen();
            UserDetails userDetails = new UserDetails();
            UserDetailsController userDetailsController = new UserDetailsController(userDetails);
            userDetailsController.openScreen();
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
        }
    }

    /**
     * Loads all futsal records from the database and creates panels for them.
     */
    private void loadFutsalPanels() {
        try {
            List<Futsal> futsalArrayList = futsalDao.getAllFutsals();

            // Get the panel and clear its existing components
            JPanel Frame1 = userDashboard.getPanel();
            Frame1.removeAll(); // Clears all components from the panel
            Frame1.revalidate(); // Updates the layout
            Frame1.repaint();   // Redraws the panel

            for (Futsal futsal : futsalArrayList) {
                JPanel futsalPanel = createFutsalPanel(futsal);
                Frame1.add(futsalPanel);
                Frame1.revalidate();
                Frame1.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(userDashboard, "Error loading futsals: " + e.getMessage());
        }
    }

    /**
     * Creates a futsal panel with the provided details.
     */
    private JPanel createFutsalPanel(Futsal futsal) {
        UserFutsalPanel newPanel = new UserFutsalPanel();
        UserFutsalPanelController controller = new UserFutsalPanelController(newPanel, userDashboard, futsal, user);
        controller.populatePanel(futsal);
        JPanel mainArea = newPanel.getMainArea();
        mainArea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        mainArea.setPreferredSize(new Dimension(400, 300));
        return mainArea;
    }

    public void setUsername(User user){
        userDashboard.getUsername().setText(userDao.getUsername(user));
    }

    public void currentBookingBtn() {
        try {
            Futsal bookedFutsal = futsalDao.getCurrentBooking();
            if (bookedFutsal != null) {
                CurrentBookingController currentBookingController = new CurrentBookingController(currentBooking, userDashboard);
                currentBookingController.populatePanel(bookedFutsal);
                currentBookingController.openScreen(bookedFutsal);
            } else {
                JOptionPane.showMessageDialog(userDashboard, "No current booking found.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(userDashboard, "Error loading booking: " + e.getMessage());
        }
    }
}

