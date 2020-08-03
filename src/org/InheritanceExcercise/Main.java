package org.InheritanceExcercise;

import java.util.ArrayList;

import org.InheritanceExcercise.Child.Fish;
import org.InheritanceExcercise.Child.Reptile;
import org.InheritanceExcercise.Parent.Animal;
import org.InheritanceExcercise.SubChild.Crocodile;
import org.InheritanceExcercise.SubChild.Eagle;
import org.InheritanceExcercise.SubChild.Eel;

public class Main 
{
	/*
	 * This is the main method in which everything will be called
	 */
	public static void main(String[] args)
	{
		ArrayList<Animal> animals = new ArrayList<Animal>();

		animals.add(new Crocodile());
		animals.add(new Eagle());
		animals.add(new Eel());
		animals.add(new Reptile());
		animals.add(new Fish());
		
		for (Animal animalsInList: animals)
		{
			System.out.println(animalsInList);
		}
	}
}
