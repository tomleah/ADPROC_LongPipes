package longpipes.pipes;

/**
 * Pipe
 * Main pipe class containing common properties for all types of pipe.
 */

public abstract class Pipe {

    private double length;
    private double outerDiameter;
    private double innerDiameter;
    private int grade;
    private int colour;
    private boolean resistance;
    private int quantity;

    public double costPerInch;

    //Constructor
    public Pipe() {
    }
    
    /**
     * Constructor
     * @param length
     * @param diameter
     * @param grade
     * @param colour
     * @param resistance is the pipe chemical resistant? 
     * @param quantity 
     */
    public Pipe(double length, double diameter, int grade, int colour,
            boolean resistance, int quantity) {
        this.length = length;
        this.outerDiameter = diameter;
        this.innerDiameter = diameter * 0.9;
        this.grade = grade;
        this.colour = colour;
        this.resistance = resistance;
        this.quantity = quantity;
    }

    /**
     * Method to return cost of 1 pipe with the given values.
     * @return double returns the cost of 1 unit in £.
     */
    public double getUnitCost() {
        double cost = getPlasticVolume() * getCostPerInch(getGrade());
        return cost * getAdditionalCost();
    }
    
    /**
     * Method calculates any additional costs the pipe may occur.
     * @return double returns the additional cost multiplier.
     */
    public double getAdditionalCost(){
         double extra = 1;
        //Find any additional costs the pipe may have.
        if (colour == 1) {
            extra += 0.12;
        }
        if (colour == 2) {
            extra += 0.16;
        }
        if (resistance) {
            extra += 0.14;
        }
        return extra;
    }

    /**
     * Method returns the cost per inch of plastic depending on the grade.
     * @param grade grade of plastic
     * @return double 
     */
    public double getCostPerInch(int grade) {
        switch (grade) {
            case 1:
                return 0.4;
            case 2:
                return 0.6;
            case 3:
                return 0.75;
            case 4:
                return 0.8;
            case 5:
                return 0.95;
            default:
                return -1;
        }
    }
    
    /**
     * Method returns the total cost of the pipe, including quantity.
     * @return double
     */
    public double getTotalCost() {
        return getUnitCost() * quantity;
    }

    /**
     * Method calculates the volume of the plastic needed for the pipe.
     * @return double
     */
    public double getPlasticVolume() {
        return (metersToInches(getLength()) * ((Math.PI * Math.pow(getRadius(outerDiameter), 2)) - (Math.PI * Math.pow(getRadius(innerDiameter), 2))));
    }

    /**
     * Method that given a diameter will return the radius.
     * @param diameter
     * @return double
     */
    public double getRadius(double diameter) {
        return diameter / 2;
    }

    /**
     * Method converts meters to inches.
     * @param meters
     * @return double
     */
    public double metersToInches(double meters) {
        return meters * 39.37;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @return the outer diameter
     */
    public double getOuterDiameter() {
        return outerDiameter;
    }

    /**
     * @return the inner diameter
     */
    public double getInnerDiameter() {
        return innerDiameter;
    }

    /**
     * @return the grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @return the colour.
     */
    public int getColour() {
        return colour;
    }

    public boolean isInsulated() {
        return false;
    }

    public boolean isReinforced() {
        return false;
    }

    /**
     * @return the resistance
     */
    public boolean isResistance() {
        return resistance;
    }

    /**
     * @return the quantity.
     */
    public int getQuantity() {
        return quantity;
    }

}
