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
import view.AdminFutsalPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import view.LandingScreen;

public class AdminDashboardController {
    private AdminDashboard adminDashboard;
    private final FutsalDao futsalDao = new FutsalDao();

    public AdminDashboardController(AdminDashboard adminDashboard) {
        this.adminDashboard = adminDashboard;
        
        adminDashboard.logoutBtnListener(new LogoutBtnListener());
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
    class LogoutBtnListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            try {
                JOptionPane.showMessageDialog(adminDashboard, "Successfully Logged out!");
                closeScreen();
                LandingScreen landingScreen = new LandingScreen();
                LandingScreenController landingScreenController = new LandingScreenController(landingScreen);
                landingScreenController.openScreen();
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
    public void loadFutsalPanels() {
        try {
            List<Futsal> futsalArrayList = futsalDao.getAllFutsals();

            // Get the panel and clear its existing components
            JPanel Frame1 = adminDashboard.getPanel();
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
            JOptionPane.showMessageDialog(adminDashboard, "Error loading futsals: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Creates a futsal panel with the provided details.
     */
    private JPanel createFutsalPanel(Futsal futsal) {
        AdminFutsalPanel newPanel = new AdminFutsalPanel();
        AdminFutsalPanelController controller = new AdminFutsalPanelController(newPanel, adminDashboard);
        controller.populatePanel(futsal);
        JPanel mainArea = newPanel.getMainArea();
        mainArea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        mainArea.setPreferredSize(new Dimension(400, 300));
        return mainArea;
    }
}