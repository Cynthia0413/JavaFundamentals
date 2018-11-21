package com.fundamentals.data;

public enum Dinner {
		Turkey, Stuffing, Cranberry, SweetPotatoes, MacCheese,
		DinnerRolls, Ham, GreenBeanCasorole, GreenRice, MashedPotatoes, 
		CornBread, DeviledEggs, PumpkinPie, AppleCobler;
	
	private Dinner() {
		System.out.println("Constructor called for"+this.toString());
	}
	
	public void readyNow() {
		System.out.println("Let's eat already.");
	}
}


