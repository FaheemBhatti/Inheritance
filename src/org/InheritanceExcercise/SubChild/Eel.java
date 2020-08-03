package org.InheritanceExcercise.SubChild;

import org.InheritanceExcercise.Child.Fish;

public class Eel extends Fish
{
	private boolean releaseElectricCharge;

	public Eel(boolean livesInWater, boolean hasGills, double height, double weight, String animalType,
			String bloodType, boolean releaseElectricCharge) 
	{
		super(livesInWater, hasGills, height, weight, animalType, bloodType);
		this.releaseElectricCharge = releaseElectricCharge;
	}

	public Eel() 
	{
		super();
		this.releaseElectricCharge = true;
	}

	public boolean isReleaseElectricCharge() 
	{
		return releaseElectricCharge;
	}

	public void setReleaseElectricCharge(boolean releaseElectricCharge) 
	{
		this.releaseElectricCharge = releaseElectricCharge;
	}

	@Override
	public String toString() 
	{
		return "Eel [isReleaseElectricCharge()=" + isReleaseElectricCharge() + ", isLivesInWater()=" + isLivesInWater()
				+ ", isHasGills()=" + isHasGills() + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight()
				+ ", getAnimalType()=" + getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}

	@Override
	public void showInfo() 
	{
		System.out.println("I am Eel, I am a subclass of Fish ");
		System.out.println(toString());
	}
}
