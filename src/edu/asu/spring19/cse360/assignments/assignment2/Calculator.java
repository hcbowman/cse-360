package edu.asu.spring19.cse360.assignments.assignment2;

/**
 * 	<p>
 *  @author Hunter Bowman
 *  ClassID 332
 *  assignment 2
 *  https://github.com/hunterbowman/CSE360/tree/master/bin/edu/asu/spring19/cse360/assignments/assignment2
 *  </p>
 *  
 *  <p>
 *  <code>Calculator</code> class is a simple program that will add, subtract, multiply, divide,
 *  and it will keep track of the history of the methods and values that were used.
 * 	</p>
 * 
 */

public class Calculator {

	
	private int total; //the running total
	private StringBuilder history = new StringBuilder("0"); //used to save the history of the commands
	
	/**
	 * basic constructor
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * getter for the total
	 * @return the current running total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * my method for addition
	 * 
	 * @param value is added to the total
	 */
	public void add (int value) {
		total = total + value;
		history.append("+");
		history.append(value);
	}
	
	/**
	 * method for subtraction
	 * @param value is subtracted from the total
	 */
	public void subtract (int value) {
		total = total - value;
		history.append("-");
		history.append(value);
	}
	
	/**
	 * method for multiplication
	 * 
	 * @param value is multiplied by the total
	 */
	public void multiply (int value) {
		total = total * value;
		history.append("*");
		history.append(value);
	}
	
	/**
	 * method for division. If 0 is passed, sets total to 0.
	 * 
	 * @param value divides the total
	 */
	public void divide (int value) {
		
		if (value == 0) {
			total = 0;
		}
		else {
			total = total / value;
		}
		
		history.append("/");
		history.append(value);
		
	}
	
	/**
	 *	Used to get operation history.
	 *
	 * @return returns a object of type StringBuilder, which is
	 * a history of the operations and values that were used.
	 */
	public StringBuilder getHistory () {
		history.append("=");
		history.append(total);
		return history;
	}
}