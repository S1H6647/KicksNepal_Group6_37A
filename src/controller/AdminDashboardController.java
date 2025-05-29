/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author sagar
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AdminDashboard;
import view.AdminDetails;

public class AdminDashboardController {
    private final AdminDashboard adminDashboard;
    
    public AdminDashboardController(AdminDashboard adminDashboard) {
        this.adminDashboard = adminDashboard;

        adminDashboard.adminProfileBtnListener(new AdminDashboardBtnListener());
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
}
