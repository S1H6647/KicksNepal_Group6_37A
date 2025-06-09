package controller;

import dao.FutsalDao;
import model.Futsal;
import view.AdminDashboard;
import view.EditFutsalBtn;

import javax.swing.*;

public class EditFutsalBtnController {
    private final EditFutsalBtn editFutsalBtn;
    private final FutsalDao futsalDao = new FutsalDao();

    public EditFutsalBtnController(EditFutsalBtn editFutsalBtn){
        this.editFutsalBtn = editFutsalBtn;
        Futsal futsal = new Futsal();
        editFutsalBtn.getConfirmBtn().addActionListener(e -> editConfirmBtn(futsal));
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

    public void editConfirmBtn(Futsal futsal){
        openScreen();
        String futsalName = editFutsalBtn.getFutsalField().getText().toLowerCase();
        System.out.println(futsalName);
        String futsalLocation = editFutsalBtn.getLocationField().getText().toLowerCase();
        System.out.println(futsalLocation);
        String futsalType = editFutsalBtn.getTypeField().getText().toLowerCase();
        System.out.println(futsalType);
        String futsalPrice = editFutsalBtn.getPriceField().getText();
        System.out.println(futsalPrice);
        String futsalOpeningTime = editFutsalBtn.getOpenTimeField().getText();
        System.out.println(futsalOpeningTime);

        if (futsalName.isEmpty() || futsalLocation.isEmpty() || futsalType.isEmpty() || futsalPrice.isEmpty() || futsalOpeningTime.isEmpty()) {
            JOptionPane.showMessageDialog(editFutsalBtn, "All fields must be filled!");
        } else {
            futsal = new Futsal(futsalName,futsalLocation, futsalType, futsalPrice, futsalOpeningTime);
            futsalDao.editFutsal(futsal);
            JOptionPane.showMessageDialog(editFutsalBtn, "Futsal update successfully!");
            closeScreen();
            }
        }

    public void editCancelBtn(){
        closeScreen();
    }
}
