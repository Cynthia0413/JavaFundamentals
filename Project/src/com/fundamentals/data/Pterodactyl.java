package com.fundamentals.data;

public class Pterodactyl extends Dinosaur{ 
	
	public Pterodactyl(String teeth, String skin) {
		super (teeth, skin); 
	}
	
	/**
	 * A method that all Pterodactyls do
	 * */
	@Override
    public void move() { 
		System.out.println("All pterodactyls fly");	
	}
	
	public void nesting() { 
		System.out.println("Preparing a nest");
	}
}
