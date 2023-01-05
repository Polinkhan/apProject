/**
 * @author  - Abu Sayed Polin
 * @ID - CSE 069 08012
 * @Page - Login Page
 * @Date - 26/12/2022
 */
package inventorymanagementsystem;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Login_Page extends javax.swing.JFrame {

    public Login_Page() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginBannerImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginUserIdInput = new javax.swing.JTextField();
        loginPasswordInput = new javax.swing.JTextField();
        loginSubmitBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        setAutoRequestFocus(false);
        setFont(new java.awt.Font("Unispace", 0, 10)); // NOI18N
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        loginBannerImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBannerImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/loginBanner.png"))); // NOI18N
        loginBannerImage.setPreferredSize(new java.awt.Dimension(500, 180));

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("User ID :");

        jLabel2.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Password :");

        loginUserIdInput.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        loginUserIdInput.setPreferredSize(new java.awt.Dimension(200, 30));
        loginUserIdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUserIdInputActionPerformed(evt);
            }
        });

        loginPasswordInput.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        loginPasswordInput.setPreferredSize(new java.awt.Dimension(200, 30));
        loginPasswordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPasswordInputActionPerformed(evt);
            }
        });

        loginSubmitBtn.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        loginSubmitBtn.setText("Submit");
        loginSubmitBtn.setPreferredSize(new java.awt.Dimension(150, 40));
        loginSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginSubmitBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Don't have a account ?");

        jButton1.setText("Register Now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addComponent(loginBannerImage, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
                .addContainerGap(184, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginUserIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(loginSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(loginBannerImage, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(loginUserIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(loginPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(loginSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addGap(41, 41, 41))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void loginSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginSubmitBtnActionPerformed
        String userid = loginUserIdInput.getText();
        String pass = loginPasswordInput.getText();

        Map<Integer, String> authData = new HashMap<>();

        if (userid.isBlank() || pass.isBlank()) {
            JOptionPane.showMessageDialog(this, "User id or Password should not Empty!");
        } else {
            String loginSql = "select * from auth where userid = ? and password = ?";
            authData.put(1, userid);
            authData.put(2, pass);
            try {
                    ResultSet result = DB.Query(loginSql, authData);
                if (result.next()) {
                    CurrentUser.name = userid;
                    new Home_Page().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Username or Password incorrect!!");
                }       
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }

        }
    }//GEN-LAST:event_loginSubmitBtnActionPerformed

    private void loginUserIdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUserIdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUserIdInputActionPerformed

    private void loginPasswordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPasswordInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginPasswordInputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Register_Page().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login_Page().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel loginBannerImage;
    private javax.swing.JTextField loginPasswordInput;
    private javax.swing.JButton loginSubmitBtn;
    private javax.swing.JTextField loginUserIdInput;
    // End of variables declaration//GEN-END:variables
}
