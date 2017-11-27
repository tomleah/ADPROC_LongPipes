package longpipes;

import java.awt.Dimension;
import java.util.ArrayList;
import longpipes.pipes.Pipe;
import longpipes.pipes.Pipe1;
import longpipes.pipes.Pipe2;
import longpipes.pipes.Pipe3;
import longpipes.pipes.Pipe4;
import longpipes.pipes.Pipe5;

public class LongPipes {

    public static ArrayList<Pipe> pipes = new ArrayList<Pipe>();

    public static void main(String[] args) {
        Interface ui = new Interface();
        ui.setVisible(true);
        ui.panAdd.setVisible(true);
        ui.panTable.setVisible(false);
        ui.setSize(new Dimension(ui.panAdd.getPreferredSize().width + 50, ui.panAdd.getPreferredSize().height + 100));
    }

    public static Pipe addPipe(double length, double diameter, int grade, int colour, boolean insulation,
            boolean reinforcement, boolean resistance, int quantity) {

        Pipe pipe = null;
        
        //Pipe 1
        if (grade >= 1 && 
            grade <= 3 && 
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
            grade <= 5 && 
            colour == 2 && 
            insulation == false && 
            reinforcement == false) {
            pipe = new Pipe3(length, diameter, grade, colour, insulation,
            reinforcement, resistance, quantity);
        }
        //Pipe 4
        else if (grade >= 2 && 
            grade <= 5 && 
            colour == 2 && 
            insulation == true && 
            reinforcement == false) {
            pipe = new Pipe4(length, diameter, grade, colour, insulation,
            reinforcement, resistance, quantity);
        }
        //Pipe 5
        else if (grade >= 3 && 
            grade <= 5 && 
            colour == 2 && 
            insulation == true && 
            reinforcement == true) {
            pipe = new Pipe5(length, diameter, grade, colour, insulation,
            reinforcement, resistance, quantity);
        }
        if (pipe != null) pipes.add(pipe);
        return pipe;
    }
    public static int chkTempType(int grade, String colour){
            //chkType 0 = type I
            //chkType 1 = type II
            //chkType 2 = type III - IV
            //chkType 3 = type V 
            int chkType;
            if (grade <= 3 &&
                    colour == "none")
                chkType = 0;
            else if (grade <= 4 &&
                        colour == "1")
                chkType = 1;
            else if (grade == 2 &&
                        colour == "2")
                chkType = 2;
            else chkType = 3;
            return chkType;
    }

    public static double getTotalOrderCost(){
        double total = 0;
        for (Pipe pipe : pipes){
            total += pipe.getTotalCost();
        }
        return total;
    }
    
    public static double round(double input){
        return (double) Math.round(input * 100) / 100;
    }
}

