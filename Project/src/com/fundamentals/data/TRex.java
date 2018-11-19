package com.fundamentals.data;

public class TRex extends Dinosaur { 
	
	public TRex(String teeth, String skin) {
		super(teeth, skin); 
	}
	
	public TRex(String teeth) {
		super(teeth, "Scales"); 
	}
	
	/**
	 * A method that all TRexs do
	 * */
	@Override
	public void move() { 
		System.out.println("All TRexs run");
		
	}
	
	public void devourPrey() {
		System.out.println("TRex devours its prey");
	}
}
