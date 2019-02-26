package edu.asu.spring19.cse360.assignments.assignment2;

/**
 * 
 * @author hcbow
 * 
 * My tester class for my Calculator class
 *
 */

public class Main {

	public static void main(String[] args) {
		
		Calculator myC = new Calculator();
		
		myC.add(4);
		myC.subtract(1);
		myC.multiply(4);
		myC.divide(2);
		//myC.divide(0);
		System.out.println(myC.getHistory());

	}

}
