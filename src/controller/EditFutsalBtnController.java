package controller;

import dao.FutsalDao;
import model.Futsal;
import view.AdminDashboard;
import view.EditFutsalBtn;

import javax.swing.*;

public class EditFutsalBtnController {
    private final EditFutsalBtn editFutsalBtn;
    private final FutsalDao futsalDao = new FutsalDao();
    private final AdminDashboard adminDashboard;

    public EditFutsalBtnController(EditFutsalBtn editFutsalBtn, AdminDashboard adminDashboard){
        this.editFutsalBtn = editFutsalBtn;
        this.adminDashboard = adminDashboard;
        editFutsalBtn.getConfirmBtn().addActionListener(e -> editConfirmBtn());
        editFutsalBtn.getCancelBtn().addActionListener(e -> editCancelBtn());
    }

    public void openScreen(){
        editFutsalBtn.setTitle("Edit futsal");
        editFutsalBtn.setLocationRelativeTo(null);
        editFutsalBtn.setResizable(false);
        editFutsalBtn.setVisible(true);
    }

    public void closeScreen(){
        editFutsalBtn.dispose();
    }

    public void editConfirmBtn(){
        openScreen();
        String futsalName = editFutsalBtn.getFutsalField().getText().toLowerCase();
        String futsalLocation = editFutsalBtn.getLocationField().getText().toLowerCase();
        String futsalType = editFutsalBtn.getTypeField().getText().toLowerCase();
        String futsalPrice = editFutsalBtn.getPriceField().getText();
        String futsalOpeningTime = editFutsalBtn.getOpenTimeField().getText();

        System.out.println(futsalName);
        System.out.println(futsalLocation);
        System.out.println(futsalType);
        System.out.println(futsalPrice);
        System.out.println(futsalOpeningTime);


        if (futsalName.isEmpty() || futsalLocation.isEmpty() || futsalType.isEmpty() || futsalPrice.isEmpty() || futsalOpeningTime.isEmpty()) {
            JOptionPane.showMessageDialog(editFutsalBtn, "All fields must be filled!");
        } else {
            Futsal futsal = new Futsal(futsalName, futsalLocation, futsalType, futsalPrice, futsalOpeningTime);
            futsalDao.editFutsal(futsal);
            AdminDashboardController adminDashboardController = new AdminDashboardController(adminDashboard);
            adminDashboardController.loadFutsalPanels();
            closeScreen();
            JOptionPane.showMessageDialog(editFutsalBtn, "Futsal update successfully!");
            }
        }

    public void editCancelBtn(){
        closeScreen();
    }
}
