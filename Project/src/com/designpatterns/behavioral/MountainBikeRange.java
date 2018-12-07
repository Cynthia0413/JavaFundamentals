package com.designpatterns.behavioral;

import java.util.Arrays;
import java.util.Iterator;

import com.designpatterns.base.BikeInterface;
import com.designpatterns.base.CrossCountryBike;
import com.designpatterns.base.DownhillBike;
import com.designpatterns.base.WideWheel;

public class MountainBikeRange implements Iterable<BikeInterface>{
	private BikeInterface[] bikes; 
	
	public MountainBikeRange() {
		bikes = new BikeInterface[5]; 
	
		bikes[0] = new DownhillBike(new WideWheel(22)); 
		bikes[1] = new DownhillBike(new WideWheel(24)); 
		bikes[2] = new CrossCountryBike(new WideWheel(26)); 
		bikes[3] = new CrossCountryBike(new WideWheel(24)); 
		bikes[4] = new CrossCountryBike(new WideWheel(22)); 
	}
	public BikeInterface[] getRange() {
		return bikes;
	}
	@Override
	public Iterator<BikeInterface> iterator() {
		return Arrays.asList(bikes).listIterator(); 
	}
}
