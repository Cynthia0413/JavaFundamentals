package com.fundamentals.data;

public class Dinosaur { 

	private String teeth; 
	private String skin;
	
	public Dinosaur(String teeth, String skin) {
	
	this.teeth = teeth; 
	this.skin = skin;
	}
	public Dinosaur(String teeth) {
	this(teeth, "rough"); 
}
	public String getTeeth() {
		return teeth;
	}

	public void setTeeth(String teeth) {
		this.teeth = teeth;
	}

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}
	/**
	 * A method that all dinosaurs do
	 * */
	public void move() { 
		System.out.println("Most dinosaurs walk");
		
	}
}
