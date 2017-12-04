package longpipes.pipes;

public class Pipe4 extends Pipe3{
    
    private boolean insulation;
    
    public Pipe4(double length, double diameter, int grade, int colour,
            boolean insulation, boolean resistance, int quantity) {
        super(length, diameter, grade, colour, resistance, quantity);
        this.insulation = insulation;
    }
   
    /**
     * @return if pipe insulated.
     */
    @Override
    public boolean isInsulated(){
        return insulation;
    }
    
}
