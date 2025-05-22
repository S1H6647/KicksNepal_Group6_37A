/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.UserDao;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.User;
import view.LandingScreen;
import view.SignUpScreen;

/**
 *
 * @author sanji
 */
public class LoginScreenController {
    private final UserDao userDao = new UserDao();
    private final SignUpScreen signUpScreen;

    public LoginScreenController(SignUpScreen signUpScreen){
        this.signUpScreen = signUpScreen;
        
        signUpScreen.addSubmitListener(new SubmitListener());
        signUpScreen.addBackBtnListener(new BackBtnListener());
    }

    public void openScreen(){
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
                String email = signUpScreen.getEmailField().getText();
                String password = new String(signUpScreen.getPasswordField().getPassword());
                
                if (email.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(signUpScreen, "All fields must be filled.");
                            return;
                }
                
                User user = new User(email,password);
                boolean exists = userDao.checkUser(user);

                if (exists){
                    JOptionPane.showMessageDialog(signUpScreen, "User already exists!");
                }
                else {
                    userDao.signup(user);
                    JOptionPane.showMessageDialog(signUpScreen, "Registeration successful!");
                    closeScreen();
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
