/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;

/**
 *
 * @author sagar
 */
public class BookNowScreen extends javax.swing.JFrame {

    /**
     * Creates new form booknowform
     */
    public BookNowScreen() {
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

        bookNowBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        bookingDurationField = new javax.swing.JTextField();
        bookingDateText = new javax.swing.JLabel();
        bookingDateField = new com.toedter.calendar.JDateChooser();
        bookingDurationText = new javax.swing.JLabel();
        BookFutsalTitle = new javax.swing.JLabel();
        futsalNameField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bookNowBtn.setBackground(new java.awt.Color(51, 255, 0));
        bookNowBtn.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        bookNowBtn.setText("BOOK NOW");
        bookNowBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bookNowBtn.setBorderPainted(false);
        bookNowBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cancelBtn.setBackground(new java.awt.Color(255, 51, 51));
        cancelBtn.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        cancelBtn.setText("CANCEL BOOKING");
        cancelBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cancelBtn.setBorderPainted(false);
        cancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        bookingDateText.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        bookingDateText.setText("Booking Date");

        bookingDurationText.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        bookingDurationText.setText("Booking Duration (1 - 3 hrs)");

        BookFutsalTitle.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        BookFutsalTitle.setText("BOOK FUTSAL : ");

        futsalNameField.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        futsalNameField.setText("name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookingDurationText)
                            .addComponent(bookingDateText)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BookFutsalTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(futsalNameField))
                            .addComponent(bookingDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(bookingDurationField, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bookNowBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookFutsalTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(futsalNameField))
                .addGap(48, 48, 48)
                .addComponent(bookingDateText)
                .addGap(18, 18, 18)
                .addComponent(bookingDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bookingDurationText)
                .addGap(18, 18, 18)
                .addComponent(bookingDurationField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookNowBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getFutsalNameField() { return futsalNameField; }
    
    public JDateChooser getBookingDate() { return bookingDateField; }
    public JTextField getBookingDuration() { return bookingDurationField; }
    
    public JButton getBookNowBtn() { return bookNowBtn; }
    public JButton getCancelBtn() { return cancelBtn; }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookNowScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookNowScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookNowScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookNowScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookNowScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookFutsalTitle;
    private javax.swing.JButton bookNowBtn;
    private com.toedter.calendar.JDateChooser bookingDateField;
    private javax.swing.JLabel bookingDateText;
    private javax.swing.JTextField bookingDurationField;
    private javax.swing.JLabel bookingDurationText;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel futsalNameField;
    // End of variables declaration//GEN-END:variables
}
