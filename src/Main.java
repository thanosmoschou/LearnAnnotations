/*
 * Author: Thanos Moschou
 * Description: This is a small project to help you learn about annotations in Java.
 * Last Modification Date: 14/12/2023
 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Main 
{

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		Animal cat = new Cat("mia");
		Animal dog = new Dog("max");
		
  		//With getClass() method or class literal I can get the instance(object) of a class or an interface of a running program
  		//For example with myObject.getClass() or myObject.class I get the instance of the class that myObject belongs to.
		
		//check if Cat has the VeryImportant annotation
		if(cat.getClass().isAnnotationPresent(VeryImportant.class))
			System.out.println("This is very important");
		else
			System.out.println("This is not very important");
		
		//check if Dog has the VeryImportant annotation
		if(dog.getClass().isAnnotationPresent(VeryImportant.class))
			System.out.println("This is very important");
		else
			System.out.println("This is not very important");
		
		
		//Now let's get the declared methods from Dog class and see if 
		//a method has RunImmediately annotation. If yes then we will invoke it.
		//To get Dog class declared methods I will use dog object I just created before.
		//getClass() will return the runtime class of an object.
		//Check Java documentation for more information about getClass method
		//I use Java Reflection
		for(Method method : dog.getClass().getDeclaredMethods())
			if(method.isAnnotationPresent(RunImmediately.class))
			{
				//get the annotation
				RunImmediately annotation = method.getAnnotation(RunImmediately.class);
				
				//now let's call the method
				for(int i = 0; i < annotation.repeat(); i++)
					method.invoke(dog);
			}

	}

}
