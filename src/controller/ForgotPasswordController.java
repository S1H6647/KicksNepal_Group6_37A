package controller;

import dao.UserDao;
import model.User;
import view.ForgotPasswordScreen;
import view.LandingScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForgotPasswordController {
    ForgotPasswordScreen forgotPasswordScreen = new ForgotPasswordScreen();
    UserDao userDao = new UserDao();
    private final Validation validation = new Validation();

    public ForgotPasswordController (ForgotPasswordScreen forgotPasswordScreen){
        this.forgotPasswordScreen = forgotPasswordScreen;

        forgotPasswordScreen.addConfirmBtnListener(new ConfirmBtnListener());
    }

    public void openScreen(){
        forgotPasswordScreen.setTitle("Forgot Password Screen");
        forgotPasswordScreen.setLocationRelativeTo(null);
        forgotPasswordScreen.setResizable(false);
        forgotPasswordScreen.setVisible(true);
    }

    public void closeScreen(){
        forgotPasswordScreen.dispose();
    }

    class ConfirmBtnListener implements ActionListener  {
        @Override
        public void actionPerformed(ActionEvent ae){
            String email = forgotPasswordScreen.getEmailField().getText().toLowerCase();
            String favFood = forgotPasswordScreen.getFoodField().getText();
            String favPet = forgotPasswordScreen.getPetField().getText();
            String newPassword = new String(forgotPasswordScreen.getNewPasswordField().getPassword());

            if (email.isEmpty() || favFood.isEmpty() ||  favPet.isEmpty() || newPassword.isEmpty()) {
                JOptionPane.showMessageDialog(forgotPasswordScreen, "All fields must be filled.");
            }
            else if (validation.isValidPassword(newPassword)){
                JOptionPane.showMessageDialog(forgotPasswordScreen, "Please enter a stronger password!");
            }

            User user = new User(email, favFood,favPet,newPassword, true);
            boolean isValid = userDao.forgotPassword(user);
            if (isValid){
                JOptionPane.showMessageDialog(forgotPasswordScreen, "Password successfully changed!");
                closeScreen();
                LandingScreen landingScreen = new LandingScreen();
                LandingScreenController landingScreenController = new LandingScreenController(landingScreen);
                landingScreenController.openScreen();
            }
            else {
                JOptionPane.showMessageDialog(forgotPasswordScreen, "Wrong security answers!");
            }
        }
    }
}
