/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.UserDao;
import model.User;
import view.SecurityQuestionScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.LandingScreen;

/**
 *
 * @author sanji
 */
public class SecurityQuestionController {
    private final UserDao userDao = new UserDao();
    private final SecurityQuestionScreen securityQuestionScreen;
    private final Validation validation = new Validation();
    private final LandingScreen landingScreen = new LandingScreen();
    
    public SecurityQuestionController(SecurityQuestionScreen securityQuestionScreen){
        this.securityQuestionScreen = securityQuestionScreen;

        securityQuestionScreen.addSubmitBtnListener(new SubmitBtnListener());
    }

    public void openScreen(){
        securityQuestionScreen.setTitle("Security Questions");
        securityQuestionScreen.setVisible(true);
        securityQuestionScreen.setLocationRelativeTo(null);
        securityQuestionScreen.setResizable(false);
    }

    public void closeScreen(){
        securityQuestionScreen.dispose();
    }
    
    class SubmitBtnListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            try {
                String email = securityQuestionScreen.getEmailField().getText().toLowerCase();
                String favFood = securityQuestionScreen.getFoodField().getText().toLowerCase();
                String favPet = securityQuestionScreen.getPetField().getText();

                if (validation.isValidEmail(email)){
                    JOptionPane.showMessageDialog(securityQuestionScreen, "Invalid email.");
                    return;
                }

                User user = new User(email, favFood, favPet);
                boolean exists = userDao.questions(user);
                if (exists){
                    JOptionPane.showMessageDialog(securityQuestionScreen, "Security Questions successfully set!");
                    closeScreen();
                    LandingScreen landingScreen = new LandingScreen();
                    LandingScreenController landingScreenController = new LandingScreenController(landingScreen);
                    landingScreenController.openScreen();
                }
                else {
                    JOptionPane.showMessageDialog(securityQuestionScreen, "Invalid credentials, Please try again!");
                }
            }
            catch (Exception e){
                System.out.println("Error " + e.getMessage());
            }
        }
    }
}
