package edu.asu.spring19.cse360.assignments.assignment1;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		OrderedIntList myList1 = new OrderedIntList();
		OrderedIntList myList2 = new OrderedIntList();
		OrderedIntList myList3 = new OrderedIntList();
		OrderedIntList myList4 = new OrderedIntList();
		OrderedIntList myList5 = new OrderedIntList();
		
		myList1.insert(1);
		myList1.insert(2);  
		myList1.insert(3);  
		myList1.insert(4);  
		myList1.insert(5);
		myList1.insert(6);  
		myList1.insert(7);  
		myList1.insert(8);
		myList1.insert(9);
		
		myList1.print();
		
		
		myList2.insert(9);
		myList2.insert(8);
		myList2.insert(7);  
		myList2.insert(6);  
		myList2.insert(5);  
		myList2.insert(4);
		myList2.insert(3);
		myList2.insert(2);  
		myList2.insert(1);  
		
		myList2.print();
		
		myList3.insert(6);
		myList3.insert(1);
		myList3.insert(9);  
		myList3.insert(2);  
		myList3.insert(8);  
		myList3.insert(4);
		myList3.insert(0);
		myList3.insert(5);  
		myList3.insert(3);
		myList3.insert(7);
		
		myList3.print();
		
		
		myList4.insert(6);
		myList4.insert(1);
		myList4.insert(9);  
		myList4.insert(2);  
		myList4.insert(8);  
		myList4.insert(6);
		myList4.insert(0);
		myList4.insert(5);
		
		myList4.print();
		
		myList5.insert(9);
		myList5.insert(1);
		myList5.insert(8);  
		myList5.insert(2);  
		myList5.insert(7);  
		myList5.insert(3);
		myList5.insert(6);
		myList5.insert(4);
		myList5.insert(5);
		myList5.insert(0);
		myList5.insert(10);
		
		myList5.print();
		
		

	}

}
