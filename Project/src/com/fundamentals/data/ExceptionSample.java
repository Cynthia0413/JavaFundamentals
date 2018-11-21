package com.fundamentals.data;

public class ExceptionSample {
	
	String type = null; 

	public void myException() {
		try {
			System.out.println(type.trim()); // This is designed to fail because its null, there's no string to trim
		} catch(NullPointerException ex) {
			System.out.println("NullPointer Exception thrown "+ex.getMessage()); //the reason why this one was 
			//thrown, it's because the String type above on line 5 is already null
		}
		catch(Exception e) {
			System.out.println("General Exception thrown"+e.getMessage());
		}
	}
	public void mySecondException() {
		try {
			type = "something cool"; 
			System.out.println(type.toUpperCase()); 
		} catch(NullPointerException ex) {
			System.out.println("NullPointer Exception thrown"+ex.getMessage());
		} finally {
			System.out.println("Finally block called");
		}
	}
	
	public void myThirdException() {
		//String[] names = { "Matt", "Dave", "John" };
		String[] names = { "11", "22", "33" }; 
		try {
			byte b = Byte.parseByte(names[1]); 
			System.out.println(b);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Please provide a value in the range"+e.getMessage()); 
		} catch (NumberFormatException f) {
			System.out.println("That's not a number"+f.getMessage()); 
		} catch(OutOfMemoryError ex) {
			System.out.println("You gave me more than a byte"+ex.getMessage()); 
		} catch(Exception e) {
				System.out.println("I dunno but its wrong"+e.getMessage());
		}		
	}
}
