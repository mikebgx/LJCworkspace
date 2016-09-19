/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package objects;

/*
 * Section 2. Classes & Objects (part 2)
 */
public class Demo2 {

	public static void main(String[] args) {

		// 6. Arrays (of primitives for now)
		int[] ai= null;				// ai is a reference variable
		ai= new int[5];	  			// Another special Object  '5' can be a vbl
		System.out.println( ai );	// What prints?

		// Accessing array elements
		for (int i= 0; i< ai.length; i++) {
			ai[i]= i;
		}
		
		
		// 7. Alternative way to initialise arrays
		int[] ages= {21,23,25,19};
		for (int x: ages) {			// New style  for  loop
			System.out.println( x );
		} /* */
		
		
		// See Demo3

	}

}
