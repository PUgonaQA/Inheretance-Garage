package com.qa.animal;

public class Animal {
	
	private boolean isAlsoWild;
	private int numOfLegs;
	private boolean breatheUnderwater;
	

	public boolean isAlsoWild() {
		return isAlsoWild;
	}

	
	public boolean breatheUnderwater() {
		return breatheUnderwater;
	}
	
	public int numOfLegs() {
		return numOfLegs;
	}
	
	public Animal(boolean isAlsoWild, int numOfLegs, boolean breatheunderwater) {
		this.numOfLegs = numOfLegs;
		this.breatheUnderwater = true;
		this.isAlsoWild = true;
	}
}
