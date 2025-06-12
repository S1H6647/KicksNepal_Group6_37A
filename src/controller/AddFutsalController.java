package controller;

import dao.FutsalDao;
import model.Futsal;
import view.AddFutsal;
import view.AdminDashboard;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.*;

/**
 *
 * @author sanji
 */
public class AddFutsalController {
    private final AddFutsal addFutsal;
    private AdminDashboard adminDashboard;
    private final FutsalDao futsalDao = new FutsalDao();

    public AddFutsalController(AddFutsal addFutsal, AdminDashboard adminDashboard) {
        this.adminDashboard = adminDashboard;
        this.addFutsal = addFutsal;

        addFutsal.setAddBtnListener(e -> addFutsalBtnListener());
        addFutsal.setCancelBtnListener(e -> cancelFutsalBtnListener());
    }

    public void openScreen() {
        addFutsal.setTitle("Add Futsal to the List");
        addFutsal.setLocationRelativeTo(null);
        addFutsal.setResizable(false);
        addFutsal.setVisible(true);
    }

    public void closeScreen() {
        addFutsal.dispose();
    }

    public void addFutsalBtnListener() {
        try {
            String futsalName = addFutsal.getFutsalField().getText().toLowerCase();
            String futsalLocation = addFutsal.getLocationField().getText().toLowerCase();
            String futsalType = addFutsal.getTypeField().getText().toLowerCase();
            String futsalPrice = addFutsal.getPriceField().getText();
            String futsalOpeningTime = addFutsal.getOpenTimeField().getText();

            if (futsalName.isEmpty() || futsalLocation.isEmpty() || futsalType.isEmpty() || futsalPrice.isEmpty() || futsalOpeningTime.isEmpty()) {
                JOptionPane.showMessageDialog(addFutsal, "All fields must be filled!");
            } else if (Integer.parseInt(futsalPrice) < 1000){
                JOptionPane.showMessageDialog(addFutsal, "Price can not be lower than Rs. 1000", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else {
                Futsal futsal = new Futsal(futsalName, futsalLocation, futsalType, futsalPrice, futsalOpeningTime);
                boolean validFutsal = futsalDao.checkFutsal(futsal);

                if (validFutsal) {
                    JOptionPane.showMessageDialog(addFutsal, "Futsal already exists!");
                } else {
                    futsalDao.addFutsal(futsal);
                    AdminDashboardController adminDashboardController = new AdminDashboardController(adminDashboard);
                    adminDashboardController.loadFutsalPanels();
                    JOptionPane.showMessageDialog(addFutsal, "Futsal added successfully!");
                    closeScreen();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void cancelFutsalBtnListener() {
        closeScreen();
    }

}