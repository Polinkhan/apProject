/**
 * @author  - Abu Sayed Polin
 * @ID - CSE 069 08012
 * @Page - Product Page
 * @Date - 26/12/2022
 */
package inventorymanagementsystem;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class ViewProducts_Page extends javax.swing.JFrame {

    /**
     * Creates new form Products_Page
     */
    public ViewProducts_Page() {
        initComponents();
        updateComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        priceFrom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        priceTo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sortComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductView_table = new javax.swing.JTable();
        Checkout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        AddToCartBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        SelecetedProduct = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        QuatityBox = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        SelecetedProductPrice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search");
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 30));
        jLabel1.setRequestFocusEnabled(false);
        jLabel1.setVerifyInputWhenFocusTarget(false);

        input.setPreferredSize(new java.awt.Dimension(200, 30));
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputKeyReleased(evt);
            }
        });

        priceFrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        priceFrom.setPreferredSize(new java.awt.Dimension(60, 30));
        priceFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFromActionPerformed(evt);
            }
        });
        priceFrom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priceFromKeyReleased(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Price Range :");
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 30));
        jLabel4.setRequestFocusEnabled(false);
        jLabel4.setVerifyInputWhenFocusTarget(false);

        priceTo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        priceTo.setPreferredSize(new java.awt.Dimension(60, 30));
        priceTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceToActionPerformed(evt);
            }
        });
        priceTo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priceToKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        jLabel6.setText("Search Product");
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel8.setText("to");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sort By");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 30));
        jLabel5.setRequestFocusEnabled(false);
        jLabel5.setVerifyInputWhenFocusTarget(false);

        sortComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Price (Low to High)", "Price (High to Low)" }));
        sortComboBox.setPreferredSize(new java.awt.Dimension(72, 30));
        sortComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(priceFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        ProductView_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ProductView_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductView_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductView_table);

        Checkout.setText("Checkout Cart");
        Checkout.setPreferredSize(new java.awt.Dimension(150, 40));
        Checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckoutActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        AddToCartBtn.setText("Add to Cart");
        AddToCartBtn.setPreferredSize(new java.awt.Dimension(120, 40));
        AddToCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToCartBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Name :");
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 25));

        SelecetedProduct.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SelecetedProduct.setText("Select Product ...");
        SelecetedProduct.setPreferredSize(new java.awt.Dimension(200, 25));

        jLabel7.setText("Quantity :");

        QuatityBox.setPreferredSize(new java.awt.Dimension(50, 40));
        QuatityBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                QuatityBoxKeyReleased(evt);
            }
        });

        jLabel3.setText("Price :");
        jLabel3.setPreferredSize(new java.awt.Dimension(83, 25));

        SelecetedProductPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SelecetedProductPrice.setText("0");
        SelecetedProductPrice.setPreferredSize(new java.awt.Dimension(150, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SelecetedProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SelecetedProductPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QuatityBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(AddToCartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddToCartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(QuatityBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SelecetedProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SelecetedProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1224, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(264, 264, 264)
                        .addComponent(Checkout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Checkout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateTable() {
        String sort = sortComboBox.getSelectedItem().toString();
        String price_from = priceFrom.getText();
        String price_to = priceTo.getText();

        if (price_from.isBlank()) {
            price_from = "0";
        }
        if (price_to.isBlank()) {
            price_to = "99999999999999";
        }

        if ("Price (Low to High)".equals(sort)) {
            sort = "order by product_price asc";
        } else if ("Price (High to Low)".equals(sort)) {
            sort = "order by product_price desc";
        }
        String inp = input.getText();
        String sql = "select Product_ID,Product_Name,Product_Price,Product_Unit,Quantity,Supplier_name,Supplier_Address,Catagory_name from Products inner join Supplier on Products.supplier_id = Supplier.supplier_id inner join Catagory on Products.catagory_id = Catagory.catagory_id";
        String cond1 = "where ( Product_Name like '%" + inp + "%' OR Catagory_name like '%" + inp + "%' )";
        String cond2 = "and product_price between " + price_from + " and " + price_to;

        ResultSet q = DB.Query(sql + " " + cond1 + " " + cond2 + " " + sort);
        Helper.FillTable(ProductView_table, q);
    }

    private void updateComponents() {
//        ResultSet Catagory_Result = DB.Query("Select `Catagory_name` from Catagory");      
//        ResultSet Supplier_Result = DB.Query("Select `Supplier_name` from Supplier");
        ResultSet finalQuery = DB.Query("select Product_ID, Product_Name,Product_Price,Product_Unit,Quantity,Supplier_name,Supplier_Address,Catagory_name from Products inner join Supplier on Products.supplier_id = Supplier.supplier_id inner join Catagory on Products.catagory_id = Catagory.catagory_id");

        Helper.FillTable(ProductView_table, finalQuery);

//        try {
//            while (Catagory_Result.next()) {
//                String table = Catagory_Result.getString("Catagory_name");
//                CatagoryCombo_Box.addItem(table);
//                System.out.println(table);
//            }
//            while (Supplier_Result.next()) {
//                String table = Supplier_Result.getString("Supplier_name");
//                SupplierCombo_Box.addItem(table);
//                System.out.println(table);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        }
    }
    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed

    }//GEN-LAST:event_inputActionPerformed

    private void priceFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFromActionPerformed

    private void priceToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceToActionPerformed

    private void sortComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortComboBoxActionPerformed
        updateTable();
    }//GEN-LAST:event_sortComboBoxActionPerformed

    private void priceToKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceToKeyReleased
        updateTable();
    }//GEN-LAST:event_priceToKeyReleased

    private void inputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputKeyReleased
        updateTable();
    }//GEN-LAST:event_inputKeyReleased

    private void priceFromKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceFromKeyReleased
        updateTable();
    }//GEN-LAST:event_priceFromKeyReleased

    private void ProductView_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductView_tableMouseClicked
        QuatityBox.setValue(1);
        SelecetedProduct.setText(ProductView_table.getValueAt(ProductView_table.getSelectedRow(), 1).toString());
        SelecetedProductPrice.setText(ProductView_table.getValueAt(ProductView_table.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_ProductView_tableMouseClicked

    private void AddToCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartBtnActionPerformed

        String Product_id = ProductView_table.getValueAt(ProductView_table.getSelectedRow(), 0).toString();
        String Product_name = ProductView_table.getValueAt(ProductView_table.getSelectedRow(), 1).toString();
        String Quantity = QuatityBox.getValue().toString();
        String Product_Price = ProductView_table.getValueAt(ProductView_table.getSelectedRow(), 2).toString();
        int Price = Integer.parseInt(Product_Price);
        int qty = Integer.parseInt(Quantity);
        String Total_Price = String.valueOf(Price * qty);

        Map<Integer, String> cartData = new HashMap<>();

        try {
            
            String cartSql = "insert into cart (Username, Product_id, Quantity, Rate, Total_Price) values (?,?,?,?,?)";
            cartData.put(1, CurrentUser.name);
            cartData.put(2, Product_id);
            cartData.put(3, Quantity);
            cartData.put(4, Product_Price);
            cartData.put(5, Total_Price);
            
            String result = DB.nonReturnAbleQuery(cartSql, cartData);
            if ("1".equals(result)) {
                 JOptionPane.showMessageDialog(this, "Added to Cart\nProduct Name : " + Product_name + "\nProduct Price : "+Product_Price+" x "+Quantity+" = "+Total_Price);
            } else {
                JOptionPane.showMessageDialog(this, result);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please Select a row to add product in your cart");
        }
    }//GEN-LAST:event_AddToCartBtnActionPerformed

    private void QuatityBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuatityBoxKeyReleased
        int Quantity = Integer.parseInt(QuatityBox.getValue().toString());
        int value = Integer.parseInt(ProductView_table.getValueAt(ProductView_table.getSelectedRow(), 2).toString());
        SelecetedProductPrice.setText(String.valueOf(Quantity * value));
    }//GEN-LAST:event_QuatityBoxKeyReleased

    private void CheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckoutActionPerformed
        new MyCart().setVisible(true);
    }//GEN-LAST:event_CheckoutActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProducts_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProducts_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProducts_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProducts_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProducts_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToCartBtn;
    private javax.swing.JButton Checkout;
    private javax.swing.JTable ProductView_table;
    private javax.swing.JSpinner QuatityBox;
    private javax.swing.JLabel SelecetedProduct;
    private javax.swing.JLabel SelecetedProductPrice;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField priceFrom;
    private javax.swing.JTextField priceTo;
    private javax.swing.JComboBox<String> sortComboBox;
    // End of variables declaration//GEN-END:variables
}
