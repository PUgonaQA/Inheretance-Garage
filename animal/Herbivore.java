package com.qa.animal;

public class Herbivore extends Pets{
	
	private int typicalWeight;

	
	public int typicalWeight() {
		return typicalWeight;
	}
	
	public Herbivore(int typicalWeight, boolean isAlsoWild, int numOfLegs, boolean breatheunderwater, int price, boolean needInsurance) {
		super(isAlsoWild, numOfLegs, breatheunderwater, price, needInsurance);
		this.typicalWeight = typicalWeight;
		
	}
	
	
}
