package view;

import java.awt.event.ActionListener;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author sanji
 */
public class LoginScreen extends javax.swing.JFrame {

    public LoginScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignUpForm = new javax.swing.JPanel();
        SignUpText = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        emailText = new javax.swing.JLabel();
        passwordText = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        LoginBtn = new javax.swing.JButton();
        showPasswordBox = new javax.swing.JCheckBox();
        forgotPasswordBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SignUpText.setFont(new java.awt.Font("Leelawadee", 0, 72)); // NOI18N
        SignUpText.setText("Login");

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

        emailText.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        emailText.setText("Email :");

        passwordText.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        passwordText.setText("Password");

        LoginBtn.setBackground(new java.awt.Color(51, 51, 255));
        LoginBtn.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn.setText("Login");

        showPasswordBox.setText("Show password");
        showPasswordBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordBoxActionPerformed(evt);
            }
        });

        forgotPasswordBtn.setBackground(new java.awt.Color(204, 204, 204));
        forgotPasswordBtn.setFont(new java.awt.Font("Leelawadee", 0, 16)); // NOI18N
        forgotPasswordBtn.setText("Forgot password?");
        forgotPasswordBtn.setBorder(null);
        forgotPasswordBtn.setBorderPainted(false);

        javax.swing.GroupLayout SignUpFormLayout = new javax.swing.GroupLayout(SignUpForm);
        SignUpForm.setLayout(SignUpFormLayout);
        SignUpFormLayout.setHorizontalGroup(
            SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpFormLayout.createSequentialGroup()
                .addGroup(SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SignUpFormLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(SignUpText))
                    .addGroup(SignUpFormLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(showPasswordBox)
                            .addGroup(SignUpFormLayout.createSequentialGroup()
                                .addGroup(SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailText)
                                    .addComponent(passwordText))
                                .addGap(41, 41, 41)
                                .addGroup(SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(LoginBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                                    .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING))))))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignUpFormLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(forgotPasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
        SignUpFormLayout.setVerticalGroup(
            SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpFormLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(SignUpText, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailText)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(SignUpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordText)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showPasswordBox)
                .addGap(48, 48, 48)
                .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(forgotPasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login page1.png"))); // NOI18N

        BackBtn.setBackground(new java.awt.Color(204, 204, 204));
        BackBtn.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.setBorder(null);
        BackBtn.setBorderPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(SignUpForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SignUpForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    public JTextField getEmailField() { return emailField; }
    public JPasswordField getPasswordField() { return passwordField; }
    
    public void addLoginBtnListener(ActionListener listener){
        LoginBtn.addActionListener(listener);
    }
    
    public void addBackBtnListener(ActionListener listener){
        BackBtn.addActionListener(listener);
    }
    
    public void addForgotPasswordBtnListener (ActionListener listener){
        forgotPasswordBtn.addActionListener(listener);
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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true); 
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPanel SignUpForm;
    private javax.swing.JLabel SignUpText;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailText;
    private javax.swing.JButton forgotPasswordBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordText;
    private javax.swing.JCheckBox showPasswordBox;
    // End of variables declaration//GEN-END:variables

}
