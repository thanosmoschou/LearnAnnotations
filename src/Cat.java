/*
 * Author: Thanos Moschou
 * Description: This is a small project to help you learn about annotations in Java.
 * Last Modification Date: 14/12/2023
 */


@VeryImportant //or @VeryImportant(times = 3) or any number you want
public class Cat extends Animal
{
	private String sound;
	
	public Cat(String aName)
	{
		super(aName);
		this.sound = "Meow";
	}

	//You cannot annotate a method with @VeryImportant() because this annotation is only for Classes
	public void makeSound() 
	{
		System.out.println(this.sound);
	}
	
	
}
