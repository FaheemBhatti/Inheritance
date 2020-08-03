package org.InheritanceExcercise.Child;

import org.InheritanceExcercise.Parent.Animal;

public class Reptile extends Animal
{
	private String skinType;
	private boolean hasBackBone;
	protected String eggType;
	
	public Reptile(String skinType, boolean hasBackBone, String eggType, 
			double height, double weight, String animalType, String bloodType) 
	{
		super(height, weight, animalType , bloodType);
		this.skinType = skinType;
		this.hasBackBone = hasBackBone;
		this.eggType = eggType;
	}

	public Reptile() 
	{
		super();
		this.hasBackBone = true;
		this.eggType = "soft-shelled eggs";
		this.skinType = "scutes";
		
	}

	public String getSkinType() 
	{
		return skinType;
	}

	public void setSkinType(String skinType) 
	{
		this.skinType = skinType;
	}

	public boolean isHasBackBone() 
	{
		return hasBackBone;
	}

	public void setHasBackBone(boolean hasBackBone) 
	{
		this.hasBackBone = hasBackBone;
	}

	public String getEggType() 
	{
		return eggType;
	}

	public void setEggType(String eggType) 
	{
		this.eggType = eggType;
	}

	@Override
	public String toString() 
	{
		return "Reptile [getSkinType()=" + getSkinType() + ", isHasBackBone()=" + isHasBackBone() + ", getEggType()="
				+ getEggType() + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()="
				+ getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}

	@Override
	public void showInfo() 
	{
		System.out.println("I am Reptile a sub class of Animal class");
		System.out.println(toString());
	}
}
