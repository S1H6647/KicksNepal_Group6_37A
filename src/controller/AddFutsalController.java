package controller;

import dao.FutsalDao;
import model.Futsal;
import view.AddFutsal;
import view.AdminDashboard;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author sanji
 */
public class AddFutsalController {
    private final AddFutsal addFutsal;
    private final AdminDashboard adminDashboard;
    private final FutsalDao futsalDao = new FutsalDao();
    private int panelCount = 0;

    public AddFutsalController(AddFutsal addFutsal, AdminDashboard adminDashboard) {
        this.adminDashboard = adminDashboard;
        this.addFutsal = addFutsal;

        addFutsal.setAddBtnListener(e -> addFutsalBtnListener());
        addFutsal.setCancelBtnListener(e -> cancelFutsalBtnListener());

        adminDashboard.getContainerPanel().setLayout(new GridLayout(2,3,12,12));
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

    private JPanel createFutsalPanel(Futsal futsal) {
        if (panelCount >= 6) {
            JOptionPane.showMessageDialog(addFutsal, "Maximum limit of 6 futsals reached!");
            closeScreen();
            return null;
        }

        JPanel futsalPanel = new JPanel();
        futsalPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(12, 12, 12, 12);
        gbc.anchor = GridBagConstraints.WEST;

        // Set fonts for components
        Font biggerFont = new Font("Leelawadee", Font.PLAIN, 18);
        Font smallerFont = new Font("Leelawadee", Font.PLAIN, 14);

        // Add Futsal Name
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel futsalNameLabel = new JLabel("Futsal Name :");
        futsalNameLabel.setFont(biggerFont);
        futsalPanel.add(futsalNameLabel, gbc);

        gbc.gridx = 1;
        JLabel futsalNameValue = new JLabel(futsal.getFutsalName());
        futsalNameValue.setFont(smallerFont);
        futsalPanel.add(futsalNameValue, gbc);

        // Add Location
        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel locationLabel = new JLabel("Location :");
        locationLabel.setFont(biggerFont);
        futsalPanel.add(locationLabel, gbc);

        gbc.gridx = 1;
        JLabel locationValue = new JLabel(futsal.getFutsalLocation());
        locationValue.setFont(smallerFont);
        futsalPanel.add(locationValue, gbc);

        // Add Type
        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel typeLabel = new JLabel("Type :");
        typeLabel.setFont(biggerFont);
        futsalPanel.add(typeLabel, gbc);

        gbc.gridx = 1;
        JLabel typeValue = new JLabel(futsal.getFutsalType());
        typeValue.setFont(smallerFont);
        futsalPanel.add(typeValue, gbc);

        // Add Price
        gbc.gridx = 0;
        gbc.gridy = 3;
        JLabel priceLabel = new JLabel("Price :");
        priceLabel.setFont(biggerFont);
        futsalPanel.add(priceLabel, gbc);

        gbc.gridx = 1;
        JLabel priceValue = new JLabel(futsal.getFutsalPrice());
        priceValue.setFont(smallerFont);
        futsalPanel.add(priceValue, gbc);

        // Add Opening Time
        gbc.gridx = 0;
        gbc.gridy = 4;
        JLabel openingTimeLabel = new JLabel("Opening time :");
        openingTimeLabel.setFont(biggerFont);
        futsalPanel.add(openingTimeLabel, gbc);

        gbc.gridx = 1;
        JLabel openingTimeValue = new JLabel(futsal.getFutsalOpeningTime());
        openingTimeValue.setFont(smallerFont);
        futsalPanel.add(openingTimeValue, gbc);

        // Add Edit button directly to futsalPanel
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton editBtn = new JButton("Edit");
        editBtn.setBackground(Color.GREEN);
        editBtn.setFont(biggerFont);
        editBtn.setPreferredSize(new Dimension(150, 35));
        futsalPanel.add(editBtn, gbc);

        // Add Delete button directly to futsalPanel
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton deleteBtn = new JButton("Delete");
        deleteBtn.setBackground(Color.RED);
        deleteBtn.setFont(biggerFont);
        deleteBtn.setPreferredSize(new Dimension(150, 35));
        futsalPanel.add(deleteBtn, gbc);

        futsalPanel.setBackground(Color.WHITE);
        return futsalPanel;
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
            } else {
                Futsal futsal = new Futsal(futsalName, futsalLocation, futsalType, futsalPrice, futsalOpeningTime);
                boolean validFutsal = futsalDao.checkFutsal(futsal);

                if (validFutsal) {
                    JOptionPane.showMessageDialog(addFutsal, "Futsal already exists!");
                } else {
                    futsalDao.addFutsal(futsal);

                    // Add the futsalPanel to the container panel (assumed to be BorderLayout)
                    JPanel futsalPanel = createFutsalPanel(futsal);
                    if (futsalPanel != null) { // Check if panel creation was successful
                        adminDashboard.getContainerPanel().add(futsalPanel);
                        panelCount++;
                        adminDashboard.getContainerPanel().revalidate();
                        adminDashboard.getContainerPanel().repaint();
                        JOptionPane.showMessageDialog(addFutsal, "Futsal added successfully!");
                        closeScreen();
                    }
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