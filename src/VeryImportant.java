/*
 * Author: Thanos Moschou
 * Description: This is a small project to help you learn about annotations in Java.
 * Last Modification Date: 14/12/2023
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//If you want to make this annotation valid for more things
// @Target({ElementType.TYPE, ElementType.FIELD, ....})

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) //You can pass different RetentionPolicy constants
public @interface VeryImportant 
{
	int times() default 1;
}
