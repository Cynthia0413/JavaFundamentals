package com.designpatterns.behavioral;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.designpatterns.base.BikeInterface;
import com.designpatterns.base.NarrowWheel;
import com.designpatterns.base.TouringBike;
import com.designpatterns.base.VintageBike; 

public class RoadBikeRange  implements Iterable<BikeInterface>{
	private List<BikeInterface> bikes; 

	public RoadBikeRange() {
		bikes = new ArrayList<BikeInterface>();
	
		bikes.add(new TouringBike(new NarrowWheel(22))); 
		bikes.add(new TouringBike(new NarrowWheel(24))); 
		bikes.add(new TouringBike(new NarrowWheel(26))); 
		bikes.add(new VintageBike(new NarrowWheel(24))); 
		bikes.add(new VintageBike(new NarrowWheel(22))); 
	}
	
	public List<BikeInterface> getRange() {
		return bikes; 
	}

	@Override
	public Iterator<BikeInterface> iterator() {
		return bikes.listIterator();
	}
}
