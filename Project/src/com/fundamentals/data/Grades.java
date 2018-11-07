package com.fundamentals.data;

public class Grades {
	public void grade(char value) {
		String grade;
		switch(value) {
		case 1:
			grade = "Excellent"; 
			break; 
		case 2:
			grade = "Very Good";
		case 3:
			grade = "Good";
			break;
		case 4:
			grade = "Average";
			break;
		case 5:
			grade = "Fail";
			break;
		case 6:
		default:
			grade = "Not a valid day"; 
			break; 
		} // end of switch 
		System.out.println(grade);
	} // end of method 
	
	public void divideByThree() {
		for(int i = 0; i < 30; i ++) {
			if(i %  3== 0) {
				
			}
			System.out.println(i);

	} // end of for loop
	}
}

