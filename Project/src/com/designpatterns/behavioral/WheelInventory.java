package com.designpatterns.behavioral;

import com.designpatterns.base.WheelInterface;

public class WheelInventory implements WheelVisitorInterface {

	private int spokesCount; 
	private int bearingsCount; 
	
	public WheelInventory() {
		spokesCount = 30;
		bearingsCount = 2; 
	}
	@Override 
	public void visit(WheelInterface wheel) {
		System.out.println("The wheel has: " + spokesCount + " spokes and " + bearingsCount + "bearings");
	}
	@Override 
	public void visit(Spokes spokes) {
		spokesCount ++; 
	}
	@Override
	public void visit(Bearings bearings) {
		bearingsCount ++;
	}
}
