package longpipes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InterfaceHandler {
    Interface ui;
  
    public InterfaceHandler(Interface ui){
        this.ui = ui;
    }
    
    public void validateInputs(){
        String error = "";
        double length;
        double diameter;
        double quantity;
        //CHECK LENGTH FIELD
        if (ui.txtPipeLength.getText().equals("")){
            error += "Length of pipe not specified! \n";
        } 
        else {
            //Make sure length is a number
            try {
                length = Double.parseDouble(ui.txtPipeLength.getText());
            } catch (NumberFormatException e){
                error += "Length of pipe must be a number! \n";
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
        }
        
        //CHECK QUANTITY FIELD
        if (ui.txtQuantity.getText().equals("0")){
            error += "Quantity of pipe must be more than 0! \n";
        }
        else if (ui.txtQuantity.getText().equals("")){
            error += "Quantity of pipe not specified! \n";
        } 
        else {
            //Make sure quantity is a number
            try {
                quantity = Double.parseDouble(ui.txtQuantity.getText());
            } catch (NumberFormatException e){
                error += "Quantity must be a number! \n";
            }
        }
        if (!error.equals("")){ 
            JOptionPane.showMessageDialog(new JFrame(), error, "Check Inputs", JOptionPane.ERROR_MESSAGE);
        }
    }
}
