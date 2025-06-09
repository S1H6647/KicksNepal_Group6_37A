package view;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author sanji
 */
public class SignUpScreen extends javax.swing.JFrame {

    public SignUpScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SignUpForm = new javax.swing.JPanel();
        SignUpText = new javax.swing.JLabel();
        nameText = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        phoneText = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        emailText = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passwordText = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        SignUpBtn = new javax.swing.JButton();
        showPasswordBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        SignUpText.setFont(new java.awt.Font("Leelawadee", 0, 72)); // NOI18N
        SignUpText.setText("Sign Up");

        nameText.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        nameText.setText("Full Name :");

        nameField.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        nameField.setForeground(new java.awt.Color(102, 102, 102));
        nameField.setText(" Enter your name");
        nameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFieldFocusLost(evt);
            }
        });

        phoneText.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        phoneText.setText("Phone No.:");

        phoneField.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        phoneField.setForeground(new java.awt.Color(102, 102, 102));
        phoneField.setText(" Enter your phone number");
        phoneField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneFieldFocusLost(evt);
            }
        });

        emailText.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        emailText.setText("Email :");

        emailField.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        emailField.setForeground(new java.awt.Color(102, 102, 102));
        emailField.setText(" Enter your email");
        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFieldFocusLost(evt);
            }
        });

        passwordText.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        passwordText.setText("Password");

        SignUpBtn.setBackground(new java.awt.Color(51, 51, 255));
        SignUpBtn.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        SignUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        SignUpBtn.setText("SignUp");
        SignUpBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        showPasswordBox.setText("Show password");
        showPasswordBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SignUpFormLayout = new javax.swing.GroupLayout(SignUpForm);
        SignUpForm.setLayout(SignUpFormLayout);
        SignUpFormLayout.setHorizontalGroup(
            SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignUpFormLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SignUpText)
                .addGap(160, 160, 160))
            .addGroup(SignUpFormLayout.createSequentialGroup()
                .addGroup(SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SignUpFormLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameText)
                            .addComponent(emailText)
                            .addComponent(phoneText)
                            .addComponent(passwordText))
                        .addGap(18, 18, 18)
                        .addGroup(SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(phoneField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(emailField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
                            .addComponent(showPasswordBox)
                            .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SignUpFormLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(SignUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        SignUpFormLayout.setVerticalGroup(
            SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpFormLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(SignUpText, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneText)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailText)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordText)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(showPasswordBox)
                .addGap(38, 38, 38)
                .addComponent(SignUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.png"))); // NOI18N

        BackBtn.setBackground(new java.awt.Color(242, 242, 242));
        BackBtn.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.setBorder(null);
        BackBtn.setBorderPainted(false);
        BackBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackBtn.setFocusPainted(false);
        BackBtn.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(SignUpForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(SignUpForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void phoneFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneFieldFocusGained
        // TODO add your handling code here:
        if (phoneField.getText().equals(" Enter your phone number")){
            phoneField.setText("");
        }
    }//GEN-LAST:event_phoneFieldFocusGained

    private void phoneFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneFieldFocusLost
        // TODO add your handling code here:
        if (phoneField.getText().isEmpty()){
            phoneField.setText(" Enter your phone number");
        }
    }//GEN-LAST:event_phoneFieldFocusLost

    private void emailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusGained
        // TODO add your handling code here:
        if (emailField.getText().equals(" Enter your email")){
            emailField.setText("");
        }
    }//GEN-LAST:event_emailFieldFocusGained

    private void emailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusLost
        // TODO add your handling code here:
        if (emailField.getText().isEmpty()){
            emailField.setText(" Enter your email");
        }
    }//GEN-LAST:event_emailFieldFocusLost

    private void showPasswordBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordBoxActionPerformed
        // TODO add your handling code here:
        showPasswordBox.addActionListener(e -> {
            if (showPasswordBox.isSelected()){
                passwordField.setEchoChar((char) 0);
            }
            else {
                passwordField.setEchoChar('*');
            }
        });
    }//GEN-LAST:event_showPasswordBoxActionPerformed

    private void nameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusGained
        // TODO add your handling code here:
        if (nameField.getText().equals(" Enter your name")){
            nameField.setText("");
        }
    }//GEN-LAST:event_nameFieldFocusGained

    private void nameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusLost
        // TODO add your handling code here:
        if (nameField.getText().isEmpty()){
            nameField.setText(" Enter your name");
        }
    }//GEN-LAST:event_nameFieldFocusLost

    public JTextField getNameField() { return nameField; }
    public JTextField getEmailField() { return emailField; }
    public JTextField getPhoneField() { return phoneField; }
    public JPasswordField getPasswordField() { return passwordField; }
    public JButton getBackBtn() { return BackBtn; }
    
    public void addSubmitListener(ActionListener listener){
        SignUpBtn.addActionListener(listener);
    }
    
    public void addBackBtnListener(ActionListener listener){
        BackBtn.addActionListener(listener);
    }
    
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
            java.util.logging.Logger.getLogger(SignUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SignUpScreen().setVisible(true);
        });        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton SignUpBtn;
    private javax.swing.JPanel SignUpForm;
    private javax.swing.JLabel SignUpText;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameText;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordText;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel phoneText;
    private javax.swing.JCheckBox showPasswordBox;
    // End of variables declaration//GEN-END:variables
}
