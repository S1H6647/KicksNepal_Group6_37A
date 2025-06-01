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
import view.UserDashboard;
import view.UserDetails;

import javax.swing.*;

/**
 *
 * @author sanji
 */
public class UserDashboardController {
    private final UserDashboard userDashboard;
    private final FutsalDao futsalDao = new FutsalDao();
    private final UserDao userDao = new UserDao();
    private final User user;
    
    public UserDashboardController(UserDashboard userDashboard, User user){
        this.userDashboard = userDashboard;
        this.user = user;
        
        userDashboard.userProfileBtnListener(new UserDashboardBtnListener());
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
            JPanel containerPanel = userDashboard.getContainerPanel();
            userDashboard.getContainerPanel().setLayout(new GridLayout(2,3,10,10));

            // Clear existing panels
            containerPanel.removeAll();

            // Fetch all futsal from database
            List<Futsal> futsalArrayList = futsalDao.getAllFutsals();
            for (Futsal futsal : futsalArrayList) {
                JPanel futsalPanel = createFutsalPanel(futsal);
                containerPanel.add(futsalPanel);
            }

            containerPanel.revalidate();
            containerPanel.repaint();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(userDashboard, "Error loading futsals: " + e.getMessage());
        }
    }

    /**
     * Creates a futsal panel with the provided details.
     */
    private JPanel createFutsalPanel(Futsal futsal) {
        JPanel futsalPanel = new JPanel();
        futsalPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(12, 12, 12, 12);
        gbc.anchor = GridBagConstraints.WEST;

        Font biggerFont = new Font("Leelawadee", Font.PLAIN, 18);
        Font smallerFont = new Font("Leelawadee", Font.PLAIN, 14);

        // Add Futsal Name
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel futsalNameLabel = new JLabel("Futsal Name:");
        futsalNameLabel.setFont(biggerFont);
        futsalPanel.add(futsalNameLabel, gbc);

        gbc.gridx = 1;
        JLabel futsalNameValue = new JLabel(futsal.getFutsalName());
        futsalNameValue.setFont(smallerFont);
        futsalPanel.add(futsalNameValue, gbc);

        // Add Location
        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel locationLabel = new JLabel("Location:");
        locationLabel.setFont(biggerFont);
        futsalPanel.add(locationLabel, gbc);

        gbc.gridx = 1;
        JLabel locationValue = new JLabel(futsal.getFutsalLocation());
        locationValue.setFont(smallerFont);
        futsalPanel.add(locationValue, gbc);

        // Add Type
        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel typeLabel = new JLabel("Type:");
        typeLabel.setFont(biggerFont);
        futsalPanel.add(typeLabel, gbc);

        gbc.gridx = 1;
        JLabel typeValue = new JLabel(futsal.getFutsalType());
        typeValue.setFont(smallerFont);
        futsalPanel.add(typeValue, gbc);

        // Add Price
        gbc.gridx = 0;
        gbc.gridy = 3;
        JLabel priceLabel = new JLabel("Price:");
        priceLabel.setFont(biggerFont);
        futsalPanel.add(priceLabel, gbc);

        gbc.gridx = 1;
        JLabel priceValue = new JLabel(futsal.getFutsalPrice());
        priceValue.setFont(smallerFont);
        futsalPanel.add(priceValue, gbc);

        // Add Opening Time
        gbc.gridx = 0;
        gbc.gridy = 4;
        JLabel openingTimeLabel = new JLabel("Opening time:");
        openingTimeLabel.setFont(biggerFont);
        futsalPanel.add(openingTimeLabel, gbc);

        gbc.gridx = 1;
        JLabel openingTimeValue = new JLabel(futsal.getFutsalOpeningTime());
        openingTimeValue.setFont(smallerFont);
        futsalPanel.add(openingTimeValue, gbc);

        // Add buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton bookNow = new JButton("Book Now!");
        bookNow.setForeground(Color.WHITE);
        bookNow.setBackground(Color.BLUE);
        bookNow.setFont(biggerFont);
        bookNow.setPreferredSize(new Dimension(250, 35));
        buttonPanel.add(bookNow);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        futsalPanel.add(buttonPanel, gbc);

        futsalPanel.setBackground(Color.WHITE);
        return futsalPanel;
    }

    public void setUsername(User user){
        userDashboard.getUsername().setText(userDao.getUsername(user));
    }
}

