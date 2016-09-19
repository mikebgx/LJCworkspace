/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package inheritance;

/**
 *  Section 4. Inheritance
 */
public class Demo {

	public static void main(String[] args) {

		Car c= new Car();
		c.showModel();		// In Vehicle , no need to define in Car
		System.out.println();


		// 3. Better to pass make, model to Car ctor (& maybe add a no-args Car ctor?)
		Car c2= new Car( "Ford", "Focus" );	// Note Car ctor super() call must be first stmt
		c2.showModel(); /* */


		// 4. Message is bad, shows 'Vehicle", add Override to Car (with super.) and remove "Vehicle" from Vehicle's method.


		// 5. Substitutability, base ref vbl can refer to sub-class object
		Vehicle v= new Car( "Datsun", "Cherry" );
		v.alertWalkers();
		v= new Bus( "Dennis", "Routemaster" );
		v.alertWalkers();	/* */


		/* 6. How does a `Vehicle` alert walkers
		Vehicle v2= new Vehicle( "Some", "Vehicle" );
		System.out.println( "Vehicle about to alert walkers:");
		v2.alertWalkers();	// Can't !!
		/*  - Need to know what "kind" of Vehicle, ie no such thing as a Vehicle ("Give me a Vehicle") (or Fruit or Sweet) => Abstract*/


		// 7. with abstract Vehicle, cant do new Vehicle as above, need to create specific kinds.
		//    And note error now in Bike, "effectively abstract"
		System.out.println();
		Vehicle v3= c2;
		v3.alertWalkers();
		v3= new Bike( "Santa Cruz", "Blur" );
		v3.alertWalkers();	/* */


		// 8. Array of base (even abstract) references:
		System.out.println();
		Vehicle traffic[]= {c, v3, c2, v};
		for (Vehicle v0: traffic) {
			v0.showModel();		// And fix Bike, Bus .showModel() as per Car
			v0.alertWalkers();
		} /* MORE: Research `protected` accessibility */

	}

}
