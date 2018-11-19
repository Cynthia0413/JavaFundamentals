package com.fundamentals.data;

public class GrannySmiths extends Apple {

	public String color = "Green"; 
	
	
	public void decide() {
	System.out.println(" Which would you rather eat?");
	System.out.println(" A regular " + super.color + " apple or ");
	System.out.println(" A Granny Smith's " +color+ " Apple");
	display(" Granny Smith ", 30);
	super.display(" Red Apple", 45);
	}
	
	@Override
	public void display(String type, int count) {
		System.out.println("This " +type+ "has been eaten "+count+" times ");
	}
}