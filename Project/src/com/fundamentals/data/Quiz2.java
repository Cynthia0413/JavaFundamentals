package com.fundamentals.data;

public class Quiz2 {

	private String variable1 = "Hello"; 
	
	String variable2 = "Java"; 
	
	protected int value = 10;
	
	public boolean isValid = true; 
	
	private void sampleMethod() {
	}
	void someMethod() {
	}
	protected void myProtectedMethod() {
	}
	public void myPublicMethod() { 
	}
	public static int mySubtraction(int value1, int value2) {
		int total = 0;
		if(value1 > value2) {
			total = value1 - value2;
		} else {
			total = value2 - value1; 
		}
		return total; 
	   }
	
	
	int ab = 10, cd= 24;
	public void mySubtraction() {
		int total = ab - cd; 
		System.out.println(total);
	}
}
