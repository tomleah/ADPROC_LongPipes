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

    public static boolean addPipe(double length, double diameter, int grade, int colour, boolean insulation,
            boolean reinforcement, boolean resistance, int quantity) {

        //Pipe 1
        if (grade >= 1 && 
            grade <= 3 && 
            colour == 0 && 
            insulation == false && 
            reinforcement == false) {
            pipes.add(new Pipe1(length, diameter, grade, colour, insulation,
            reinforcement, resistance, quantity));
            return true;
        }
        //Pipe 2
        if (grade >= 2 && 
            grade <= 4 && 
            colour == 1 && 
            insulation == false && 
            reinforcement == false) {
            pipes.add(new Pipe2(length, diameter, grade, colour, insulation,
            reinforcement, resistance, quantity));
            return true;
        }
        //Pipe 3
        if (grade >= 2 && 
            grade <= 5 && 
            colour == 2 && 
            insulation == false && 
            reinforcement == false) {
            pipes.add(new Pipe3(length, diameter, grade, colour, insulation,
            reinforcement, resistance, quantity));
            return true;
        }
        //Pipe 4
        if (grade >= 2 && 
            grade <= 5 && 
            colour == 2 && 
            insulation == true && 
            reinforcement == false) {
            pipes.add(new Pipe4(length, diameter, grade, colour, insulation,
            reinforcement, resistance, quantity));
            return true;
        }
        //Pipe 5
        if (grade >= 3 && 
            grade <= 5 && 
            colour == 2 && 
            insulation == true && 
            reinforcement == true) {
            pipes.add(new Pipe5(length, diameter, grade, colour, insulation,
            reinforcement, resistance, quantity));
            return true;
        }
        return false;

    }

}
