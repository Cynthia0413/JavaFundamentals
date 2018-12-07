package com.designpatterns.behavioral;

public class Bearings implements Visitable {

	
	@Override 
	public void acceptVisitor(WheelVisitorInterface visitor) {
		visitor.visit(this);
	}
}
