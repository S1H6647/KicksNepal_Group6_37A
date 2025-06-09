package controller;

import model.Futsal;
import view.AdminDashboard;
import view.BookNowScreen;
import view.UserDashboard;
import view.UserFutsalPanel;

import javax.swing.*;

public class UserFutsalPanelController {
    private final UserFutsalPanel userFutsalPanel;
    private final BookNowScreen bookNowScreen = new BookNowScreen();
    private UserDashboard userDashboard;
    private Futsal futsal;


    public UserFutsalPanelController(UserFutsalPanel userFutsalPanel, UserDashboard userDashboard, Futsal futsal){
        this.userFutsalPanel = userFutsalPanel;
        this.userDashboard = userDashboard;
        this.futsal = futsal;
        userFutsalPanel.getBookNowBtn().addActionListener(e -> bookNowPanel());
    }

    public JPanel openScreen(){
        return userFutsalPanel.getMainArea();
    }

    public void bookNowPanel() {
        BookNowScreenController bookNowScreenController = new BookNowScreenController(bookNowScreen, userDashboard, futsal);
        bookNowScreenController.openScreen();
    }

    public void populatePanel(Futsal futsal) {
        this.futsal = futsal;
        userFutsalPanel.getFutsalNameField().setText(futsal.getFutsalName());
        userFutsalPanel.getFutsalLocationField().setText(futsal.getFutsalLocation());
        userFutsalPanel.getFutsalTypeField().setText(futsal.getFutsalType());
        userFutsalPanel.getFutsalPriceField().setText(futsal.getFutsalPrice());
        userFutsalPanel.getFutsalOpeningTimeField().setText(futsal.getFutsalOpeningTime());
    }
}
