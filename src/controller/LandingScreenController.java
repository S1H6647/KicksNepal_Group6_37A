/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author sanji
 */
public class LandingScreenController {
    private LandingScreen landingScreen = new LandingScreen();
    
    public LandingScreenController(LandingScreen landingScreen){
        this.landingScreen = landingScreen;
        landingScreen.addSignUpBtnListener(new SignUpBtnListener());
        landingScreen.addLoginBtnListener(new LoginBtnListener());
    }
    
    public void openScreen(){
        landingScreen.setTitle("Welcome to KicksNepal");
        landingScreen.setLocationRelativeTo(null);
        landingScreen.setResizable(false);
        landingScreen.setVisible(true);
    }
    
    public void closeScreen(){
        landingScreen.dispose();
    }

    class SignUpBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                closeScreen();
                SignUpScreen signUpScreen = new SignUpScreen();
                SignUpScreenController signUpController = new SignUpScreenController(signUpScreen);
                signUpController.openScreen();
            }
            catch (Exception e){
                System.out.println("Error : " + e.getMessage());
            }
        }
    }
    
    class LoginBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                closeScreen();
                LoginScreen loginScreen = new LoginScreen();
                LoginScreenController loginController = new LoginScreenController(loginScreen);
                loginController.openScreen();
            }
            catch (Exception e){
                System.out.println("Error : " + e.getMessage());
            }
        }
    }
    
}
