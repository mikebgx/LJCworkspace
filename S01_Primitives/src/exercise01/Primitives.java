/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package exercise01;

/**
 *  Solution to Exercise 1. Primitives
 */
public class Primitives {

	public static void main(String[] args) {

		// Part 1.
		// Declare suitable variables for your age (in years) and height (in feet)
		// Do various arithmetic operations on them, into a double variable called result
		// Print these out, with suitable messages
		int age= 33;
		double height= 5 +  ( 7 / 12.0 ) ;
		double result;
		result= age / height;
		System.out.println( result );

		result= age / ( 5+7/12 );		// Oops!
		System.out.println( result );


		// Part 2. If age is 21 and height is between (you choose) print a special message
		age= 21;
		if ( age == 21  &&  (height > 5.0 || height < 6.0 )) {
			System.out.println( "Special" );
		}


		// Part 3. Loop. Print a multiplication table for your chosen range of numbers eg 0 to 12
		int n= 5;
		for (int row= 0; row < n+1; row++) {
			if (row == 0) {		// In first row, print column headings 
				System.out.print( " ");
				for (int col= 0; col < n+1; col++) {	// TODO Maybe change the "0" to "*"
					System.out.printf( "%3d ", col);
				}
			} // (first row)

			else { // Rows 1 to n
				for (int col= 0; col < n+1; col++) {
					if (col == 0) {	// In first column print row title
						System.out.print(" "+ row+ " : ");
					}
					else System.out.printf( "%3d ",  row * col );	// eg of dropping the {} from a single statement
				}
			} // (row n)

			System.out.println();
		} // (for row)
		// NOTE Code could be made smaller by eliminating some braces but that's dangerous and potentially sackable!


		// Part 4. If time try out:  other operators, loops, switch statement
		System.out.printf( "n = %d ,  n / 3 =%d,  n mod 3 = %d %n",  n,  n / 3,  n % 3 );


		n= 0;
		while (n<5) {
			System.out.println( n++ );
		}


		do {
			System.out.println( n++);
			if (n % 4  ==  0)
				break;
		} while (n<11);


		n= 42;
		String s;
		switch (n % 10) {
		case 1:
			s= "st";
			break;
		case 2:
			s= "nd";
			break;
		case 3:
			s= "rd";
		default:
			s= "th";
		}
		System.out.println( "See you on the "+ n+ s+ " of March!" );

	}

}
