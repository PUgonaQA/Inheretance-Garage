package com.qa.animal;

public class Pets extends Animal{
	
	private int price;
	private boolean needInsurance;
	
	public int price() {
		return price;
	}
	public boolean needInsurance() {
		return needInsurance;
	}
	
	
	public Pets(boolean isAlsoWild, int numOfLegs, boolean breatheunderwater, int price, boolean needInsurance) {
		super(isAlsoWild, numOfLegs, breatheunderwater);
		this.needInsurance = true;
		this.price = price;
	}
	
	
 }
