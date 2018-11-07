package com.fundamentals.java;

import java.util.Scanner;
import com.fundamentals.data.*; 

public class WelcomeToJava {

	public static final int MY_VALUE = 10;
	public static int MY_OTHER_VALUE; 
	
	static { 
		MY_OTHER_VALUE = 25; 
		int total = MY_VALUE * MY_OTHER_VALUE; // total should be 250
		System.out.println(total);
	}
	
	
	
	public static void main(String[] args) {
		MY_OTHER_VALUE = 35;
		
		// TODO Auto-generated method stub
        //someMethod();
        //stringExamples();
        //moreStringExamples();
        //primitiveExamples();
        //scannerExample();
        //myOperatorExample();
	    //myAssignmentExample(); 
		//myDecisionExample(); 
		//mySongExample();
		//myHouse(); 
		//sampleArray(); 
		//myDog();		
		//myTwoDimensionArray(); 
		//myJaggedArray();
		//accessModifierExamples();
		//overrideExample();
		//overloadExample(); 
		//inheritanceExample(); 
		//sampleUtility(); 
		// something(); // Can not run in a static method 
		
		
	}
	
	public void something() { //Will not run in static method
		}
	
	public static void sampleUtility() {
		System.out.println(Utility.addSomething(5, 23));
		Utility.somethingElse();
	}
	
	public static void overrideExample() {
		House myHouse = new House(); 
		Condo myCondo = new Condo(); 
		House myOtherhouse = new Condo(); //Inplicit Cast
		Condo myOtherCondo = (Condo)new House(); //Explicit Cast
		//myHouse.openDoor(); 
		//myCondo.openDoor(); 
		myOtherhouse.openDoor(); 

	}
	
	public static void overloadExample() {
		Apple myApple = new Apple(); 
		myApple.display("Granny Smiths", 5); 
		myApple.display("Sour", 3, "Red");
		// String Show = myApple.display("Granny Smiths", "Green"); 
		System.out.println(myApple.display("Granny Smiths", "Green"));
		
		System.out.println(Apple.SOUR_SCALE);
		System.out.println(myApple.SOUR_SCALE);
		System.out.println(Apple.SWEET_SCALE);
		Apple.SWEET_SCALE = 25;
		
	}
	
	public static void inheritanceExample() {
		House house = new House();
		Condo condo = new Condo(); 
		condo.setDoors("Red Door");
		System.out.println(condo.getDoors());
		house.setDoors("Purple Door"); 
		System.out.println(house.getDoors());
		
		
	}

	public static void accessModifierExamples() {
		PrimitiveExamples pe = new PrimitiveExamples(); 
		Apple myApple = new Apple(); 
		pe.myProtectedMethod();
		
	}
	
	
	public static void myJaggedArray() {
int[][] anArray = new int [3][5]; 
		
		anArray[0][0] = 6;
		anArray[0][1] = 8;
		anArray[0][2] = 10;
		anArray[0][3] = 11;
		anArray[0][4] = 13;
		anArray[1][0] = 12;
		anArray[1][1] = 14;
		anArray[1][2] = 16;
		anArray[1][3] = 17;
		anArray[1][4] = 19;
		anArray[2][0] = 18;
		anArray[2][1] = 20;
		anArray[2][2] = 22;
		anArray[2][3] = 21;
		anArray[2][4] = 23;
		
		System.out.println(anArray[0].length);
		for(int i = 0; i < anArray.length; i ++) {
			for(int j = 0; j < anArray[i].length; j ++) {
//			System.out.println(anArray[i][j]);
	       }
	    }
    }
	
	
	public static void myTwoDimensionArray() {
		int[][] anArray = new int [3][3]; 
		
		anArray[0][0] = 6;
		anArray[0][1] = 8;
		anArray[0][2] = 10;
		anArray[1][0] = 12;
		anArray[1][1] = 14;
		anArray[1][2] = 16;
		anArray[2][0] = 18;
		anArray[2][1] = 20;
		anArray[2][2] = 22;
		//System.out.println(anArray.length);
		for(int i = 0; i < anArray.length; i ++) {
			for(int j = 0; j < anArray.length; j ++) {
			System.out.println(anArray[i][j]);	
			}
		}
	}
	
	public static void sampleArray() {
		String[] myStringArray = {"happy", "monday", "java"};
		int[] myIntArray = new int[3]; 
		myIntArray[0] = 5;
		myIntArray[1] = 17;
		myIntArray[2] = 10; 
		
		int[] mySecondIntArray = myIntArray.clone();
		mySecondIntArray[3] = 3;
		mySecondIntArray[4] = 55;
		
		for(int i = 0; i < myIntArray.length; i ++) {
			System.out.println(myIntArray[i]);
		}
		for(int i = 0; i < mySecondIntArray.length; i ++) {
			System.out.println(mySecondIntArray[i]);
		}
		int j = 0; 
		while (j < myStringArray.length) {
			System.out.println(myStringArray[j]);
			j ++; 
		}
	}
	public static void myHouse() {
		House myHouse = new House(); 
		//myHouse.doors = "Red Doors";
		myHouse.setDoors("Red Doors");
		
		House mySecondHome = new House(); 
		//mySecondHome.doors = "Purple Doors"; 
		mySecondHome.setDoors("Purple Doors");
		
		House myThirdHome = myHouse;
		myHouse = mySecondHome; 
		
		House[] houseArray = new House[] { myHouse, mySecondHome, myThirdHome};
		
		System.out.println(myHouse.getDoors()); 
		System.out.println(mySecondHome.getDoors()); 
		System.out.println(myThirdHome.getDoors()); 
		
		int i = 0;
		do { 
			System.out.println(houseArray[i].getDoors());
			i ++; 
		} while(i < houseArray.length); 
		
	}
	
	public static void myDog() {
		Dog myDog = new Dog(); 
		
	}
	
	public static void mySongExample() {
		SongExamples se = new SongExamples();
		String beer = se.bottlesOfBeer(); 
		System.out.println(beer);
	}
	
	public static void myDecisionExample() {
		DecisionExamples de = new DecisionExamples(); 
		de.basicIfStatement();
		de.chainIfStatement();
		de.switchExample(60);
		
		LoopingExamples le = new LoopingExamples(); 
		le.myWhileLoop();
		le.myDoWhileLoop();
		le.myForLoop();
		le.myBranchExample();
		
	}
	
	
	public static void myAssignmentExample() {
		AssignmentExample ae = new AssignmentExample(); 
		ae.plusEqualsExample();
		ae.minusEqualsExample(); 
		ae.multiplyEqualsExample();
		ae.divisionEqualsExample();
		ae.modulusEqualsExample();
		ae.leftShiftEqualsExample();
		ae.rightShiftEqualsExample();
		ae.bitwiseAndEqualsExample();
		ae.bitwiseOrEqualsExample();
		
		
	}
	
	public static void myOperatorExample( ) {
		OperatorExamples oe = new OperatorExamples (); 
		oe.incrementSample();
		oe.decrementSample();
		oe.equalsExample();
		oe.equalsExample2();
		oe.logicalExample();
	}
	
	
//My first method
	public static void someMethod() {
		System.out.println("Welcome to Java");
	}
	
	public static void stringExamples() {

		// String = Type | str1 = variable name | Welcome = string literal
		String str1 = "Welcome";
		String str2 = new String ("Java"); 
		System.out.println(str2);
		// charAt method returns a single character at a certain position 
		char j = str1.charAt(2); // index is zero based
		System.out.println(j);
		// concat method joins two strings together; called Concatenation 
		String name = str2.concat(" is cool");
		System.out.println(name);
		// equals method will check to see if an object equals the string variable 
		boolean isMyString = str1.equals(str2);  // is str2 = str1?
		System.out.println(isMyString); 
		// toLowerCase method will make the variable with lower case letters
		String myString = str1.toLowerCase();
		System.out.println(myString);
		// toUpperCase method will make the variable with upper case letters 
		String mySecondString = str2.toUpperCase();
		System.out.println(mySecondString);
	}
	public static void moreStringExamples() {
		String myString = "My Java String"; 
		// Are these equal?
		boolean isTheSame = myString.toLowerCase().equals("my java string");
		System.out.println(isTheSame);
		// myString is capitalized then added, to is so capitalized 
		String name = myString.toUpperCase().concat(" is so capitilized"); 
		System.out.println(name); 
		// equalsIgnoreCase does not check if it has capitalization. It is ignored
		boolean testString = myString.equalsIgnoreCase("My java string");
		System.out.println(testString);
		// contains method checks to see if it matches part of the variable 
		boolean isContained = myString.contains("ava");
		System.out.println(isContained); 
		
	}

	public static void dataTypeExamples () {
		PrimitiveExamples pe = new PrimitiveExamples ();
		pe.myFirstPrimitiveMethod();
		pe.myAddition();
		pe.mySubtraction();
		pe.myMultiplication();
		pe.myDivision();
		pe.myModulus();
		pe.myOrderOp();
	}
	
	// Example of the use of Scanner 
	public static void scannerExample() {
		int x, y, z; 
		System.out.println("Enter two integers to calculate their sum ");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = x + y;
		System.out.println("Sum of entered intergers = " + z); 
		in.close();
	
	}
}



