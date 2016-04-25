/**
 * SE320- Individual Assignment 5
 * 
 * Represents a Equilateral Triangle
 * @author Dr. Donyina
 * @author Matthew Helms
 */
public class EquilateralTriangle extends Triangle {
    
    /**
     * @param length
     * @throws Exception
     */
    EquilateralTriangle(double length) throws Exception {
        super(length, length, length);
    }

    /* (non-Javadoc)
     * @see Triangle#validateInput(double, double, double)
     */
    public boolean validateInput(double sideA, double sideB, double sideC) {
        return sideA > 0;
    }
   
    /* (non-Javadoc)
     * @see Triangle#getArea()
     */
    public double getArea() {
    	// BUG: The formula here was wrong, changed 5 to 3
        return (Math.sqrt(3)/4) * sideA * sideA;
    }

}
