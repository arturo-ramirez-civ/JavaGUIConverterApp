/*File: DistanceConverter.java
* Author: Arturo Ramirez
* Created: February 20, 2021
* Purpose: Child class inherits parent methods and
* overrides convert() to calculate distance
*/
 
public class DistanceConverter extends Converter {
	
	//Inherits attributes from Converter Class
	
    //Constructor calls parent constructor
    public DistanceConverter (double input) {
    	super(input);
    }
        
	//Inherits Get method from Converter Class
  
    //Inherits Set method from Converter Class

    //Convert method to return input value
    @Override
	public double convert(double input) {
    	double km;
		
    	if (input != Double.NaN) {
    	km = input*1.609;
		return km;
    	} else {
    		return Double.NaN;
    	}
	}

}// End of Distance Class
