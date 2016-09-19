/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package objects;

import java.util.Scanner;

/*
 * Section 2. Classes & Objects (part 1)
 */
public class Demo1 {

	public static void main(String[] args) {
		
		int i= 0;

		// 1. Reference variable, create object, call method
		Scanner aScanner;
		aScanner= new Scanner( System.in);
		System.out.println( "Age? ");	// Keep user informed! 
		i= aScanner.nextInt();
		System.out.println( "Happy "+ i+ "th birthday!" );
		/* Remember to click in console window when running with Eclipse */
		
		
		// 2. String is a special Object, we don't need to say  new
		String s1= "Hello";
		String s2= "Hello";
		if (s1 == s2) 
			System.out.printf("%s == %s %n", s1, s2);
		/*  */
		
		
		// 3. Equality trap!!
		String s3= s1.toUpperCase();	// Has various methods
		String s4= s2.toUpperCase();
		if (s3 == s4)
			System.out.printf("%s == %s %n", s3, s4);
		else
			System.out.printf("%s IS NOT == %s %n", s3, s4); /* What gets printed ? */
		
		
		// 4. Remember to call .equals() on objects!!
		System.out.printf("%s .equals %s is:  %b %n", s1, s2,  s1.equals(s2) );	
		System.out.printf("%s .equals %s is:  %b %n", s3, s4,  s3.equals(s4) ); /* Better! */
		
		
		// 5. More Scanner methods, to input Strings
		System.out.println( "Who are you?" );
		s1= aScanner.next();
		System.out.println( "Where do you live?" );
		aScanner.skip("[\r\n]+");	// Or .nextLine() would return just  \n
		s2= aScanner.nextLine();	// To read whole line not just 1 "word"
		System.out.println( "Hello "+ s1+ ". Have a nice journey back to "+ s2); /* */
		
		
		// See Demo2
	}

}
