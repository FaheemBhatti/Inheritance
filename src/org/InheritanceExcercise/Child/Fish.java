package org.InheritanceExcercise.Child;

import org.InheritanceExcercise.Parent.Animal;

public class Fish extends Animal
{
	private boolean livesInWater;
	private boolean hasGills;
	
	public Fish(boolean livesInWater, boolean hasGills, 
			double height, double weight, String animalType, String bloodType) 
	{
		super(height, weight, animalType, bloodType);
		this.livesInWater = livesInWater;
		this.hasGills = hasGills;
	}
	
	public Fish()
	{
		super();
		this.hasGills = true;
		this.livesInWater = true;
	}

	public boolean isLivesInWater() 
	{
		return livesInWater;
	}

	public void setLivesInWater(boolean livesInWater) 
	{
		this.livesInWater = livesInWater;
	}

	public boolean isHasGills() 
	{
		return hasGills;
	}

	public void setHasGills(boolean hasGills) 
	{
		this.hasGills = hasGills;
	}

	@Override
	public String toString() 
	{
		return "Fish [isLivesInWater()=" + isLivesInWater() + ", isHasGills()=" + isHasGills() + ", getHeight()="
				+ getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()=" + getAnimalType()
				+ ", getBloodType()=" + getBloodType() + "]";
	}

	@Override
	public void showInfo() 
	{
		System.out.println("I am Fish a subclass of Animal");
		System.out.println(toString());
	}
}
