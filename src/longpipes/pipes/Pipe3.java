package longpipes.pipes;

public class Pipe3 extends Pipe{
    
    public Pipe3(double length, double diameter, int grade, int colour, boolean resistance, int quantity) {
        super(length, diameter, grade, colour,
                resistance, quantity);
        costPerInch = 0.75;
    }
    
}
