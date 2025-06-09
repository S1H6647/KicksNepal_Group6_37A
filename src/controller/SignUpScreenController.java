/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.UserDao;
import java.awt.HeadlessException;
import model.User;
import view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author sanji
 */
public class SignUpScreenController {
    private final UserDao userDao = new UserDao();
    private final SignUpScreen signUpScreen;
    private final Validation validation = new Validation();

    public SignUpScreenController(SignUpScreen signUpScreen){
        this.signUpScreen = signUpScreen;
        
        signUpScreen.addSubmitListener(new SubmitListener());
        signUpScreen.addBackBtnListener(new BackBtnListener());
    }

    public void openScreen(){
        signUpScreen.setTitle("Sign Up Screen");
        signUpScreen.setLocationRelativeTo(null);
        signUpScreen.setResizable(false);
        signUpScreen.setVisible(true);
    }

    public void closeScreen(){
        signUpScreen.dispose();
    }

    class SubmitListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae){
            try {
                String name = signUpScreen.getNameField().getText().toLowerCase();
                String email = signUpScreen.getEmailField().getText().toLowerCase();
                String phoneNum = signUpScreen.getPhoneField().getText();
                String password = new String(signUpScreen.getPasswordField().getPassword());
                
                if (name.equals(" Enter your name") && phoneNum.equals(" Enter your phone number") && email.equals(" Enter your email")){
                    JOptionPane.showMessageDialog(signUpScreen, "All fields must be filled.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                else if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(signUpScreen, "All fields must be filled.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                } else if (!validation.isValidPhoneNumber(phoneNum)) {
                    JOptionPane.showMessageDialog(signUpScreen, "Invalid Phone format.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                } else if (validation.isValidEmail(email)) {
                    JOptionPane.showMessageDialog(signUpScreen, "Invalid Email format.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                } else if (validation.isValidPassword(password)) {
                    JOptionPane.showMessageDialog(signUpScreen, "Password must contain at least 1 of Uppercase letter, Lowercase letter, Special character and Number.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                User user = new User(name,phoneNum,email,password);
                boolean exists = userDao.checkUser(user);

                if (exists){
                    JOptionPane.showMessageDialog(signUpScreen, "User already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    userDao.signup(user);
                    JOptionPane.showMessageDialog(signUpScreen, "Registration successful!");
                    SecurityQuestionScreen securityQuestionScreen = new SecurityQuestionScreen();
                    SecurityQuestionController securityQuestionController = new SecurityQuestionController(securityQuestionScreen);
                    securityQuestionController.openScreen();
                }
            }
            catch (HeadlessException he){
                System.out.println("Error adding user :"+ he.getMessage());
            }
        }
    }
    
    class BackBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae){
            try {
                closeScreen();
                LandingScreen landingScreen = new LandingScreen();
                LandingScreenController landingScreenController = new LandingScreenController(landingScreen);
                landingScreenController.openScreen();
            }
            catch (Exception e){
                System.out.println("Error " + e.getMessage());
            }
        }
    }
}
