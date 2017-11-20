package longpipes.pipes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Pipe {

    private double length;
    private double outerDiameter;
    private double innerDiameter;
    private int grade;
    private int colour;
    private boolean insulation;
    private boolean reinforcement;
    private boolean resistance;
    private int quantity;

    public double costPerInch;

    public Pipe() {
    }

    public Pipe(double length, double diameter, int grade, int colour, boolean insulation,
            boolean reinforcement, boolean resistance, int quantity) {
        this.length = length;
        this.outerDiameter = diameter;
        this.innerDiameter = diameter * 0.9;
        this.grade = grade;
        this.colour = colour;
        this.insulation = insulation;
        this.reinforcement = reinforcement;
        this.resistance = resistance;
        this.quantity = quantity;
    }

    //TODO: We can do this smarter. Move into Pipe classes..
    public double getUnitCost() {
        double cost = getPlasticVolume() * getCostPerInch();
        double extra = 1;
        if (colour == 1) {
            extra += 0.12;
        }
        if (colour == 2) {
            extra += 0.16;
        }
        if (insulation) {
            extra += 0.13;
        }
        if (reinforcement) {
            extra += 0.17;
        }
        if (resistance) {
            extra += 0.14;
        }
        return cost * extra;
    }

    public double getTotalCost() {
        return getUnitCost() * quantity;
    }

    public double getPlasticVolume() {
        return (metersToInches(length) * ((Math.PI * outerDiameter) - (Math.PI * innerDiameter)));
    }

    public double metersToInches(double meters) {
        return meters * 39.37;
    }

    public double getLength() {
        return length;
    }

    public double getOuterDiameter() {
        return outerDiameter;
    }

    public double getInnerDiameter() {
        return innerDiameter;
    }

    public int getGrade() {
        return grade;
    }

    public int getColour() {
        return colour;
    }

    public boolean isInsulation() {
        return insulation;
    }

    public boolean isReinforcement() {
        return reinforcement;
    }

    public boolean isResistance() {
        return resistance;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCostPerInch() {
        return costPerInch;
    }

}
