package longpipes.pipes;

public class Pipe5 extends Pipe4{
 
    public Pipe5(double length, double diameter, int grade, int colour,
            boolean insulation, boolean reinforcement, boolean resistance, int quantity) {
        super(length, diameter, grade, colour, insulation, reinforcement,
                resistance, quantity);
        costPerInch = 0.95;
    }
    
}
