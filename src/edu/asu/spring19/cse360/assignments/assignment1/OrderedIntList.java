/*
 *  @author Hunter Bowman
 *  ClassID 332
 *  assignment 1
 *  
 *  OrderedIntList is class file used to make an array of integers.
 *  It has 2 methods, Insert and Print. The first is to insert a 
 *  passed value and put it in ascending order, no duplicates.
 *  The second is to print the array in rows of 5. 
 * 
 * 
 */

package edu.asu.spring19.cse360.assignments.assignment1;

public class OrderedIntList {
	
	private int[] array;  //array
	private int counter;    //counter
	private final int ARRAY_SIZE = 10;
	private final int COUNTER_INI = 0;
	
	/** creates an empty array */
	OrderedIntList () {
		counter = COUNTER_INI;
		array = new int[ARRAY_SIZE];
	}
	
	
	/**
	 * The method to insert an int into the array of integers in ascending order
	 * @param value is the int being passed during function call
	 */
	public void insert (int value) {
		
		int arrayIndex = 0;
		
		for (int i = 0; i<counter; i++,arrayIndex++) {
			
			//prevents dupes
			if (array[arrayIndex] == value) {
				return;
			}
			
			//makes sure value is inserted in right order
			if(value < array[i]) {
				break;
			}
		}
		
		
		for (int i = counter; i>arrayIndex; ) {
			array[i] = array[--i];	
		}
		
		//prevent the array from being written out of bounds
		if (arrayIndex == 10) {	
			arrayIndex--;	
		}
		
		
		array[arrayIndex]= value;
	
		
		counter++;
		
		//also prevent the array from being written out of bounds
		if(counter>10) {
			counter=10;
		}
			
			
	}
	
	/**
	 * Method to print out my array in rows of 5
	 */
	public void print () {
		
		System.out.println();
		
		//loop to iterate through array
		for (int i = 0; i<counter; i++) {
			
			//new line after 5 ints
			if (i%5 ==0) {
				System.out.println();
			}
			
			System.out.print(array[i] + "\t");
		}
		
	}
	


}
