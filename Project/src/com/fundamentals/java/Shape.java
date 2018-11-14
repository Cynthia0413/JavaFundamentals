package com.fundamentals.java;

/* Abstract class example. An abstract class can have no object instances created.
 * of itself, but can provide its sub-classes with data so they can have instances. Any method  
 * that is declared abstract must be implemented (created/used) in the sub-class. 
 * Static methods can be used, and even normal methods or properties. 
 * */

public abstract class Shape { // since it is abstract, i can not create more blueprints of this Shape class
	/*
	 * Encapsulated class variables that have setter/getter properties. They can be
	 * accessed via their subclass instance objects.
	 */
	private int length;
	private int width;

	public void setLength(int value) {
		this.length = value;
	}

	public int getLength() {
		return length;
	}
	/**
	 * @param width the width to set 
	 */
	public void setWidth(int value) {
		this.width = value;
	}

	public int getWidth() {
		return width;
	}

	/**
	 * Since a static method doesn't support instances, it can be used in an
	 * abstract class
	 **/
	public static int area(int length, int width) {
		return length * width; // Yes, you can have a static method inside an abstract class
	}

	// abstract method with parameters must be overridden by a subclass
	abstract double area(double length, double width, double height);

	// abstract method must be overridden by a subclass.
	abstract double area();

	// abstract method must be overridden by a subclass.
	abstract String draw();

}
