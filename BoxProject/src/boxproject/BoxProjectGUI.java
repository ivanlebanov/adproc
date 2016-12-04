/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxproject;

import boxproject.base.CardBox;
import java.awt.List;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListModel;

public class BoxProjectGUI extends javax.swing.JFrame {

    protected ArrayList<CardBox> orderList = new ArrayList<CardBox>();
    protected DefaultListModel listModel = new DefaultListModel();
    /**
     * Creates new form BoxProjectGUI
     */
    public BoxProjectGUI() {
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

        jPanel1 = new javax.swing.JPanel();
        btnOrderAdd = new javax.swing.JButton();
        btnClearGrade = new javax.swing.JButton();
        ddGrade = new javax.swing.JComboBox();
        ddColour = new javax.swing.JComboBox<>();
        cmbReinforcedBottom = new javax.swing.JCheckBox();
        cmbReinforcedCorners = new javax.swing.JCheckBox();
        cbSealableTops = new javax.swing.JCheckBox();
        txtWidth = new javax.swing.JTextField();
        txtLength = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel2 = new javax.swing.JLabel();
        lblTableImage = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstOrder = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        lblTotalAmount = new javax.swing.JLabel();
        btnRemoveOrder = new javax.swing.JButton();
        btnClearOrder = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Choose Grade"));
        jPanel1.setOpaque(false);

        btnOrderAdd.setText("Add To Order");
        btnOrderAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderAddActionPerformed(evt);
            }
        });

        btnClearGrade.setText("Clear");
        btnClearGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearGradeActionPerformed(evt);
            }
        });

        ddGrade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        ddColour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "no colour", "1 colour", "2 colours" }));
        ddColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddColourActionPerformed(evt);
            }
        });

        cmbReinforcedBottom.setText("Reinforced Bottom");
        cmbReinforcedBottom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbReinforcedBottomActionPerformed(evt);
            }
        });

        cmbReinforcedCorners.setText("Reinforced Corners");
        cmbReinforcedCorners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbReinforcedCornersActionPerformed(evt);
            }
        });

        cbSealableTops.setText("Sealable Tops");

        txtQuantity.setText("1");

        jLabel3.setText("Grade of Card");

        jLabel4.setText("Card Colour");

        jLabel5.setText("Width");

        jLabel6.setText("Length");

        jLabel7.setText("Height");

        jLabel8.setText("Quantity");

        jLabel9.setText("- Enter order below");

        jLabel10.setText("Size (m)");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));

        lblTableImage.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTableImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boxproject/types.png"))); // NOI18N
        lblTableImage.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblTableImage.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/boxproject/typesDIS.png"))); // NOI18N
        lblTableImage.setEnabled(false);
        lblTableImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTableImage.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton1.setText("How orders are calculated");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("FlexBox price quoting sytem ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel10)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ddColour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ddGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addContainerGap(33, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbReinforcedBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbReinforcedCorners, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(cbSealableTops, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(lblTableImage))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnClearGrade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOrderAdd)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jButton1)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ddGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ddColour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addComponent(cmbReinforcedBottom)
                        .addGap(7, 7, 7)
                        .addComponent(cmbReinforcedCorners)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSealableTops)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOrderAdd)
                            .addComponent(btnClearGrade)))
                    .addComponent(lblTableImage))
                .addGap(249, 249, 249)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Order:"));

        lstOrder.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstOrder);

        jLabel1.setText("Total:  ");

        lblTotalAmount.setText("----");

        btnRemoveOrder.setText("Remove");
        btnRemoveOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOrderActionPerformed(evt);
            }
        });

        btnClearOrder.setText("Clear");
        btnClearOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTotalAmount))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnRemoveOrder)
                                .addGap(18, 18, 18)
                                .addComponent(btnClearOrder)))
                        .addGap(0, 73, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoveOrder)
                    .addComponent(btnClearOrder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTotalAmount))
                .addContainerGap())
        );

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderAddActionPerformed
        // TODO add your handling code here:
        double width,height, lenght;
        boolean sealable, reinforcedCorners, reinforcedBottom, validInput, error;
        int colorNumber,quantity;
        String colors, grade;
        String validation = "";
        sealable = reinforcedCorners = reinforcedBottom = error = false;
        width = height = lenght = 0.0;
        colorNumber = quantity = 0;
        validInput = true;
        colors = "";
        int gradeNumber = 0;
     
        try {
            quantity = Integer.parseInt(txtQuantity.getText());
            width = Double.parseDouble(txtWidth.getText());
            height = Double.parseDouble(txtHeight.getText());
            lenght = Double.parseDouble(txtLength.getText());
            sealable = cbSealableTops.isSelected();
            reinforcedCorners = cmbReinforcedCorners.isSelected();
            reinforcedBottom = cmbReinforcedBottom.isSelected();
            grade =  (String) ddGrade.getSelectedItem();
            gradeNumber = Integer.parseInt(grade);
            colors = (String) ddColour.getSelectedItem();
        } catch (NumberFormatException e) {
            jLabel2.setText("<html>Input only numbers <br>in the text fields.");
            validInput = false;
        }
        if(validInput){
            
            if ( (width < 0.2) || (width > 3) || (height < 0.2) || (height > 3) || (lenght < 0.2) || (lenght > 3) ){
                validation = "<html> Width, height and length should be <br> between 0.2 and 3 meters.";
            }
            if(quantity <= 0){
                validation += " Quantity should be at least 1.";
            }
            jLabel2.setText(validation);
            if( colors.equals("1 colour") ){
                colorNumber = 1;
            }else if(colors.equals("2 colours") ){
                colorNumber = 2;
            }
            if(validation.equals("")){
                for (int i = 0; i < quantity; i++) {
                    CardBox box = BoxFactory.getBox((float) width, (float) height, (float) lenght,sealable,colorNumber,reinforcedBottom,reinforcedCorners, gradeNumber);

                    if(box != null){
                      orderList.add(box);
                      listModel.addElement(box.getName());
                      lstOrder.setModel(listModel);

                    }else{
                       error = true; 
                    }    
                }
            }
            if(error){
                jLabel2.setText("<html>Sorry we do not have <br> the kind of box you want.");
            }else{
                if(validation.equals("")){
                    jLabel2.setText("");
                }
            } 
            calculateTotal();

        }
        
    }//GEN-LAST:event_btnOrderAddActionPerformed

    private void cmbReinforcedBottomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbReinforcedBottomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbReinforcedBottomActionPerformed

    private void cmbReinforcedCornersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbReinforcedCornersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbReinforcedCornersActionPerformed

    private void ddColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddColourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddColourActionPerformed

    private void btnClearGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearGradeActionPerformed
        // TODO add your handling code here:
        txtQuantity.setText("");
        txtWidth.setText("");
        txtHeight.setText("");
        txtLength.setText("");
        cmbReinforcedBottom.setSelected(false);
        cmbReinforcedCorners.setSelected(false);
        cbSealableTops.setSelected(false);
        ddGrade.setSelectedItem("1");
        ddColour.setSelectedItem("no colour");
    }//GEN-LAST:event_btnClearGradeActionPerformed

    private void btnRemoveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOrderActionPerformed
        // TODO add your handling code here:
         
        int selectedIndex = lstOrder.getSelectedIndex();
        if (selectedIndex != -1) {
            listModel.remove(selectedIndex);
            lstOrder.setModel(listModel);
            orderList.remove(selectedIndex);
        }else{
            jLabel2.setText("Please select box to remove.");
        }
        calculateTotal();
    }//GEN-LAST:event_btnRemoveOrderActionPerformed

    private void btnClearOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearOrderActionPerformed
        // TODO add your handling code here:

            listModel.removeAllElements();
            lstOrder.setModel(listModel);
            orderList.clear();
     
        calculateTotal();
    }//GEN-LAST:event_btnClearOrderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        Toggle lblTableImage
           if(lblTableImage.isEnabled() != true){
               lblTableImage.setEnabled(true);
           }else{
               lblTableImage.setEnabled(false);
           }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        exit
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed
    public void calculateTotal(){
        BigDecimal total = new BigDecimal(0);
            for(CardBox currentBox : orderList){
                total = total.add(currentBox.getPrice());
            }
            total = total.setScale(2, RoundingMode.CEILING);
            lblTotalAmount.setText(total.toString());
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
            java.util.logging.Logger.getLogger(BoxProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoxProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoxProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoxProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BoxProjectGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearGrade;
    private javax.swing.JButton btnClearOrder;
    private javax.swing.JButton btnOrderAdd;
    private javax.swing.JButton btnRemoveOrder;
    private javax.swing.JCheckBox cbSealableTops;
    private javax.swing.JCheckBox cmbReinforcedBottom;
    private javax.swing.JCheckBox cmbReinforcedCorners;
    private javax.swing.JComboBox<String> ddColour;
    private javax.swing.JComboBox ddGrade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblTableImage;
    private javax.swing.JLabel lblTotalAmount;
    private javax.swing.JList<String> lstOrder;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtLength;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtWidth;
    // End of variables declaration//GEN-END:variables
}
