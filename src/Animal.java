/*
 * Author: Thanos Moschou
 * Description: This is a small project to help you learn about annotations in Java.
 * Last Modification Date: 14/12/2023
 */


public abstract class Animal 
{
	private String name;
	
	public Animal(String aName)
	{
		this.name = aName;
	}
	
	
	public String getName()
	{
		return this.name;
	}
}
