package longpipes.pipes;

public class Pipe4 extends Pipe3{
    
    private boolean insulation;
    
    public Pipe4(double length, double diameter, int grade, int colour,
            boolean insulation, boolean resistance, int quantity) {
        super(length, diameter, grade, colour, resistance, quantity);
        this.insulation = insulation;
    }
   
    /**
     * Method extends functionality of super method for pipes with insulation. Returns the additional cost that the pipe will occur.
     * @return double
     */
    @Override
    public double getAdditionalCost(){
        double extra = super.getAdditionalCost();
        if (insulation) extra += 0.13;
        return extra;
    }
    
    /**
     * @return if pipe insulated.
     */
    @Override
    public boolean isInsulated(){
        return insulation;
    }
    
}
