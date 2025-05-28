
package view;

/**
 *
 * @author sanji
 */
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form UserDashboard
     */
    public AdminDashboard() {
        initComponents();
    }
    // </editor-fold>
       

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        greetings = new javax.swing.JLabel();
        booking = new javax.swing.JButton();
        tournaments = new javax.swing.JButton();
        userprofile = new javax.swing.JButton();
        Search1 = new javax.swing.JTextField();
        search2 = new javax.swing.JButton();
        Futsal1 = new javax.swing.JPanel();
        FutsalName1 = new javax.swing.JLabel();
        Location1 = new javax.swing.JLabel();
        Type1 = new javax.swing.JLabel();
        Price1 = new javax.swing.JLabel();
        Time1 = new javax.swing.JLabel();
        Edit1 = new javax.swing.JButton();
        Delete1 = new javax.swing.JButton();
        Futsal2 = new javax.swing.JPanel();
        FutsalName2 = new javax.swing.JLabel();
        Location2 = new javax.swing.JLabel();
        Type2 = new javax.swing.JLabel();
        Price2 = new javax.swing.JLabel();
        Time2 = new javax.swing.JLabel();
        Edit2 = new javax.swing.JButton();
        Delete2 = new javax.swing.JButton();
        Futsal3 = new javax.swing.JPanel();
        FutsalName3 = new javax.swing.JLabel();
        Location3 = new javax.swing.JLabel();
        Type3 = new javax.swing.JLabel();
        Price3 = new javax.swing.JLabel();
        Time3 = new javax.swing.JLabel();
        Edit3 = new javax.swing.JButton();
        Delete3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(390, 213));

        jLabel24.setText("Futsal Name :");

        jLabel26.setText("Location :");

        jLabel27.setText("Type :");

        jLabel28.setText("Prize : ");

        jLabel29.setText("Opening Time :");

        jButton9.setBackground(new java.awt.Color(0, 0, 255));
        jButton9.setText("Book Now!");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 102, 204));
        jButton10.setText("Book Now!");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField20, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField19, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField18, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField17, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField21, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.control);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        greetings.setBackground(new java.awt.Color(255, 255, 255));
        greetings.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        greetings.setText("Welcome, ");
        greetings.setPreferredSize(new java.awt.Dimension(131, 32));

        booking.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        booking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4115237_add_plus_icon.png"))); // NOI18N
        booking.setText("Add Futsal");
        booking.setPreferredSize(new java.awt.Dimension(135, 40));

        tournaments.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        tournaments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trophy-solid.png"))); // NOI18N
        tournaments.setText("Add Tournaments");
        tournaments.setPreferredSize(new java.awt.Dimension(131, 36));

        userprofile.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        userprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user-solid.png"))); // NOI18N
        userprofile.setText("User Profile");
        userprofile.setPreferredSize(new java.awt.Dimension(131, 36));

        Search1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        Search1.setPreferredSize(new java.awt.Dimension(131, 32));
        Search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search1ActionPerformed(evt);
            }
        });

        search2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/magnifying-glass-solid.png"))); // NOI18N
        search2.setPreferredSize(new java.awt.Dimension(131, 32));

        Futsal1.setBackground(new java.awt.Color(255, 255, 255));

        FutsalName1.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        FutsalName1.setText("Fustal Name : ");

        Location1.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        Location1.setText("Location :");

        Type1.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        Type1.setText("Type :");

        Price1.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        Price1.setText("Price :");

        Time1.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        Time1.setText("Opening time :");

        Edit1.setBackground(new java.awt.Color(51, 255, 0));
        Edit1.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        Edit1.setForeground(new java.awt.Color(255, 255, 255));
        Edit1.setText("Edit");

        Delete1.setBackground(new java.awt.Color(255, 0, 51));
        Delete1.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        Delete1.setForeground(new java.awt.Color(255, 255, 255));
        Delete1.setText("Delete");

        javax.swing.GroupLayout Futsal1Layout = new javax.swing.GroupLayout(Futsal1);
        Futsal1.setLayout(Futsal1Layout);
        Futsal1Layout.setHorizontalGroup(
            Futsal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Futsal1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(Futsal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Time1)
                    .addComponent(Price1)
                    .addComponent(Type1)
                    .addComponent(Location1)
                    .addComponent(FutsalName1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Futsal1Layout.createSequentialGroup()
                .addComponent(Edit1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Futsal1Layout.setVerticalGroup(
            Futsal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Futsal1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(FutsalName1)
                .addGap(18, 18, 18)
                .addComponent(Location1)
                .addGap(18, 18, 18)
                .addComponent(Type1)
                .addGap(18, 18, 18)
                .addComponent(Price1)
                .addGap(18, 18, 18)
                .addComponent(Time1)
                .addGap(18, 18, 18)
                .addGroup(Futsal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Futsal2.setBackground(new java.awt.Color(255, 255, 255));

        FutsalName2.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        FutsalName2.setText("Fustal Name : ");

        Location2.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        Location2.setText("Type :");

        Type2.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        Type2.setText("Location :");

        Price2.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        Price2.setText("Price :");

        Time2.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        Time2.setText("Opening time :");

        Edit2.setBackground(new java.awt.Color(51, 255, 0));
        Edit2.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        Edit2.setForeground(new java.awt.Color(255, 255, 255));
        Edit2.setText("Edit");

        Delete2.setBackground(new java.awt.Color(255, 51, 0));
        Delete2.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        Delete2.setForeground(new java.awt.Color(255, 255, 255));
        Delete2.setText("Delete");

        javax.swing.GroupLayout Futsal2Layout = new javax.swing.GroupLayout(Futsal2);
        Futsal2.setLayout(Futsal2Layout);
        Futsal2Layout.setHorizontalGroup(
            Futsal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Futsal2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(Futsal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Time2)
                    .addComponent(Price2)
                    .addComponent(Location2)
                    .addComponent(Type2)
                    .addComponent(FutsalName2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Futsal2Layout.createSequentialGroup()
                .addComponent(Edit2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Delete2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Futsal2Layout.setVerticalGroup(
            Futsal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Futsal2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(FutsalName2)
                .addGap(18, 18, 18)
                .addComponent(Type2)
                .addGap(18, 18, 18)
                .addComponent(Location2)
                .addGap(18, 18, 18)
                .addComponent(Price2)
                .addGap(18, 18, 18)
                .addComponent(Time2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Futsal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Futsal3.setBackground(new java.awt.Color(255, 255, 255));

        FutsalName3.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        FutsalName3.setText("Location :");

        Location3.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        Location3.setText("Fustal Name : ");

        Type3.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        Type3.setText("Type :");

        Price3.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        Price3.setText("Opening time :");

        Time3.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        Time3.setText("Price :");

        Edit3.setBackground(new java.awt.Color(51, 255, 0));
        Edit3.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        Edit3.setForeground(new java.awt.Color(255, 255, 255));
        Edit3.setText("Edit");

        Delete3.setBackground(new java.awt.Color(255, 51, 0));
        Delete3.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        Delete3.setForeground(new java.awt.Color(255, 255, 255));
        Delete3.setText("Delete");

        javax.swing.GroupLayout Futsal3Layout = new javax.swing.GroupLayout(Futsal3);
        Futsal3.setLayout(Futsal3Layout);
        Futsal3Layout.setHorizontalGroup(
            Futsal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Futsal3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(Futsal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Price3)
                    .addComponent(Time3)
                    .addComponent(Type3)
                    .addComponent(FutsalName3)
                    .addComponent(Location3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Futsal3Layout.createSequentialGroup()
                .addComponent(Edit3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Delete3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Futsal3Layout.setVerticalGroup(
            Futsal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Futsal3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Location3)
                .addGap(18, 18, 18)
                .addComponent(FutsalName3)
                .addGap(18, 18, 18)
                .addComponent(Type3)
                .addGap(18, 18, 18)
                .addComponent(Time3)
                .addGap(18, 18, 18)
                .addComponent(Price3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Futsal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel1.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        jLabel1.setText("Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(greetings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(56, 56, 56)
                        .addComponent(Search1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(booking, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tournaments, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(userprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Futsal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(Futsal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(Futsal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Search1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(search2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tournaments, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(booking, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(greetings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Futsal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Futsal3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Futsal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 365, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void Search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search1ActionPerformed

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
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete1;
    private javax.swing.JButton Delete2;
    private javax.swing.JButton Delete3;
    private javax.swing.JButton Edit1;
    private javax.swing.JButton Edit2;
    private javax.swing.JButton Edit3;
    private javax.swing.JPanel Futsal1;
    private javax.swing.JPanel Futsal2;
    private javax.swing.JPanel Futsal3;
    private javax.swing.JLabel FutsalName1;
    private javax.swing.JLabel FutsalName2;
    private javax.swing.JLabel FutsalName3;
    private javax.swing.JLabel Location1;
    private javax.swing.JLabel Location2;
    private javax.swing.JLabel Location3;
    private javax.swing.JLabel Price1;
    private javax.swing.JLabel Price2;
    private javax.swing.JLabel Price3;
    private javax.swing.JTextField Search1;
    private javax.swing.JLabel Time1;
    private javax.swing.JLabel Time2;
    private javax.swing.JLabel Time3;
    private javax.swing.JLabel Type1;
    private javax.swing.JLabel Type2;
    private javax.swing.JLabel Type3;
    private javax.swing.JButton booking;
    private javax.swing.JLabel greetings;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JButton search2;
    private javax.swing.JButton tournaments;
    private javax.swing.JButton userprofile;
    // End of variables declaration//GEN-END:variables

    
}
