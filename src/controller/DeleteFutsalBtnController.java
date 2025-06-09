package controller;

import dao.FutsalDao;
import model.Futsal;
import view.AdminDashboard;
import view.DeleteFutsalBtn;

import javax.swing.*;

public class DeleteFutsalBtnController {
    private final DeleteFutsalBtn deleteFutsalBtn;
    private final FutsalDao futsalDao = new FutsalDao();
    private final AdminDashboard adminDashboard;

    public DeleteFutsalBtnController(DeleteFutsalBtn deleteFutsalBtn, AdminDashboard adminDashboard){
        this.deleteFutsalBtn = deleteFutsalBtn;
        this.adminDashboard = adminDashboard;

        deleteFutsalBtn.getConfirmBtn().addActionListener(e -> confirmDeleteFutsal());
        deleteFutsalBtn.getCancelBtn().addActionListener(e -> cancelDeleteBtn());
    }

    public void openScreen(){
        deleteFutsalBtn.setTitle("Delete futsal confirmation");
        deleteFutsalBtn.setLocationRelativeTo(null);
        deleteFutsalBtn.setResizable(false);
        deleteFutsalBtn.setVisible(true);
    }

    public void closeScreen(){
        deleteFutsalBtn.dispose();
    }

    public void confirmDeleteFutsal(){
        String futsalLocation = deleteFutsalBtn.getFutsalLocation().getText().toLowerCase();

        if (futsalLocation.isEmpty()) {
            JOptionPane.showMessageDialog(deleteFutsalBtn, "Location can not be empty!");
        } else {
            Futsal futsal = new Futsal(futsalLocation);
            boolean validFutsal = futsalDao.removeFutsal(futsal);

            if (validFutsal) {
                AdminDashboardController adminDashboardController = new AdminDashboardController(adminDashboard);
                adminDashboardController.loadFutsalPanels();
                closeScreen();
                JOptionPane.showMessageDialog(deleteFutsalBtn, "Futsal deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(deleteFutsalBtn, "Futsal unable to delete!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void cancelDeleteBtn() {
        closeScreen();
    }
}
