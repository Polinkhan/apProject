/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventorymanagementsystem;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author polin
 */
public class ManageProduct_Page extends javax.swing.JFrame {

    /**
     * Creates new form ManageProduct_Page
     */
    public ManageProduct_Page() {
        initComponents();
        updateComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ProductIdTextField = new javax.swing.JTextField();
        ProductNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ProductPriceTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ProductUnitTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DeleteRowBtn = new javax.swing.JButton();
        AddProductBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        SupplierNameComboBox = new javax.swing.JComboBox<>();
        CatagoryNameComboBox = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        QuantityTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(374, 708));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Product_id :");
        jLabel1.setPreferredSize(new java.awt.Dimension(120, 30));

        ProductIdTextField.setPreferredSize(new java.awt.Dimension(150, 30));

        ProductNameTextField.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Product_Name :");
        jLabel2.setPreferredSize(new java.awt.Dimension(120, 30));

        ProductPriceTextField.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Product_Price :");
        jLabel3.setPreferredSize(new java.awt.Dimension(120, 30));

        ProductUnitTextField.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Product_Unit :");
        jLabel4.setPreferredSize(new java.awt.Dimension(120, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Supplier_Name :");
        jLabel5.setPreferredSize(new java.awt.Dimension(120, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Catagory_Name :");
        jLabel6.setPreferredSize(new java.awt.Dimension(120, 30));

        jLabel7.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Modify Product Table");
        jLabel7.setPreferredSize(new java.awt.Dimension(37, 40));
        jLabel7.setRequestFocusEnabled(false);

        DeleteRowBtn.setText("Delete Product");
        DeleteRowBtn.setMargin(new java.awt.Insets(4, 14, 3, 14));
        DeleteRowBtn.setPreferredSize(new java.awt.Dimension(150, 30));
        DeleteRowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteRowBtnActionPerformed(evt);
            }
        });

        AddProductBtn.setText("Add Product");
        AddProductBtn.setMargin(new java.awt.Insets(4, 14, 3, 14));
        AddProductBtn.setPreferredSize(new java.awt.Dimension(150, 30));
        AddProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductBtnActionPerformed(evt);
            }
        });

        jButton3.setText("Update Product");
        jButton3.setMargin(new java.awt.Insets(4, 14, 3, 14));
        jButton3.setPreferredSize(new java.awt.Dimension(150, 30));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        SupplierNameComboBox.setPreferredSize(new java.awt.Dimension(72, 30));

        CatagoryNameComboBox.setPreferredSize(new java.awt.Dimension(72, 30));

        jButton4.setText("Unselecet Row");
        jButton4.setMargin(new java.awt.Insets(4, 14, 3, 14));
        jButton4.setPreferredSize(new java.awt.Dimension(150, 30));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        QuantityTextField.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Quantity :");
        jLabel8.setPreferredSize(new java.awt.Dimension(120, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteRowBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(QuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(SupplierNameComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(ProductUnitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(ProductPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(ProductNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(ProductIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(CatagoryNameComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductUnitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SupplierNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CatagoryNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteRowBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        JTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void AddProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductBtnActionPerformed
        String Product_id = ProductIdTextField.getText();
        String Product_name = ProductNameTextField.getText();
        String Product_price = ProductPriceTextField.getText();
        String Product_unit = ProductUnitTextField.getText();
        String Quantity = QuantityTextField.getText();
        String Supplier_id = Helper.shortQuery("Supplier_id", "Supplier_name", "Supplier", SupplierNameComboBox.getSelectedItem().toString());
        String Catagory_id = Helper.shortQuery("Catagory_id", "Catagory_name", "Catagory", CatagoryNameComboBox.getSelectedItem().toString());

        Map<Integer, String> productData = new HashMap<>();

        productData.put(1, Product_id);
        productData.put(2, Product_name);
        productData.put(3, Product_price);
        productData.put(4, Product_unit);
        productData.put(5, Supplier_id);
        productData.put(6, Catagory_id);
        productData.put(7, Quantity);

        String query = "INSERT INTO Products (Product_id,Product_name,Product_price,Product_unit,Supplier_id,Catagory_id,Quantity) values (?,?,?,?,?,?,?)";
        String result = DB.nonReturnAbleQuery(query, productData);
        if ("1".equals(result)) {
            JOptionPane.showMessageDialog(this, "Successfully Added a Product");
            updateTable();
        } else {
            JOptionPane.showMessageDialog(this, result);
        }
    }//GEN-LAST:event_AddProductBtnActionPerformed

    private void DeleteRowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteRowBtnActionPerformed
        try {
            String SelectedId = JTable.getValueAt(JTable.getSelectedRow(), 0).toString();
            String SelectedName = JTable.getValueAt(JTable.getSelectedRow(), 1).toString();
            int input = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete Product for " + SelectedName, "Confirm Delete " + SelectedName, JOptionPane.YES_NO_CANCEL_OPTION);
            if (input == 0) {
                String result = DB.nonReturnAbleQuery("Delete From Products Where Product_id = '" + SelectedId + "'");
                System.out.println("Delete = " + result);
                if ("1".equals(result)) {
                    JOptionPane.showMessageDialog(this, "Successfully Deleted " + SelectedName);
                    updateTable();
                    cleanUp();
                } else {
                    JOptionPane.showMessageDialog(this, result);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please Select a row from Table to apply DELETE operation");
        }
    }//GEN-LAST:event_DeleteRowBtnActionPerformed

    private void JTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableMouseClicked
        ProductIdTextField.setText(JTable.getValueAt(JTable.getSelectedRow(), 0).toString());
        ProductNameTextField.setText(JTable.getValueAt(JTable.getSelectedRow(), 1).toString());
        ProductPriceTextField.setText(JTable.getValueAt(JTable.getSelectedRow(), 2).toString());
        ProductUnitTextField.setText(JTable.getValueAt(JTable.getSelectedRow(), 3).toString());
        QuantityTextField.setText(JTable.getValueAt(JTable.getSelectedRow(), 6).toString());
        
        String SupplierName = Helper.shortQuery("Supplier_name","Supplier_id" , "Supplier", JTable.getValueAt(JTable.getSelectedRow(), 4).toString());
        String CatagoryName = Helper.shortQuery("Catagory_name","Catagory_id" , "Catagory", JTable.getValueAt(JTable.getSelectedRow(), 5).toString());
        SupplierNameComboBox.setSelectedItem(SupplierName);
        CatagoryNameComboBox.setSelectedItem(CatagoryName);
        
        ProductIdTextField.disable();
    }//GEN-LAST:event_JTableMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cleanUp();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String Product_id = ProductIdTextField.getText();
        String Product_name = ProductNameTextField.getText();
        String Product_price = ProductPriceTextField.getText();
        String Product_unit = ProductUnitTextField.getText();
        String Quantity = QuantityTextField.getText();
        String Supplier_id = Helper.shortQuery("Supplier_id", "Supplier_name", "Supplier", SupplierNameComboBox.getSelectedItem().toString());
        String Catagory_id = Helper.shortQuery("Catagory_id", "Catagory_name", "Catagory", CatagoryNameComboBox.getSelectedItem().toString());

        Map<Integer, String> productData = new HashMap<>();

        productData.put(1, Product_name);
        productData.put(2, Product_price);
        productData.put(3, Product_unit);
        productData.put(4, Supplier_id);
        productData.put(5, Catagory_id);
        productData.put(6, Quantity);
        productData.put(7, Product_id);
        
        String query = "UPDATE Products SET Product_name = ?, Product_price = ?, Product_unit = ?, Supplier_id = ?, Catagory_id = ?, Quantity = ? WHERE Product_id = ?";
        String result = DB.nonReturnAbleQuery(query, productData);
        if ("1".equals(result)) {
            JOptionPane.showMessageDialog(this, "Successfully Updated a Product");
            updateTable();
            cleanUp();
        } else {
            JOptionPane.showMessageDialog(this, result);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void updateTable() {
        ResultSet first_Table = DB.Query("SELECT * FROM Products");
        Helper.FillTable(JTable, first_Table);
    }

    private void updateComponents() {

        ResultSet Catagory_Result = DB.Query("Select `Catagory_Name` from Catagory");
        ResultSet Supplier_Result = DB.Query("Select `Supplier_Name` from Supplier");
        updateTable();

        try {
            while (Catagory_Result.next()) {
                String table = Catagory_Result.getString("Catagory_Name");
                CatagoryNameComboBox.addItem(table);
                System.out.println(table);
            }
            while (Supplier_Result.next()) {
                String table = Supplier_Result.getString("Supplier_Name");
                SupplierNameComboBox.addItem(table);
                System.out.println(table);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    private void cleanUp(){
        JTable.getSelectionModel().clearSelection();
        ProductIdTextField.setText("");
        ProductNameTextField.setText("");
        ProductPriceTextField.setText("");
        ProductUnitTextField.setText("");
        QuantityTextField.setText("");
        SupplierNameComboBox.setSelectedIndex(0);
        CatagoryNameComboBox.setSelectedIndex(0);
        ProductIdTextField.enable();
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
            java.util.logging.Logger.getLogger(ManageProduct_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageProduct_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageProduct_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageProduct_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ManageProduct_Page().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProductBtn;
    private javax.swing.JComboBox<String> CatagoryNameComboBox;
    private javax.swing.JButton DeleteRowBtn;
    private javax.swing.JTable JTable;
    private javax.swing.JTextField ProductIdTextField;
    private javax.swing.JTextField ProductNameTextField;
    private javax.swing.JTextField ProductPriceTextField;
    private javax.swing.JTextField ProductUnitTextField;
    private javax.swing.JTextField QuantityTextField;
    private javax.swing.JComboBox<String> SupplierNameComboBox;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}