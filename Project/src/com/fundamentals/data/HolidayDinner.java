package com.fundamentals.data;

public class HolidayDinner {

	public void letsEat() {
		Dinner[] d1 = Dinner.values(); 
		for(Dinner myDinner : d1) {
			System.out.println( myDinner + " at index " + myDinner.ordinal());
		}
	}
	
	public void letsChoose(Dinner type) {
		//dinner d1 = dinner.valueOf(type); 
		switch(type) {
		case Turkey:
			System.out.println("Love me some Turkey");
			break; 
		case Ham: 
			System.out.println("I'll take a piece of Ham");
			break; 
		case MacCheese:
			System.out.println("More Mac n Cheese please");
			break;
			default: 
			System.out.println("i'm Stuffed");
				break; 
		}
	}
	
	}
	
