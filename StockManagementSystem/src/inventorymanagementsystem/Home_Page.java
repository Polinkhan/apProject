/**
 * @author  - Abu Sayed Polin
 * @ID - CSE 069 08012
 * @Page - Home Page
 * @Date - 26/12/2022
 */
package inventorymanagementsystem;

import java.awt.Frame;

public class Home_Page extends javax.swing.JFrame {

    public Home_Page() {
        initComponents();
        updateComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ManageItems_Btn = new javax.swing.JButton();
        ViewProduct_Btn = new javax.swing.JButton();
        LogOut_Btn = new javax.swing.JButton();
        Sell_Btn = new javax.swing.JButton();
        Manage_DB = new javax.swing.JButton();
        Order_Btn1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        welcomeTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Page");
        setBackground(new java.awt.Color(96, 125, 139));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inventory Management System");

        ManageItems_Btn.setBackground(new java.awt.Color(96, 125, 139));
        ManageItems_Btn.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        ManageItems_Btn.setForeground(new java.awt.Color(255, 255, 255));
        ManageItems_Btn.setText("Manage Products");
        ManageItems_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageItems_Btn.setMargin(new java.awt.Insets(5, 14, 5, 14));
        ManageItems_Btn.setPreferredSize(new java.awt.Dimension(180, 60));
        ManageItems_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageItems_BtnActionPerformed(evt);
            }
        });

        ViewProduct_Btn.setBackground(new java.awt.Color(96, 125, 139));
        ViewProduct_Btn.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        ViewProduct_Btn.setForeground(new java.awt.Color(255, 255, 255));
        ViewProduct_Btn.setText("View Products");
        ViewProduct_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewProduct_Btn.setMargin(new java.awt.Insets(5, 14, 5, 14));
        ViewProduct_Btn.setPreferredSize(new java.awt.Dimension(180, 60));
        ViewProduct_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewProduct_BtnActionPerformed(evt);
            }
        });

        LogOut_Btn.setBackground(new java.awt.Color(96, 125, 139));
        LogOut_Btn.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        LogOut_Btn.setForeground(new java.awt.Color(255, 255, 255));
        LogOut_Btn.setText("Log Out");
        LogOut_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogOut_Btn.setMargin(new java.awt.Insets(5, 14, 5, 14));
        LogOut_Btn.setPreferredSize(new java.awt.Dimension(180, 60));
        LogOut_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOut_BtnActionPerformed(evt);
            }
        });

        Sell_Btn.setBackground(new java.awt.Color(96, 125, 139));
        Sell_Btn.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        Sell_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Sell_Btn.setText("My Cart");
        Sell_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sell_Btn.setMargin(new java.awt.Insets(5, 14, 5, 14));
        Sell_Btn.setPreferredSize(new java.awt.Dimension(180, 60));
        Sell_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sell_BtnActionPerformed(evt);
            }
        });

        Manage_DB.setBackground(new java.awt.Color(96, 125, 139));
        Manage_DB.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        Manage_DB.setForeground(new java.awt.Color(255, 255, 255));
        Manage_DB.setText("Manage DB");
        Manage_DB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Manage_DB.setMargin(new java.awt.Insets(5, 14, 5, 14));
        Manage_DB.setPreferredSize(new java.awt.Dimension(150, 60));
        Manage_DB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Manage_DBActionPerformed(evt);
            }
        });

        Order_Btn1.setBackground(new java.awt.Color(96, 125, 139));
        Order_Btn1.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        Order_Btn1.setForeground(new java.awt.Color(255, 255, 255));
        Order_Btn1.setText("Update Profile");
        Order_Btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Order_Btn1.setMargin(new java.awt.Insets(5, 14, 5, 14));
        Order_Btn1.setPreferredSize(new java.awt.Dimension(150, 60));
        Order_Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Order_Btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Manage_DB, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(Order_Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Sell_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(LogOut_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(ViewProduct_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(60, 60, 60)
                            .addComponent(ManageItems_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewProduct_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageItems_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Manage_DB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Order_Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sell_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogOut_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        welcomeTxt.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        welcomeTxt.setText("Welcome :");
        welcomeTxt.setPreferredSize(new java.awt.Dimension(200, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ViewProduct_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewProduct_BtnActionPerformed
        new ViewProducts_Page().setVisible(true);
    }//GEN-LAST:event_ViewProduct_BtnActionPerformed

    private void Order_Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Order_Btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Order_Btn1ActionPerformed

    private void Manage_DBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Manage_DBActionPerformed
        new DBManage_Page().setVisible(true);
    }//GEN-LAST:event_Manage_DBActionPerformed

    private void ManageItems_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageItems_BtnActionPerformed
        new ManageProduct_Page().setVisible(true);
    }//GEN-LAST:event_ManageItems_BtnActionPerformed

    private void Sell_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sell_BtnActionPerformed
        new MyCart().setVisible(true);
    }//GEN-LAST:event_Sell_BtnActionPerformed

    private void LogOut_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOut_BtnActionPerformed
        Frame[] frames = Frame.getFrames();
        for (Frame f : frames) {
            f.dispose();
        }
        new Login_Page().setVisible(true);
    }//GEN-LAST:event_LogOut_BtnActionPerformed

    private void updateComponents() {
        welcomeTxt.setText("Welcome : " + CurrentUser.name);
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
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOut_Btn;
    private javax.swing.JButton ManageItems_Btn;
    private javax.swing.JButton Manage_DB;
    private javax.swing.JButton Order_Btn1;
    private javax.swing.JButton Sell_Btn;
    private javax.swing.JButton ViewProduct_Btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel welcomeTxt;
    // End of variables declaration//GEN-END:variables
}
