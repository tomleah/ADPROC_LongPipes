package longpipes.pipes;

public class Pipe5 extends Pipe4{
 
    private boolean reinforcement; 
    
    public Pipe5(double length, double diameter, int grade, int colour,
            boolean insulation, boolean reinforcement, boolean resistance, int quantity) {
        super(length, diameter, grade, colour, insulation, resistance, quantity);
        this.reinforcement = reinforcement;
        costPerInch = 0.95;
    }
    
    @Override
    public boolean isReinforced(){
        return reinforcement;
    }
    
}
