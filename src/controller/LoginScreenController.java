/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.UserDao;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import model.User;
import view.*;

/**
 *
 * @author sanji
 */
public class LoginScreenController {
    private final UserDao userDao = new UserDao();
    private final LoginScreen loginScreen;
    public JButton deleteBtn = new JButton("Delete");

    public LoginScreenController(LoginScreen loginScreen){
        this.loginScreen = loginScreen;
        
        loginScreen.addLoginBtnListener(new LoginBtnListener());
        loginScreen.addBackBtnListener(new BackBtnListener());
        loginScreen.addForgotPasswordBtnListener(new ForgotPasswordListener());
    }

    public void openScreen(){
        loginScreen.setTitle("Login Screen");
        loginScreen.setLocationRelativeTo(null);
        loginScreen.setResizable(false);
        loginScreen.setVisible(true);
    }

    public void closeScreen(){
        loginScreen.dispose();
    }

    class LoginBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae){
            try {
                String email = loginScreen.getEmailField().getText();
                String password = new String(loginScreen.getPasswordField().getPassword());
                
                if (email.equals(" Enter your email")){
                        JOptionPane.showMessageDialog(loginScreen, "Please enter your email!");
                        return;
                    }
                else if (email.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(loginScreen, "All fields must be filled.");
                            return;
                }
                
                User user = new User(email,password);
                if (user.getEmail().equals("useradmin@gmail.com") && user.getPassword().equals("useradmin")){
                    JOptionPane.showMessageDialog(loginScreen, "Welcome to Admin Dashboard");
                    closeScreen();
                    AdminDashboard adminDashboard = new AdminDashboard();
                    AdminDashboardController adminDashboardController = new AdminDashboardController(adminDashboard);
                    adminDashboardController.openScreen();
                }
                else {
                    boolean validLogin = userDao.login(user);

                    if (!validLogin) {
                        JOptionPane.showMessageDialog(loginScreen, "Invalid credentials or User doesn't exist.");
                    } else {
                        JOptionPane.showMessageDialog(loginScreen, "Login successful.");
                        closeScreen();
                        UserDashboard userDashboard = new UserDashboard();
                        UserDashboardController userDashboardController = new UserDashboardController(userDashboard, user);
                        userDashboardController.openScreen();
                    }
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
    
    class ForgotPasswordListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae){
            try {
                closeScreen();
                ForgotPasswordScreen forgotPasswordScreen = new ForgotPasswordScreen();
                ForgotPasswordController forgotPasswordController = new ForgotPasswordController(forgotPasswordScreen);
                forgotPasswordController.openScreen();
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }
        }
    }
}
