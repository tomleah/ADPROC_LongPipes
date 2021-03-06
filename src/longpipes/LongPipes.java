package longpipes;

import java.awt.Dimension;
import java.util.ArrayList;
import longpipes.pipes.Pipe;
import longpipes.pipes.Pipe1;
import longpipes.pipes.Pipe2;
import longpipes.pipes.Pipe3;
import longpipes.pipes.Pipe4;
import longpipes.pipes.Pipe5;

/**
 * LongPipes
 * Main application process.
 * Class contains the functionality to add valid pipes and some utility functions.
 */

public class LongPipes {

    public static ArrayList<Pipe> pipes = new ArrayList<Pipe>();

    public static void main(String[] args) {
        //Open up a new GUI.
        Interface ui = new Interface();
        ui.setVisible(true);
        ui.panAdd.setVisible(true);
        ui.panTable.setVisible(false);
        ui.setSize(new Dimension(ui.panAdd.getPreferredSize().width + 50, ui.panAdd.getPreferredSize().height + 100));
    }

    /**
     * Method takes in all information about a pipe, checks if the type exists and then adds it to the list of pipes in the order.
     * @param length
     * @param diameter
     * @param grade the pipe's grade of plastic
     * @param colour how many colours the pipe will have
     * @param insulation is the pipe insulated?
     * @param reinforcement is the pipe reinforced?
     * @param resistance does the pipe have chemical resistance?
     * @param quantity
     * @return Pipe 
     */
    public static Pipe addPipe(double length, double diameter, int grade, int colour, boolean insulation,
            boolean reinforcement, boolean resistance, int quantity) {

        Pipe pipe = null;
        
        //Pipe 1
        if (grade <= 3 && 
            colour == 0 && 
            insulation == false && 
            reinforcement == false) {
            pipe = new Pipe1(length, diameter, grade, colour, insulation,
            reinforcement, resistance, quantity);
        }
        //Pipe 2
        else if (grade >= 2 && 
            grade <= 4 && 
            colour == 1 && 
            insulation == false && 
            reinforcement == false) {
            pipe = new Pipe2(length, diameter, grade, colour, insulation,
            reinforcement, resistance, quantity);
        }
        //Pipe 3
        else if (grade >= 2 && 
            colour == 2 && 
            insulation == false && 
            reinforcement == false) {
            pipe = new Pipe3(length, diameter, grade, colour, resistance, quantity);
        }
        //Pipe 4
        else if (grade >= 2 && 
            colour == 2 && 
            insulation == true && 
            reinforcement == false) {
            pipe = new Pipe4(length, diameter, grade, colour, insulation,
             resistance, quantity);
        }
        //Pipe 5
        else if (grade >= 3 &&  
            colour == 2 && 
            insulation == true && 
            reinforcement == true) {
            pipe = new Pipe5(length, diameter, grade, colour, insulation,
            reinforcement, resistance, quantity);
        }
        if (pipe != null) pipes.add(pipe);
        return pipe;
    }

    /**
     * Method to get the total cost of the whole order of pipes.
     * @return double returns the sum of all the pipes in the order.
     */
    public static double getTotalOrderCost(){
        double total = 0;
        for (Pipe pipe : pipes){
            total += pipe.getTotalCost();
        }
        return total;
    }
    
    /**
     * Method to round numbers to 2dp.
     * @param input
     * @return double returns the input rounded to 2dp.
     */
    public static double round(double input){
        return (double) Math.round(input * 100) / 100;
    }
}

