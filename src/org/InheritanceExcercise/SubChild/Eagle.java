package org.InheritanceExcercise.SubChild;

import org.InheritanceExcercise.Child.Bird;

public class Eagle extends Bird
{

	public Eagle() 
	{
		super();
	}

	public Eagle(boolean animalWithFeathers, boolean canFly, double height, double weight, String animalType,
			String bloodType) 
	{
		super(animalWithFeathers, canFly, height, weight, animalType, bloodType);
	}

	@Override
	public String toString() 
	{
		return "Eagle [isAnimalWithFeathers()=" + isAnimalWithFeathers() + ", isCanFly()=" + isCanFly()
				+ ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()="
				+ getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}

	@Override
	public void showInfo() 
	{
		System.out.println("I am an Eagle, I am a subclass of Bird");
		System.out.println(toString());
	}
}
