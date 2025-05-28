/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.UserDashboard;
import view.UserDetails;

/**
 *
 * @author sanji
 */
public class UserDashboardController {
    private final UserDashboard userDashboard;
    
    public UserDashboardController(UserDashboard userDashboard){
        this.userDashboard = userDashboard;
        
        userDashboard.userProfileBtnListener(new UserDashboardBtnListener());
    }
    
    public void openScreen(){
        userDashboard.setTitle("UserDashboard");
        userDashboard.setLocationRelativeTo(null);
        userDashboard.setResizable(false);
        userDashboard.setVisible(true);
    }
    
    public void closeScreen(){
        userDashboard.dispose();
    }
    
    class UserDashboardBtnListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ae){
        try {
            closeScreen();
            UserDetails userDetails = new UserDetails();
            UserDetailsController userDetailsController = new UserDetailsController(userDetails);
            userDetailsController.openScreen();
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}

}

