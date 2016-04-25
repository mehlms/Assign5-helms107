/**
 * SE320- Individual Assignment 5
 * 
 * Represents a Right Angled Triangle
 * @author Dr. Donyina
 * @author Matthew Helms
 */
public class RightAngledTriangle extends Triangle {
    
    /**
     * @param width
     * @param height
     * @param hypotenuse
     * @throws Exception
     */
    RightAngledTriangle(double width, double height, double hypotenuse) throws Exception {
        super(width, height, hypotenuse);
    }

    /* (non-Javadoc)
     * @see Triangle#validateInput(double, double, double)
     */
    public boolean validateInput(double sideA, double sideB, double sideC) {
            if((sideC * sideC) == ((sideA * sideA) + (sideB * sideB))){
                return true;
            }
        return false;
    }

    /* (non-Javadoc)
     * @see Triangle#getArea()
     */
    public double getArea() {
        return ((sideA * sideB) / 2);
    }

}
