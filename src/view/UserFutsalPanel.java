/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import javax.swing.*;

/**
 *
 * @author sanji
 */
public class UserFutsalPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminFutsalPanell
     */
    public UserFutsalPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        MainArea = new javax.swing.JPanel();
        futsalNameText = new javax.swing.JLabel();
        futsalLocationText = new javax.swing.JLabel();
        futsalTypeLocation = new javax.swing.JLabel();
        futsalPriceText = new javax.swing.JLabel();
        futsalOpeningTimeText = new javax.swing.JLabel();
        futsalNameField = new javax.swing.JLabel();
        futsalLocationField = new javax.swing.JLabel();
        futsalTypeField = new javax.swing.JLabel();
        futsalPriceField = new javax.swing.JLabel();
        futsalOpeningTimeField = new javax.swing.JLabel();
        bookNowBtn = new javax.swing.JButton();

        MainArea.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.GridBagLayout MainAreaLayout = new java.awt.GridBagLayout();
        MainAreaLayout.columnWidths = new int[] {0, 60, 0, 60, 0};
        MainAreaLayout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        MainArea.setLayout(MainAreaLayout);

        futsalNameText.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        futsalNameText.setText("Futsal Name :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        MainArea.add(futsalNameText, gridBagConstraints);

        futsalLocationText.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        futsalLocationText.setText("Location :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        MainArea.add(futsalLocationText, gridBagConstraints);

        futsalTypeLocation.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        futsalTypeLocation.setText("Type :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        MainArea.add(futsalTypeLocation, gridBagConstraints);

        futsalPriceText.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        futsalPriceText.setText("Price :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        MainArea.add(futsalPriceText, gridBagConstraints);

        futsalOpeningTimeText.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        futsalOpeningTimeText.setText("Opening Time :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        MainArea.add(futsalOpeningTimeText, gridBagConstraints);

        futsalNameField.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        futsalNameField.setText("name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        MainArea.add(futsalNameField, gridBagConstraints);

        futsalLocationField.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        futsalLocationField.setText("location");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        MainArea.add(futsalLocationField, gridBagConstraints);

        futsalTypeField.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        futsalTypeField.setText("type");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        MainArea.add(futsalTypeField, gridBagConstraints);

        futsalPriceField.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        futsalPriceField.setText("price");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        MainArea.add(futsalPriceField, gridBagConstraints);

        futsalOpeningTimeField.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        futsalOpeningTimeField.setText("time");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        MainArea.add(futsalOpeningTimeField, gridBagConstraints);

        bookNowBtn.setBackground(new java.awt.Color(0, 0, 255));
        bookNowBtn.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        bookNowBtn.setForeground(new java.awt.Color(255, 255, 255));
        bookNowBtn.setText("Book Now");
        bookNowBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        MainArea.add(bookNowBtn, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainArea, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public JPanel getMainArea() { return MainArea; }
    
    public JButton getBookNowBtn() { return bookNowBtn; }

    public JLabel getFutsalNameField() { return futsalNameField; }
    public JLabel getFutsalLocationField() { return futsalLocationField; }
    public JLabel getFutsalTypeField() { return futsalTypeField; }
    public JLabel getFutsalPriceField() { return futsalPriceField; }
    public JLabel getFutsalOpeningTimeField() { return futsalOpeningTimeField; }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainArea;
    private javax.swing.JButton bookNowBtn;
    private javax.swing.JLabel futsalLocationField;
    private javax.swing.JLabel futsalLocationText;
    private javax.swing.JLabel futsalNameField;
    private javax.swing.JLabel futsalNameText;
    private javax.swing.JLabel futsalOpeningTimeField;
    private javax.swing.JLabel futsalOpeningTimeText;
    private javax.swing.JLabel futsalPriceField;
    private javax.swing.JLabel futsalPriceText;
    private javax.swing.JLabel futsalTypeField;
    private javax.swing.JLabel futsalTypeLocation;
    // End of variables declaration//GEN-END:variables
}
