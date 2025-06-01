/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author sagar
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AdminDetails;
import view.ForgotPasswordScreen;
import view.LandingScreen;
import view.SecurityQuestionScreen;

public class AdminDetailsController {
    private final AdminDetails adminDetails;

    public AdminDetailsController(AdminDetails adminDetails){
        this.adminDetails = adminDetails;

        adminDetails.logoutBtnListener(new LogoutBtnListener());
    }

    public void openScreen(){
        adminDetails.setTitle("Admin Details");
        adminDetails.setLocationRelativeTo(null);
        adminDetails.setResizable(false);
        adminDetails.setVisible(true);
    }

    public void closeScreen(){
        adminDetails.dispose();
    }

    class LogoutBtnListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            try {
                JOptionPane.showMessageDialog(adminDetails, "Successfully Logged out!");
                closeScreen();
                LandingScreen landingScreen = new LandingScreen();
                LandingScreenController landingScreenController = new LandingScreenController(landingScreen);
                landingScreenController.openScreen();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
