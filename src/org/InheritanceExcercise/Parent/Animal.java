package org.InheritanceExcercise.Parent;

public class Animal 
{
	private double height;
	private double weight;
	private String animalType;
	private String bloodType;
	public Animal() 
	{
		this.height = 100;
		this.weight = 50;
		this.animalType = "Reptile";
		this.bloodType = "A+";
		
	}
	public Animal(double height, double weight, String animalType, String bloodType) 
	{
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}
	public double getHeight() 
	{
		return height;
	}
	public void setHeight(double height) 
	{
		this.height = height;
	}
	public double getWeight() 
	{
		return weight;
	}
	public void setWeight(double weight) 
	{
		this.weight = weight;
	}
	public String getAnimalType() 
	{
		return animalType;
	}
	public void setAnimalType(String animalType) 
	{
		this.animalType = animalType;
	}
	public String getBloodType()
	{
		return bloodType;
	}
	public void setBloodType(String bloodType) 
	{
		this.bloodType = bloodType;
	}
	
	@Override
	public String toString() 
	{
		return "Animal [getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()="
				+ getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}
	
	public void showInfo()
	{
		System.out.println("I am animal");
		System.out.println(toString());
		
	}
}
