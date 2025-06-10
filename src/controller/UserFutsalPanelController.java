package controller;

import model.Futsal;
import model.User;
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
    private final User user;


    public UserFutsalPanelController(UserFutsalPanel userFutsalPanel, UserDashboard userDashboard, Futsal futsal, User user){
        this.userFutsalPanel = userFutsalPanel;
        this.userDashboard = userDashboard;
        this.futsal = futsal;
        this.user = user;
        userFutsalPanel.getBookNowBtn().addActionListener(e -> bookNowPanel());
    }

    public JPanel openScreen(){
        return userFutsalPanel.getMainArea();
    }

    public void bookNowPanel() {
        BookNowScreenController bookNowScreenController = new BookNowScreenController(bookNowScreen, userDashboard, futsal, user);
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
