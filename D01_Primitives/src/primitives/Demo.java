/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package primitives;

/**
 * Section 1. Primitives, Operators, Output, Choice, Loops <p>
 * 
 * Slash and ** starts a "JavaDoc" Documentation comment
 */
public class Demo {

	public static void main(String[] args) {

		int i= 3;
		int j= 4;
		System.out.println( i );	// Simple output (note comment WHY not what)


		// 2. another primitive
		double result= i + j;		// Also 3 / 4   i / j  
		System.out.println( "result= "+ result ); /* Simple output with message. Or .print if we dont want newline after */


		// 3. Operators, the usual arithmetic plus:
		i+= 16;		// Likewise -= etc
		System.out.printf( "i is %d , j is %d %n", i, j );	// And after next 2:
		j= i++;		// Likewise  --
		j= ++i;
		if (i == 21) {	// == not = 
			System.out.println( "Happy birthday 21 today!" );
		}
		else {
			System.out.println( "Never too old to code!" );
		}
		/*  Likewise  and: &&  or: ||  Watch for precedence, add () if unsure, unit tests!  */


		// 4. Loop, also demonstrates formatting
		for (int n= 0; n<4; n++) {
			System.out.printf( "%2d + %2d = %-4d OK! %n",  n, n, n+n  );
		}
		// See API docs for further printf format specifiers eg double: %f  String: %s

		/* DEMO: double precision! */


		// MORE: Other primitives:  float  short  long    byte  char    boolean  
		// MORE: Other Operators: !=   %  & |   ?  
		// MORE: Other Choice: switch statement
		// MORE: Other Loops: while,  do


		// Do Exercise 1. Follow the comments in skeleton E01_Primitives project.

	}

}
