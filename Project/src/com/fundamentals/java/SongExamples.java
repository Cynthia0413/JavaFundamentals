package com.fundamentals.java;

public class SongExamples {
	public String bottlesOfBeer() {
		int beerNum = 99; 
		String word = "bottles"; 
		String songEnd = "";
		while (beerNum > 0) {
			if(beerNum == 1) {
				word = "bottle"; // singular of the class variable
			}
			System.out.println(beerNum + " " +word+" of beer on the wall");
			System.out.println(beerNum + " " +word+" of beer");
			System.out.println("Take one down.");
			System.out.println("Pass it around."); 
			beerNum --; 
			if(beerNum >0) {
				System.out.println(beerNum + " "+word+" of beer on the wall \n");
			} else {
				songEnd = "No more bottles of beer on the wall."; 
			} // end of else 
		} // end of while 
		return songEnd;
	} // end of method
}
