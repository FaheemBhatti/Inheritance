package org.InheritanceExcercise.SubChild;

import org.InheritanceExcercise.Child.Reptile;

public class Crocodile extends Reptile
{
	public Crocodile() 
	{
		super();
		eggType = "Hard-shelled eggs";
	}
 
	public Crocodile(String skinType, boolean hasBackBone, String eggType, double height, double weight,
			String animalType, String bloodType)
	{
		super(skinType, hasBackBone, eggType, height, weight, animalType, bloodType);
		
	}
}