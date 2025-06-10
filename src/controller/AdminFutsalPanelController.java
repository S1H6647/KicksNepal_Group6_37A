package controller;

import model.Futsal;
import view.AdminDashboard;
import view.AdminFutsalPanel;
import view.DeleteFutsalBtn;
import view.EditFutsalBtn;

import javax.swing.*;

public class AdminFutsalPanelController {
    private final AdminFutsalPanel adminFutsalPanel;
    private final AdminDashboard adminDashboard;

    public AdminFutsalPanelController(AdminFutsalPanel adminFutsalPanel, AdminDashboard adminDashboard){
        this.adminFutsalPanel = adminFutsalPanel;
        this.adminDashboard = adminDashboard;

        adminFutsalPanel.getDeleteBtn().addActionListener(e -> deleteFutsalPanel());
        adminFutsalPanel.getEditBtn().addActionListener(e -> editFutsalPanel());
    }

    public JPanel openScreen(){
        return adminFutsalPanel.getMainArea();
    }

    public void deleteFutsalPanel() {
        DeleteFutsalBtn deleteFutsalBtn = new DeleteFutsalBtn();
        DeleteFutsalBtnController deleteFutsalBtnController = new DeleteFutsalBtnController(deleteFutsalBtn, adminDashboard);
        deleteFutsalBtnController.openScreen();
    }

    public void editFutsalPanel(){
        EditFutsalBtn editFutsalBtn = new EditFutsalBtn();
        EditFutsalBtnController editFutsalBtnController = new EditFutsalBtnController(editFutsalBtn, adminDashboard);
        editFutsalBtnController.openScreen();
    }

    public void populatePanel(Futsal futsal) {
        adminFutsalPanel.getFutsalNameField().setText(futsal.getFutsalName());
        adminFutsalPanel.getFutsalLocationField().setText(futsal.getFutsalLocation());
        adminFutsalPanel.getFutsalTypeField().setText(futsal.getFutsalType());
        adminFutsalPanel.getFutsalPriceField().setText(futsal.getFutsalPrice());
        adminFutsalPanel.getFutsalOpeningTimeField().setText(futsal.getFutsalOpeningTime());
    }
}
