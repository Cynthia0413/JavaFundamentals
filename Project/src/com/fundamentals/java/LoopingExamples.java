package com.fundamentals.java;

public class LoopingExamples {

	public void myWhileLoop() {
		int value = 0; 
		while(value < 10) {
			System.out.println(value);
			value ++; 			
		} // end of while loop 
	} // end of method 
	
	public void myDoWhileLoop() {
		int value = 0;
		do {
			System.out.println(value);
			value ++; 			
		} while( value < 10); 
		
	} // end of method 
	
	public void myForLoop() {
		for(int i = 0; i < 10; i ++) {
			System.out.println(i);
		} // end of for loop
	} //end of method 
	
	public void myBranchExample() {
		for(int i = 0; i < 10; i ++) {
			if(i == 2) {
				continue;
				} // end of if
			if(i == 4) {
				System.out.println("The if statement breaks");
				break;
			} // end of if
			System.out.println(i);
		} // end of for 
		System.out.println("Loop Ends");
	} // end of method
	
	
} // end of class 
