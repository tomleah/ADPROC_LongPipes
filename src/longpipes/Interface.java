/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipes;

/**
 *
 * @author UP810928
 */
public class Interface extends javax.swing.JFrame {

    InterfaceHandler handler = new InterfaceHandler(this);
    /**
     * Creates new form Interface
     */
    public Interface() {
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

        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panAdd = new javax.swing.JPanel();
        cboColourOption = new javax.swing.JComboBox<>();
        chkInnerInsulation = new javax.swing.JCheckBox();
        chkOuterReinforcement = new javax.swing.JCheckBox();
        chkChemicalResistance = new javax.swing.JCheckBox();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblOrderCost = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();
        lblPipeLength = new javax.swing.JLabel();
        txtPipeLength = new javax.swing.JTextField();
        txtPipeDiameter = new javax.swing.JTextField();
        lblPipeDiameter = new javax.swing.JLabel();
        lblPlasticGrade = new javax.swing.JLabel();
        cboPlasticGrade = new javax.swing.JComboBox<>();
        lblColourOption = new javax.swing.JLabel();
        panTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInvoice = new javax.swing.JTable();
        btnQuit = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        jTextField3.setName("txtPipeDiameter"); // NOI18N

        jLabel4.setText("Outer Pipe Diameter (Inches):");
        jLabel4.setName("lblPipeDiameter"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LongPipes");

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setText("LongPipes");
        lblTitle.setName("lblTitle"); // NOI18N

        cboColourOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "1", "2" }));
        cboColourOption.setName("cboColourOption"); // NOI18N

        chkInnerInsulation.setText("Inner Insulation:");
        chkInnerInsulation.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkInnerInsulation.setName("chkInnerInsulation"); // NOI18N

        chkOuterReinforcement.setText("Outer Reinforcement:");
        chkOuterReinforcement.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkOuterReinforcement.setName("chkOuterReinforcement"); // NOI18N

        chkChemicalResistance.setText("Chemical Resistance:");
        chkChemicalResistance.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkChemicalResistance.setName("chkChemicalResistance"); // NOI18N

        lblQuantity.setText("Quantity:");
        lblQuantity.setName("lblQuantity"); // NOI18N

        txtQuantity.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtQuantity.setText("0");
        txtQuantity.setName("txtQuantity"); // NOI18N

        lblOrderCost.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOrderCost.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOrderCost.setText("Order Cost: £0");

        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        btnFinish.setText("Finish");
        btnFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFinishMousePressed(evt);
            }
        });

        lblPipeLength.setText("Length of Pipe (metres):");
        lblPipeLength.setName("lblPipeLength"); // NOI18N

        txtPipeLength.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPipeLength.setName("txtPipeLength"); // NOI18N

        txtPipeDiameter.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPipeDiameter.setName("txtPipeDiameter"); // NOI18N

        lblPipeDiameter.setText("Outer Pipe Diameter (Inches):");
        lblPipeDiameter.setName("lblPipeDiameter"); // NOI18N

        lblPlasticGrade.setText("Grade of Plastic:");
        lblPlasticGrade.setName("lblPlasticGrade"); // NOI18N

        cboPlasticGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cboPlasticGrade.setName("cboPlasticGrade"); // NOI18N

        lblColourOption.setText("Colour Option:");
        lblColourOption.setName("lblColourOption"); // NOI18N

        javax.swing.GroupLayout panAddLayout = new javax.swing.GroupLayout(panAdd);
        panAdd.setLayout(panAddLayout);
        panAddLayout.setHorizontalGroup(
            panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAddLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panAddLayout.createSequentialGroup()
                        .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(chkInnerInsulation)
                                .addGroup(panAddLayout.createSequentialGroup()
                                    .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPipeDiameter)
                                        .addComponent(lblPlasticGrade, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblPipeLength, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblColourOption, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cboColourOption, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboPlasticGrade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPipeLength)
                                        .addComponent(txtPipeDiameter, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(chkOuterReinforcement)
                                .addComponent(chkChemicalResistance))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAddLayout.createSequentialGroup()
                                .addComponent(lblQuantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAddLayout.createSequentialGroup()
                        .addComponent(lblOrderCost, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAddLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panAddLayout.setVerticalGroup(
            panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPipeLength)
                    .addComponent(txtPipeLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPipeDiameter)
                    .addComponent(txtPipeDiameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlasticGrade)
                    .addComponent(cboPlasticGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboColourOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColourOption))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkInnerInsulation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkOuterReinforcement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkChemicalResistance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd)
                .addGap(8, 8, 8)
                .addGroup(panAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrderCost)
                    .addComponent(btnFinish))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panTable.setEnabled(false);

        tblInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plastic Grade", "Colour Option", "Inner Insulation", "Outer Reinforcement", "Chemical Resistance", "Quantity", "Total Price"
            }
        ));
        jScrollPane1.setViewportView(tblInvoice);

        btnQuit.setText("Quit");

        btnEdit.setText("Edit");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panTableLayout = new javax.swing.GroupLayout(panTable);
        panTable.setLayout(panTableLayout);
        panTableLayout.setHorizontalGroup(
            panTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
                    .addGroup(panTableLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuit)))
                .addContainerGap())
        );
        panTableLayout.setVerticalGroup(
            panTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuit)
                    .addComponent(btnEdit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(panTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        handler.validateInputs();
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnEditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMousePressed
        handler.switchPanel();
    }//GEN-LAST:event_btnEditMousePressed

    private void btnFinishMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinishMousePressed
        handler.switchPanel();
    }//GEN-LAST:event_btnFinishMousePressed
    
    private void cboPlasticGradeActionPerformed(java.awt.event.ActionEvent evt) {                                                
        handler.updateColourOptions();
    }                                               

    private void cboColourOptionActionPerformed(java.awt.event.ActionEvent evt) {                                                
        handler.updateCheckboxes();
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnQuit;
    public javax.swing.JComboBox<String> cboColourOption;
    public javax.swing.JComboBox<String> cboPlasticGrade;
    public javax.swing.JCheckBox chkChemicalResistance;
    public javax.swing.JCheckBox chkInnerInsulation;
    public javax.swing.JCheckBox chkOuterReinforcement;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblColourOption;
    private javax.swing.JLabel lblOrderCost;
    private javax.swing.JLabel lblPipeDiameter;
    private javax.swing.JLabel lblPipeLength;
    private javax.swing.JLabel lblPlasticGrade;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblTitle;
    public javax.swing.JPanel panAdd;
    public javax.swing.JPanel panTable;
    public javax.swing.JTable tblInvoice;
    public javax.swing.JTextField txtPipeDiameter;
    public javax.swing.JTextField txtPipeLength;
    public javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
