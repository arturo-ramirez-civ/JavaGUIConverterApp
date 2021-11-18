/*File: TemperatureConverter.java
* Author: Arturo Ramirez
* Created: February 20, 2021
* Purpose: Child class inherits parent methods and
* overrides convert() to calculate temperature
*/
 
public class TemperatureConverter extends Converter {
	
	//Inherits attributes from Converter Class
	
    //Constructor calls parent constructor
    public TemperatureConverter(double input) {
    	super(input);
    }
         
	//Inherits Get method from Converter Class
    
    //Inherits Set method from Converter Class

    //Convert method to return input value
    @Override
	public double convert(double input) {
    	double celsius;
    	
    	if (input != Double.NaN) {
    	celsius = ((input-32)*5)/9;
		return celsius;
		
    	} else {
    		return Double.NaN;
    	}
	}
}// End of TemperatureConverter Class
