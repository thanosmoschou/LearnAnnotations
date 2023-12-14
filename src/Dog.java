/*
 * Author: Thanos Moschou
 * Description: This is a small project to help you learn about annotations in Java.
 * Last Modification Date: 14/12/2023
 */


public class Dog extends Animal
{
	private String sound;
	
	public Dog(String aName)
	{
		super(aName);
		this.sound = "Woof";
	}

	
	@RunImmediately(repeat = 4)
	public void makeSound() 
	{
		System.out.println(this.sound);
	}
	
	
}
