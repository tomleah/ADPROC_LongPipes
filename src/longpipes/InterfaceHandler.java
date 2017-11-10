package longpipes;

import java.util.InputMismatchException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InterfaceHandler {
    Interface ui;
  
    public InterfaceHandler(Interface ui){
        this.ui = ui;
    }
    
    public void validateInputs(){
        String error = "";
        double length = 0;
        double diameter = 0;
        int plasticGrade = Integer.parseInt(String.valueOf(ui.cboPlasticGrade.getSelectedItem()));
        int colourOption; 
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
            
            if (diameter <= 0 && diameter > 12){
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
                error += "Quantity must be a whole number! \n";
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
            if(!LongPipes.addPipe(length, diameter, plasticGrade, colourOption, innerInsulation,
            outerReinforcement, chemicalResistance, quantity)) {
                JOptionPane.showMessageDialog(new JFrame(), "Pipe not found! \nTry different inputs.", "Invalid Pipe", JOptionPane.ERROR_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(new JFrame(), "Pipe successfully added to order!", "Pipe added", JOptionPane.PLAIN_MESSAGE);
                resetForm();
            }
        }
    }
    
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
}
