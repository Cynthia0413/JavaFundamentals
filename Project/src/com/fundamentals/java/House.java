package com.fundamentals.java;
/*
 * Parent (super) class defined from the start of this Java class. This class
 * was constructed on paper when covering OOP prior to the beginning  the Java 
 * Language. This class consists of properties, variables and methods
 * */
public class House implements HomeInterface, PlumbingInterface {
/*
 * This class variables are part of the properties of this class. They are all 
 * encapsulated so they are either given a value or asked to return a value based
 * on their get/set methods.
 */
	private String windows; 
	private String doors; 
	private boolean hasStairs; 
	
	/*
	 * Class variables not associated with a given property 
	 */
	protected String value = "My House"; 
	
	
	public void setWindows(String value) {
		this.windows = value;
	}
	
	public String getWindows() {
		return windows;
	}
	
	public void setDoors(String doors) {
		this.doors = doors;
		
	}
	
	public String getDoors() {
		return doors;
	}
	
	public void setHasStairs(boolean value) {
		this.hasStairs = value;
	}
	
	public boolean getHasStairs() {
		return hasStairs; 
	}
	
	public void openDoor() {
		System.out.println("I opened a Steel Door"+value); 
		
	} 
	
	public void closeDoor() {
		
		
	}

	@Override
	public void decorate() {
		// TODO Auto-generated method stub
		System.out.println("Decorate House");
		
		}

	@Override
	public void supplementWork() {
		// TODO Auto-generated method stub
		System.out.println("Supplement Work");
		
	}

	@Override
	public void installPlumbing() {
		// TODO Auto-generated method stub
		System.out.println("Installing Plumbing");
		
	}
}
