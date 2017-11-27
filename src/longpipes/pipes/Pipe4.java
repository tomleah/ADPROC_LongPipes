package longpipes.pipes;

public class Pipe4 extends Pipe3{
    
    public Pipe4(double length, double diameter, int grade, int colour,
            boolean insulation, boolean reinforcement, boolean resistance, int quantity) {
        super(length, diameter, grade, colour, insulation, reinforcement,
                resistance, quantity);
        costPerInch = 0.8;
    }
    
}
