package controller;

import view.ForgotPasswordScreen;
import view.LandingScreen;
import view.SecurityQuestionScreen;
import view.UserDetails;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserDetailsController {
    private final UserDetails userDetails;

    public UserDetailsController(UserDetails userDetails){
        this.userDetails = userDetails;

        userDetails.logoutBtnListener(new LogoutBtnListener());
        userDetails.changePasswordBtnListener(new ChangePasswordListener());
    }

    public void openScreen(){
        userDetails.setTitle("User Details");
        userDetails.setLocationRelativeTo(null);
        userDetails.setResizable(false);
        userDetails.setVisible(true);
    }

    public void closeScreen(){
        userDetails.dispose();
    }

    class LogoutBtnListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            try {
                JOptionPane.showMessageDialog(userDetails,"Successfully Logged out!");
                closeScreen();
                LandingScreen landingScreen = new LandingScreen();
                LandingScreenController landingScreenController = new LandingScreenController(landingScreen);
                landingScreenController.openScreen();
            } catch (Exception e) {
                System.out.println("Error : "+ e.getMessage());
            }
        }
    }
    
    class ChangePasswordListener implements ActionListener{
        @Override 
        public void actionPerformed(ActionEvent ae){
            try {
                closeScreen();
                ForgotPasswordScreen forgotPasswordScreen = new ForgotPasswordScreen();
                ForgotPasswordController forgotPasswordController = new ForgotPasswordController(forgotPasswordScreen);
                forgotPasswordController.openScreen();
            } catch (Exception e) {
                System.out.println("Error : "+ e.getMessage());
            }
        }
    }
}
