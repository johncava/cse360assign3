/**Student Name: John Cava
 *PIN: 210
 *Description:
 *Calculator - Given a value, the calculator will add, subtract, multiply, or divide from the existing value
 *			 Initial value of the calculator is zero. There is a getHistory method that returns the string representaiton
 *			 of the computations made.
 */
package cse360assign3;

public class Calculator {
	
	//Private integer total holds the final value made from the calculations made 
	private int total;
	
	//Private String variable is initialized with string representation of 0
	private String history = "0";
	
	/**
	 * @author John Cava
	 * @param none
	 * @ return none
	 * 
	 * Initializes the Calculator object and sets the variable total to 0
	 */
	public Calculator () {
		total = 0; 
	}
	
	/**
	 * @author John Cava
	 * @param None
	 * @return Int - Returns the total of the specific value of the calculation
	 * 
	 * Returns the variable total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * @author John Cava
	 * @param value - Integer
	 * @return none 
	 * 
	 * An integer variable value is added to the total variable
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	/**
	 * @author John Cava
	 * @param value - Integer
	 * @return none
	 * 
	 * An integer variable value is subtracted from the total variable
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/**
	 * @author John Cava
	 * @param value - Integer
	 * @return none
	 * 
	 * The value of the total variable is multiplied by the integer paramater value
	 */
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	
	/**
	 * @author John Cava
	 * @param value
	 * @return none
	 * 
	 * The value of the total variable is divided by the integer paramater value
	 */
	public void divide (int value) {
		if (value == 0){
			total = 0;
		} 
		else {
		total = total / value;
		}
		history = history + " / " + value;
	}
	
	/**
	 * @author John Cava
	 * @param none
	 * @return String 
	 * 
	 * Method returns the string representation of the computations made by the Calculator class
	 */
	public String getHistory () {
		return history;
	}
}