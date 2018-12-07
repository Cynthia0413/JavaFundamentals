package com.designpatterns.structural;

import com.designpatterns.base.BikeInterface;

public class GoldFrameBike extends AbstractBikeOption {

	public GoldFrameBike(BikeInterface bike) {
		super(bike); 
	}
	@Override 
	public float getPrice() {
		return decoratedBike.getPrice() + 300.00F;
	}
	
	public String toString() {
		return getClass().getSimpleName() + "(" +getWheel()+", GOLD price = "+getPrice()+")";
	}
}
