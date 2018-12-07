package com.designpatterns.behavioral;

public class BikeSpeedMonitor implements SpeedometerListener{

	public static final int SPEED_TO_ALERT = 30;
	
	@Override 
	public void speedChange(SpeedometerEvent event) {
		if(event.getSpeed() > SPEED_TO_ALERT) {
			System.out.println("** ALERT** Riding too fast! ("+event.getSpeed()+")");
		} else {
			System.out.println("....nice and steady.... ("+event.getSpeed() + ")");
		}
	}
}
