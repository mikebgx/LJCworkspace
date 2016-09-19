/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package objects;

/*
 * Section 2. Classes & Objects (part 3)
 */
public class Demo3 {

	public static void main(String[] args) {

		/* // 8. User defined objects
		House h= new House();
		System.out.println( "House h = "+ h.getDetails() );
		System.out.println( "House h = "+ h.toString() );	// 9. Convention - Copy .^
		System.out.println( "House h = "+ h );				// 10. Compiler adds .toString() call


		/* // 9. Encapsulation, hide implementation behind safe interface
		h.numRooms= 6;
		h.setNumRooms(6);			/* Setter might validate eg disallow -ve */

		
		// 10. Initialise can be better than setter
		House h2= new House( "Ivy Tower", 400);	
		System.out.println( h2 );
		/* ^ this.name= name,  final,  NOTE overrides no-args ctor! */


		// 11. Copying a reference
		House h3= h2;		// Did we copy a House?
		h3.setNumRooms(2);
		System.out.println( "Who stole rooms from: "+ h2+ " ? !!");
		if (h2 == h3) {
			System.out.println( "h2 and h3  are The Same House \n");
		}
		else {
			System.out.println( "Not same house \n" );
		} /* */

		
		// 12. Copy an object, check for equality and equivalence, as we did with Strings
		h3= new House( h2 );	// Write a Copy Ctor
		System.out.println( "h2 = "+ h2 );
		System.out.println( "h3 = "+ h3 );
		System.out.println( "Are h2 and h3 referring to The Same House? : "+ (h2==h3) ); 
		System.out.println( "Are Houses h2 and h3 The Same? : "+ h2.equals(h3) + "\n"); 
		/* Then uncomment House.equals() */		

		
		// 13. Array of objects
		House[] street= new House[3];	 	// Array of Objects, how many House objects got created?
		System.out.println( street );		/* What prints? */

		// 13b. Create the House objects, not just the street!
		for (int i= 0; i< street.length; i++) {
			street[i]= new House( "A House", 4 );
		}
		System.out.println( street ); 		/* What prints? */

		// 13c. Print the actual objects, new style for loop is good here
		for (House h1: street) {
			System.out.println( h1 );
		} /* Better!  */

		// MORE: See LocalDate etc, Google: Java8 API

	}

}
