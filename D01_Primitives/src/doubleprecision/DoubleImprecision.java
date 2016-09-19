/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package doubleprecision;

public class DoubleImprecision {

	public static void main(String[] args) {
		double apple= 0.1;
		System.out.println( "1  apple costs "+ apple );
		
		double total= apple * 3;
		System.out.println( "3  apples cost "+ total );	// 1. What gets printed?
		
		total= 0;
		for (int i=0; i<10; i++)
			total= total + apple;
		System.out.println( "10 apples cost "+ total );	// 2. What gets printed?
		
		
		// 3. Format to whole pence
		System.out.printf( " Or roundly formatted as: %07.2f %n", total);
		
		
		// 4. Calculate to whole pence
		double roundedTotal= Math.round(total*100)/100.0 ;
		System.out.println( " Or roundly calculated as "+ roundedTotal); 

	}

}
