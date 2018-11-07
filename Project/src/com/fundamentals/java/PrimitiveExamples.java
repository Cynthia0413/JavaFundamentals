package com.fundamentals.java;


/*
 * This class will demonstrate Primitive Data Types 
 * */
public class PrimitiveExamples {

	// Value range is true or false 
	boolean isPrimitive = true;
	
	// Value range is 0 to 65535
	char myChar = 'a';
	
	// Value range is -128 to 127
	byte myByte = 25; 
	
	// Value range is -32768 to 32767 
	short myShort = -250;
	
	// Value range is -2147483648 to 2147483647
	int myInt = 34678;
	
	// Value range is -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	long myLong = 52789L;
	
	// Value range varies 
	float myFloat = 20.543F; 
	
	// Value range varies 
	double myDouble = 36.89; 
	
	
	private String yourString = "My Private String"; 
	
	private void myPrivateMethod() {
		System.out.println("This is private.... Stay out.");
		yourString = "Your String"; 
		
	}
	
	public void myPublicMethod() {
		System.out.println("This is public");
		myPrivateMethod();
		
	}
	
	protected void myProtectedMethod() {
		System.out.println("This is protected");
	}
	
	int ab = 10, cd= 24;
	
	// Method changes instance value from 34678 to 3400 after it displays in the printLn 
	public void myFirstPrimitiveMethod() {
		System.out.println(myInt);
		myInt = 3400;
		System.out.println(myInt);
	}
	
	// Method adds two numbers to the total and displays the result.
	public void myAddition() {
		int total = ab + cd; 
		System.out.println(total);
	}
	
	//Method subtracts two numbers to the total and displays the result. 
	public void mySubtraction() {
		int total = ab - cd; 
		System.out.println(total);
	}
	
	// Method multiplies two numbers to a total and displays the result 
	public void myMultiplication() {
		int total = ab * cd;
		System.out.println(total);
	}
	
	// Method divides two numbers to a total and displays the result 
	public void myDivision() {
		double total = (double)cd / (double)ab;
		System.out.println(total);
	}
	
	// Method displays the remainder of the value 
	public void myModulus() {
		double total = (double)ab % (double)cd; 
		System.out.println(total);
	}
	
	// Method for order of operation 
	public void myOrderOp() {
		int total = (ab + cd) * 23;
		System.out.println(total);
		
	}
	
	
	public void conversionExample() {
		short a = 5; 
		int b = a;
		System.out.println(b);
		int c = 6488888;
		short d = (short)c;
		System.out.println(d);
		
	}
}
