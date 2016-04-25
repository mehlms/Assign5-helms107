/**
 * SE320- Individual Assignment 5
 * 
 * Represents a Triangle
 * @author Dr. Donyina
 * @author Matthew Helms
 */
public class Triangle {
    protected double sideA;
    protected double sideB;
    protected double sideC;

    /**
     * @param sideA
     * @param sideB
     * @param sideC
     * @throws Exception
     */
    Triangle(double sideA, double sideB, double sideC) throws Exception {
        if (!validateInput(sideA, sideB, sideC)) {
            throw new Exception("Invalid Inputs");
        }

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     * @param sideA
     * @param sideB
     * @param sideC
     * @return
     */
    public boolean validateInput(double sideA, double sideB, double sideC) {
       if (sideA > 0 && sideB > 0 && sideC > 0){
           return true;
       }
       return false;
    }
   
    /**
     * @return
     */
    public double getSideA() {
        return this.sideA;
    }
    
 
    /**
     * @return
     */
    public double getSideB() {
        return this.sideB;
    }
    
   
    /**
     * @return
     */
    public double getSideC() {
        return this.sideC;
    }
    
 
    /**
     * @return
     */
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
    
  
    /**
     * @return
     */
    public double getArea() {
        double p = getPerimeter()/2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

}
