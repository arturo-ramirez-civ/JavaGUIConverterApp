/*File: Converter.java
* Author: Arturo Ramirez
* Created: February 20, 2021
* Purpose: Parent class with a public and default constructor and
* a convert() method that returns input value
*/
 
public class Converter {
	
	//Attributes
	private double input;
    
    //Default constructor
    public Converter() {
        input = Double.NaN;
    }
    
    //Overloaded constructor
    public Converter(double input) {
    	this.input = input;
    }
        
	//Get method
    public double getInput() {
    	return input;
    }
  
    //Set method
    public void setInput(double input) {
    	this.input = input;
    }
	
    //Convert method to return input value
	public double convert(double input) {
		return input;
	}
}// End of Converter Class
