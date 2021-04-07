package com.qa.animal;

public class Rabbit extends Herbivore{
	
	private String breed;
	
	public String breed() {
		return breed;
	}
	
	public Rabbit(String breed, int typicalWeight, boolean isAlsoWild, int numOfLegs, boolean breatheunderwater, int price, boolean needInsurance) {
		super(typicalWeight, isAlsoWild, numOfLegs, breatheunderwater, price, needInsurance);
		this.breed = breed;
	}
		

}
