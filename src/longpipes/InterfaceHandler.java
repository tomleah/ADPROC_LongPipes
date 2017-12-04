package longpipes;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import longpipes.pipes.Pipe;

/**
 * InterfaceHandler
 * Takes in an Interface GUI and handles any requests coming in from the interface.
 */

public class InterfaceHandler {
    Interface ui;
  
    public InterfaceHandler(Interface ui){
        this.ui = ui;
    }
    
    /**
     * Method checks each input for validity and will either create an error pop-up or adds the input as a new pipe.
     */
    public void validateInputs(){
        String error = "";
        double length = 0;
        double diameter = 0;
        int plasticGrade = Integer.parseInt(String.valueOf(ui.cboPlasticGrade.getSelectedItem()));
        int colourOption; 
        
        //Convert ComboBox input to an int.
        if (String.valueOf(ui.cboColourOption.getSelectedItem()).equalsIgnoreCase("none")){
            colourOption = 0;
        } 
        else {
            colourOption = Integer.parseInt(String.valueOf(ui.cboColourOption.getSelectedItem()));
        }
        boolean innerInsulation = ui.chkInnerInsulation.isSelected();
        boolean outerReinforcement = ui.chkOuterReinforcement.isSelected();
        boolean chemicalResistance = ui.chkChemicalResistance.isSelected();
        int quantity = 0;
        
        //CHECK LENGTH FIELD
        if (ui.txtPipeLength.getText().equals("")){
            error += "Length of pipe not specified! \n";
        } 
        else{
            //Make sure length is a number
            try {
                length = Double.parseDouble(ui.txtPipeLength.getText());
            } catch (NumberFormatException e){
                error += "Length of pipe must be a number! \n";
            }
            //Make sure the length of the pipe is within the correct bounds.
            if (length > 6 || length <= 0){
                error += "Pipe length must be between 0 and 6 meters! \n";
            } 
        }
        
        //CHECK DIAMETER FIELD
        if (ui.txtPipeDiameter.getText().equals("")){
            error += "Diameter of pipe not specified! \n";
        } 
        else {
            //Make sure diameter is a number
            try {
                diameter = Double.parseDouble(ui.txtPipeDiameter.getText());
            } catch (NumberFormatException e){
                error += "Diameter of pipe must be a number! \n";
            }
            
            //Make sure the diameter of the pipe is within the correct bounds.
            if (diameter <= 0 || diameter > 12){
                error += "Diameter must between 0 and 12 inches. \n";
            } 
        }
        
        //CHECK QUANTITY FIELD
        if (ui.txtQuantity.getText().equals("")){
            error += "Quantity of pipe not specified! \n";
        } 
        else {
            //Make sure quantity is a number
            try {
                quantity = Integer.parseInt(ui.txtQuantity.getText());
            } catch (NumberFormatException e){
                error += "Quantity must be an integer! \n";
            } 
        }
        
        if (quantity <= 0){
                error += "Quantity must be more than 0! \n";
        } 
        
        //If there is an error, tell the user.
        if (!error.equals("")){ 
            JOptionPane.showMessageDialog(new JFrame(), error, "Check Inputs", JOptionPane.ERROR_MESSAGE);
        }
        //We all valid!
        else {
            Pipe pipe = LongPipes.addPipe(length, diameter, plasticGrade, colourOption, innerInsulation,
            outerReinforcement, chemicalResistance, quantity);
            //Error
            if(pipe == null) {
                JOptionPane.showMessageDialog(new JFrame(), "Pipe not found! \nTry different inputs.", "Invalid Pipe", JOptionPane.ERROR_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(new JFrame(), "Pipe successfully added to order!", "Pipe added", JOptionPane.PLAIN_MESSAGE);
                resetForm();
            }
        }
    }
    /**
     * Method resets all the fields in the GUI so that the system is ready to add a new pipe to the order.
     */
    private void resetForm(){
        ui.txtPipeLength.setText("");
        ui.txtPipeDiameter.setText("");
        ui.cboPlasticGrade.setSelectedIndex(0);
        ui.cboColourOption.setSelectedIndex(0);
        ui.chkInnerInsulation.setSelected(false);
        ui.chkOuterReinforcement.setSelected(false);
        ui.chkChemicalResistance.setSelected(false);
        ui.txtQuantity.setText("0");
    }
    
    /**
     * Method allows the GUI to switch between adding a new pipe and the invoice.
     */
    boolean adding = false;
    public void switchPanel(){
        adding = !adding;
        if (adding){
            //Adding
            ui.panTable.setVisible(false);
            ui.panAdd.setVisible(true);
            ui.lblTitle.setText("LongPipes");
            ui.setSize(new Dimension(ui.panAdd.getPreferredSize().width + 50, ui.panAdd.getPreferredSize().height + 100));
        } else {
            //Table
            ui.panAdd.setVisible(false);
            ui.panTable.setVisible(true);
            ui.lblTitle.setText("Invoice - LongPipes");
            ui.setSize(new Dimension(ui.panTable.getPreferredSize().width + 600, ui.panTable.getPreferredSize().height + 100));
            updateTable();
        }
        ui.lblTotalPrice.setText("Total: £" + LongPipes.round(LongPipes.getTotalOrderCost()));
    }
    
    /**
     * Method populates the invoice table with all data about the pipes added to the order.
     */
    public void updateTable(){
        DefaultTableModel model = (DefaultTableModel) ui.tblInvoice.getModel();
        model.setRowCount(0);
        
        //For every pipe added to order get the information of the pipe and add a row with its data.
        for (Pipe pipe : LongPipes.pipes){
            double totalPrice = LongPipes.round(pipe.getTotalCost());
            model.addRow(new Object[] {pipe.getGrade(), pipe.getColour(), pipe.isInsulated(), pipe.isReinforced(), pipe.isResistance(), pipe.getQuantity(), "£" + totalPrice});
        }
    }
}
