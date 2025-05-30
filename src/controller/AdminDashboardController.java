/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author sagar
 */

import dao.FutsalDao;
import model.Futsal;
import view.AddFutsal;
import view.AdminDashboard;
import view.AdminDetails;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class AdminDashboardController {
    private final AdminDashboard adminDashboard;
    private final FutsalDao futsalDao = new FutsalDao();

    public AdminDashboardController(AdminDashboard adminDashboard) {
        this.adminDashboard = adminDashboard;

        adminDashboard.adminProfileBtnListener(new AdminDashboardBtnListener());
        adminDashboard.addFutsalBtnListener(new AddFutsalBtnListener());
        loadFutsalPanels();
    }

    public void openScreen() {
        adminDashboard.setTitle("Admin Dashboard");
        adminDashboard.setLocationRelativeTo(null);
        adminDashboard.setResizable(false);
        adminDashboard.setVisible(true);
    }

    public void closeScreen() {
        adminDashboard.dispose();
    }

    class AdminDashboardBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                closeScreen();
                AdminDetails adminDetails = new AdminDetails();
                AdminDetailsController adminDetailsController = new AdminDetailsController(adminDetails);
                adminDetailsController.openScreen();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    class AddFutsalBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae){
            try {
                AddFutsal addFutsal = new AddFutsal();
                AddFutsalController addFutsalController = new AddFutsalController(addFutsal,adminDashboard);
                addFutsalController.openScreen();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    /**
     * Loads all futsal records from the database and creates panels for them.
     */
    private void loadFutsalPanels() {
        try {
            // Set up container panel with FlowLayout and JScrollPane for dynamic display
            JPanel containerPanel = adminDashboard.getContainerPanel();
            adminDashboard.getContainerPanel().setLayout(new GridLayout(2,3,10,10));

            // Clear existing panels
            containerPanel.removeAll();

            // Fetch all futsal from database
            List<Futsal> futsalArrayList = futsalDao.getAllFutsals(); // Assumed method
            for (Futsal futsal : futsalArrayList) {
                JPanel futsalPanel = createFutsalPanel(futsal);
                containerPanel.add(futsalPanel);
            }

            containerPanel.revalidate();
            containerPanel.repaint();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(adminDashboard, "Error loading futsals: " + e.getMessage());
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
        JButton editBtn = new JButton("Edit");
        editBtn.setBackground(Color.GREEN);
        editBtn.setFont(biggerFont);
        editBtn.setPreferredSize(new Dimension(150, 35));
        buttonPanel.add(editBtn);

        JButton deleteBtn = new JButton("Delete");
        deleteBtn.setBackground(Color.RED);
        deleteBtn.setFont(biggerFont);
        deleteBtn.setPreferredSize(new Dimension(150, 35));
        buttonPanel.add(deleteBtn);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        futsalPanel.add(buttonPanel, gbc);

        futsalPanel.setBackground(Color.WHITE);
        return futsalPanel;
    }
}