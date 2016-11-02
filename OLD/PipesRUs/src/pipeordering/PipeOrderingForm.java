/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipeordering;

/**
 *
 * @author 744401
 */

/**CHANGELOG / TODO
 * 
 * _________TODO__________________
 * NEED TO ADD QUANTITY OPTION - JOSH - 29/10/15  
 * 
 * 
 * 
 * ________CHANGED________________
 *   Changed order output box to non focusable - Josh - 29/10/15
 *
 * 
 * 
 **/

import java.awt.List;
import java.util.ArrayList;
public class PipeOrderingForm extends javax.swing.JFrame {
    double total=0;
    ArrayList<CustomerOrder> orderList = new ArrayList();   //Array List for quick order summary
    
    /**
     * Creates new form PipeOrderingForm
     */
    public PipeOrderingForm() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        welcomeTxtLabel = new javax.swing.JLabel();
        reqLengthLabel = new javax.swing.JLabel();
        pipeLengthInput = new javax.swing.JTextField();
        outerMeasurementLabel = new javax.swing.JLabel();
        outerDiameterInput = new javax.swing.JTextField();
        outerDiameterSelect = new javax.swing.JRadioButton();
        radiusSelect = new javax.swing.JRadioButton();
        coloursLabel = new javax.swing.JLabel();
        numOfColours = new javax.swing.JComboBox();
        insulationLabel = new javax.swing.JLabel();
        insulationYes = new javax.swing.JRadioButton();
        insulationNo = new javax.swing.JRadioButton();
        chemicalResLabel = new javax.swing.JLabel();
        chemicalResYes = new javax.swing.JRadioButton();
        chemicalResNo = new javax.swing.JRadioButton();
        plasticGradeLabel = new javax.swing.JLabel();
        plasticGrade = new javax.swing.JComboBox();
        submitOrder = new javax.swing.JButton();
        clearOrder = new javax.swing.JButton();
        exitOrder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        quantityLabel = new javax.swing.JLabel();
        pipeQuantityInput = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        orderStatusLabel = new javax.swing.JLabel();
        validOrderTxtBox = new javax.swing.JTextField();
        currentOrderLabel = new javax.swing.JLabel();
        totalCostLabel = new javax.swing.JLabel();
        totalCostTxtBox = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        currentOrderList = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        arrayListOutput = new javax.swing.JTextArea();
        listPipeButtons = new javax.swing.JButton();
        errorsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        errorOutputBox = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Order Specification", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        welcomeTxtLabel.setText("PipesR'us Oderding System - Please enter your requied specification below. ");

        reqLengthLabel.setText("Required Length (m): ");

        outerMeasurementLabel.setText("Outer Measurement (inches):");

        outerDiameterInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outerDiameterInputActionPerformed(evt);
            }
        });

        buttonGroup1.add(outerDiameterSelect);
        outerDiameterSelect.setText("Outer Diameter");

        buttonGroup1.add(radiusSelect);
        radiusSelect.setText("Radius");
        radiusSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiusSelectActionPerformed(evt);
            }
        });

        coloursLabel.setText("Number Of Colours:");

        numOfColours.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2" }));
        numOfColours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOfColoursActionPerformed(evt);
            }
        });

        insulationLabel.setText("Is Inner Insulation Required?");

        buttonGroup2.add(insulationYes);
        insulationYes.setText("Yes");

        buttonGroup2.add(insulationNo);
        insulationNo.setText("No");

        chemicalResLabel.setText("Is Chemical Resistance Required?");

        buttonGroup3.add(chemicalResYes);
        chemicalResYes.setText("Yes");

        buttonGroup3.add(chemicalResNo);
        chemicalResNo.setText("No");

        plasticGradeLabel.setText("Required Grade of Plastic:");

        plasticGrade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        submitOrder.setText("Submit");
        submitOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitOrderActionPerformed(evt);
            }
        });

        clearOrder.setText("Clear");
        clearOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearOrderActionPerformed(evt);
            }
        });

        exitOrder.setText("Exit");
        exitOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitOrderActionPerformed(evt);
            }
        });

        jLabel1.setText("Is Reinforcement Required?");

        buttonGroup4.add(jRadioButton1);
        jRadioButton1.setText("Yes");

        buttonGroup4.add(jRadioButton2);
        jRadioButton2.setText("No");

        quantityLabel.setText("Quantity of Pipe?");

        pipeQuantityInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pipeQuantityInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(welcomeTxtLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantityLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(plasticGradeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chemicalResLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pipeQuantityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plasticGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chemicalResYes)
                            .addComponent(jRadioButton1)
                            .addComponent(insulationYes)
                            .addComponent(numOfColours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outerDiameterSelect)
                            .addComponent(pipeLengthInput, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(insulationLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(coloursLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(outerMeasurementLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(reqLengthLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(submitOrder)
                        .addGap(37, 37, 37)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radiusSelect)
                            .addComponent(insulationNo)
                            .addComponent(jRadioButton2)
                            .addComponent(chemicalResNo))
                        .addGap(8, 8, 8))
                    .addComponent(clearOrder, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(outerDiameterInput, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitOrder)
                        .addContainerGap())))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {clearOrder, exitOrder, submitOrder});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {outerDiameterInput, pipeLengthInput, pipeQuantityInput});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {numOfColours, plasticGrade});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(welcomeTxtLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reqLengthLabel)
                    .addComponent(pipeLengthInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outerMeasurementLabel)
                    .addComponent(outerDiameterInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outerDiameterSelect)
                    .addComponent(radiusSelect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coloursLabel)
                    .addComponent(numOfColours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insulationLabel)
                    .addComponent(insulationYes)
                    .addComponent(insulationNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jRadioButton2))
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chemicalResNo)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(plasticGradeLabel)
                            .addComponent(plasticGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chemicalResLabel)
                        .addComponent(chemicalResYes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quantityLabel)
                    .addComponent(pipeQuantityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearOrder)
                    .addComponent(exitOrder)
                    .addComponent(submitOrder))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Order Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        orderStatusLabel.setText("Your Order is:");

        validOrderTxtBox.setText("Pending");
        validOrderTxtBox.setFocusable(false);

        currentOrderLabel.setText("You Current Order:");

        totalCostLabel.setText("Total Cost:");

        totalCostTxtBox.setText("Pending");
        totalCostTxtBox.setFocusable(false);

        currentOrderList.setColumns(20);
        currentOrderList.setRows(5);
        currentOrderList.setFocusable(false);
        jScrollPane2.setViewportView(currentOrderList);

        arrayListOutput.setColumns(20);
        arrayListOutput.setRows(5);
        jScrollPane3.setViewportView(arrayListOutput);

        listPipeButtons.setText("Quick Summary");
        listPipeButtons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listPipeButtonsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listPipeButtons, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalCostLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(currentOrderLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(orderStatusLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(totalCostTxtBox)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(validOrderTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderStatusLabel)
                    .addComponent(validOrderTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentOrderLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalCostLabel)
                    .addComponent(totalCostTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(listPipeButtons))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        errorsLabel.setText("Errors:");

        errorOutputBox.setColumns(20);
        errorOutputBox.setRows(5);
        errorOutputBox.setFocusable(false);
        jScrollPane1.setViewportView(errorOutputBox);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(errorsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorsLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void outerDiameterInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outerDiameterInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outerDiameterInputActionPerformed

    private void radiusSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiusSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiusSelectActionPerformed

    private void numOfColoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numOfColoursActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_numOfColoursActionPerformed

    private void exitOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitOrderActionPerformed
    System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitOrderActionPerformed

    private void clearOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearOrderActionPerformed
    //SETS DEFAULT VALUES;
        clearForm();
// TODO add your handling code here:
    }//GEN-LAST:event_clearOrderActionPerformed

    private void submitOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitOrderActionPerformed
    //Checks the order for validity and sends the data to the SendOrder Method
        
        boolean validOrder=true,isDiam,isInsulated,isChem,isReinforce;
        double pipeLength,outerMeasurement;
        int numColours,grade,pipeQuantity;
        
        
        try {
            //Checks for valid data input in order form / outputs errors.
            pipeLength = Double.parseDouble(pipeLengthInput.getText());
            outerMeasurement = Double.parseDouble(outerDiameterInput.getText());
            pipeQuantity = Integer.parseInt(pipeQuantityInput.getText());
            
            
            if ((pipeLength<=0) || (pipeLength>6)){
                errorOutputBox.append("\n Pipe Length must be greater than 0 and no larger than 6.");
                validOrderTxtBox.setText("Invalid");
                validOrder=false;
            }
            
            if (outerMeasurement<=0){
                errorOutputBox.append("\n Outer Measurement must be greater than 0.");
                validOrderTxtBox.setText("Invalid");
                validOrder=false;
            }
            
            if (!(outerDiameterSelect.isSelected())&& !(radiusSelect.isSelected())){
                errorOutputBox.append("\n Ensure you have selected Radius or outer Diameter");
                validOrderTxtBox.setText("Invalid");
                validOrder=false;
            }
            
           if (!(insulationYes.isSelected())&& !(insulationNo.isSelected())){
                errorOutputBox.append("\n Ensure you have selected Yes or No for Insulation");
                validOrderTxtBox.setText("Invalid");
                validOrder=false;
            }
           
           if (!(chemicalResYes.isSelected())&& !(chemicalResNo.isSelected())){
                errorOutputBox.append("\n Ensure you have selected Yes or No to Chemical Resistance");
                validOrderTxtBox.setText("Invalid");
                validOrder=false;
            }
           
           if (!(jRadioButton1.isSelected())&& !(jRadioButton2.isSelected())){
                errorOutputBox.append("\n Ensure you have selected Yes or No to Reinforcement");
                validOrderTxtBox.setText("Invalid");
                validOrder=false;
           }
           
           if (pipeQuantity<=0){
                errorOutputBox.append("\n Quantity must be greater than 0.");
                validOrderTxtBox.setText("Invalid");
                validOrder=false;
            }
                
        } catch (NumberFormatException e) {
            errorOutputBox.append("\n Text Input must be a number / Incomplete order.");
            validOrder=false;
        }
        
        
        if (validOrder==true){
            errorOutputBox.setText("");
            validOrderTxtBox.setText("Valid");
            
            pipeLength = Double.parseDouble(pipeLengthInput.getText());
            outerMeasurement = Double.parseDouble(outerDiameterInput.getText());
            pipeQuantity = Integer.parseInt(pipeQuantityInput.getText());
            
            if(outerDiameterSelect.isSelected()){isDiam=true;}
            else{isDiam = false;}
            
            if(insulationYes.isSelected()){isInsulated=true;}
            else{isInsulated=false;}
            
            if(chemicalResYes.isSelected()){isChem=true;}
            else{isChem=false;}
            
            if(jRadioButton1.isSelected()){isReinforce=true;}
            else{isReinforce=false;}
            
            numColours = Integer.parseInt(String.valueOf(numOfColours.getSelectedItem())); 
            grade = Integer.parseInt(String.valueOf(plasticGrade.getSelectedItem())); 
            
            sendOrder(pipeLength,isDiam ,outerMeasurement,numColours,isInsulated,isReinforce,isChem,grade,pipeQuantity);
                          
            
        }
        
    
   
    }//GEN-LAST:event_submitOrderActionPerformed

    private void pipeQuantityInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pipeQuantityInputActionPerformed
        
    }//GEN-LAST:event_pipeQuantityInputActionPerformed

    private void listPipeButtonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listPipeButtonsActionPerformed
       listPipeTypes(orderList); 
    }//GEN-LAST:event_listPipeButtonsActionPerformed

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(PipeOrderingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PipeOrderingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PipeOrderingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PipeOrderingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PipeOrderingForm().setVisible(true);
            }
        });
        
        
    
    
    }
    
    // Creates new customer order object and checks data validity. 
    private void sendOrder(double len,boolean isDiam,double outerMeasure,int numColours,
                boolean isInsulated,boolean isReinforce,boolean isChemResis, int plasticGrade,int pipeQuantity){
                
        double multiplier;
        int type;
        
        
        CustomerOrder order1 = new CustomerOrder(len,isDiam,outerMeasure,numColours,isInsulated,isReinforce,isChemResis,plasticGrade);
        order1.createPipe();
                
        if(order1.checkPipe()==true){
            multiplier=order1.pipeCost();
            type = order1.selectPipe();
            double orderCost =(pipeQuantity*order1.calcAmount());
            total =total+(orderCost);
            validOrderTxtBox.setText("Valid");
            totalCostTxtBox.setText("£"+total);
            currentOrderList.append(pipeQuantity+" x "+len+" meters of "+order1.returnRadius()
                    +"'' radius,Type "+type+" pipe with\n"+multiplier+"x cost multiplier. Cost: £"+orderCost+"\n");
            orderList.add(order1);
            
            clearForm();
            }
            else{validOrderTxtBox.setText("Invalid");
                errorOutputBox.append("Invalid Order specification.");
        }
       
    }
    
    // Outputs array list data to quick summary
    public void listPipeTypes(ArrayList list){
        int size = list.size();
        
        arrayListOutput.setText("");
        for (int i=0;i<size;i++)
        {
           arrayListOutput.append(("Pipe number "+(i+1)+" is of Type:"+(orderList.get(i)).selectPipe())+" cost: £"+
                   ((orderList.get(i)).calcAmount())+"\n");
        }
            
    }
    
    
    //Clears order form from button / completed order
    private void clearForm(){ 
        pipeLengthInput.setText("");
        outerDiameterInput.setText("");
        buttonGroup1.clearSelection();
        numOfColours.setSelectedItem("0");
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();
        plasticGrade.setSelectedItem("1");
        errorOutputBox.setText("");
        pipeQuantityInput.setText("");
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea arrayListOutput;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel chemicalResLabel;
    private javax.swing.JRadioButton chemicalResNo;
    private javax.swing.JRadioButton chemicalResYes;
    private javax.swing.JButton clearOrder;
    private javax.swing.JLabel coloursLabel;
    private javax.swing.JLabel currentOrderLabel;
    private javax.swing.JTextArea currentOrderList;
    private javax.swing.JTextArea errorOutputBox;
    private javax.swing.JLabel errorsLabel;
    private javax.swing.JButton exitOrder;
    private javax.swing.JLabel insulationLabel;
    private javax.swing.JRadioButton insulationNo;
    private javax.swing.JRadioButton insulationYes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton listPipeButtons;
    private javax.swing.JComboBox numOfColours;
    private javax.swing.JLabel orderStatusLabel;
    private javax.swing.JTextField outerDiameterInput;
    private javax.swing.JRadioButton outerDiameterSelect;
    private javax.swing.JLabel outerMeasurementLabel;
    private javax.swing.JTextField pipeLengthInput;
    private javax.swing.JTextField pipeQuantityInput;
    private javax.swing.JComboBox plasticGrade;
    private javax.swing.JLabel plasticGradeLabel;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JRadioButton radiusSelect;
    private javax.swing.JLabel reqLengthLabel;
    private javax.swing.JButton submitOrder;
    private javax.swing.JLabel totalCostLabel;
    private javax.swing.JTextField totalCostTxtBox;
    private javax.swing.JTextField validOrderTxtBox;
    private javax.swing.JLabel welcomeTxtLabel;
    // End of variables declaration//GEN-END:variables
}