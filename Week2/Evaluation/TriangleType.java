package Week2.Evaluation;


	/**
	 * 12. Triangles
	 * 
	 * Determine if a triangle is equilateral, isosceles, or scalene. An equilateral
	 * triangle has all three sides the same length. An isosceles triangle has at
	 * least two sides the same length.
	 * 
	 * (It is sometimes specified as having exactly two sides the same length, but
	 * for the purposes of this exercise we'll say at least two.) A scalene triangle
	 * has all sides of different lengths.
	 */

public class TriangleType {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public TriangleType() {
        super();
    }

    public TriangleType(double sideOne, double sideTwo, double sideThree) {
        this();
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }

    public boolean isEquilateral() {
        if(this.sideOne == this.sideTwo && this.sideTwo == this.sideThree){
            return true;
        }
        return false;
    }

    public boolean isIsosceles() {
        if(this.sideOne == this.sideTwo || this.sideTwo == this.sideThree || this.sideThree == this.sideOne){
            return true;
        }
        return false;
    }

    public boolean isScalene() {
        if(this.sideOne == this.sideTwo || this.sideOne == this.sideThree || this.sideTwo == this.sideThree){
            return false;
        }
        return true;
    }

}
