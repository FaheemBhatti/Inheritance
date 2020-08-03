package org.InheritanceExcercise.Child;

import org.InheritanceExcercise.Parent.Animal;

public class Bird extends Animal
{
	private boolean animalWithFeathers;
	private boolean canFly;
	
	public Bird(boolean animalWithFeathers, boolean canFly , 
			double height, double weight, String animalType, String bloodType) 
	{
		super(height, weight, animalType, bloodType);
		this.animalWithFeathers = animalWithFeathers;
		this.canFly = canFly;
	}

	public Bird() 
	{
		super();
		this.animalWithFeathers = true;
		this.canFly = true;
	}

	public boolean isAnimalWithFeathers() 
	{
		return animalWithFeathers;
	}

	public void setAnimalWithFeathers(boolean animalWithFeathers) 
	{
		this.animalWithFeathers = animalWithFeathers;
	}

	public boolean isCanFly() 
	{
		return canFly;
	}

	public void setCanFly(boolean canFly) 
	{
		this.canFly = canFly;
	}

	@Override
	public String toString() 
	{
		return "Bird [isAnimalWithFeathers()=" + isAnimalWithFeathers() + ", isCanFly()=" + isCanFly()
				+ ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()="
				+ getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}

	@Override
	public void showInfo()
	{
		System.out.println("I am a Bird, a subclass of animal");
		System.out.println(toString());
	}
}
