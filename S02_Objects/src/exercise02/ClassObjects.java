/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package exercise02;

/**
 *  Solution to Exercise 2. Objects
 */
public class ClassObjects {

	public static void main(String[] args) {
		
		// 1. Create a class  Person  to encapsulate the data from previous exercise (age, height) also name
		//    Make sure all data is private.
		//	  Consider which data can change during the "Lifetime" of the Person (hint: final fields can be initialised in a constructor)
		
		// 2. Add suitable methods such as toString() and eat() (eating makes you taller!) 
		//    Add suitable getXyz() and setXyz() methods
		//    Write code here to test these features of your Person class
		Person p= new Person();
		System.out.println( p );
		p.setAge(21);
		System.out.println( p );
		p.eat( 6 );
		System.out.println( p );
		p.eat( 5 );
		System.out.println( p );
		
		
		// 3. Add a constructor and test by coding: p= new Person("Fred", 21, 5.8);
		p= new Person("Fred", 21, 5.8);
		System.out.println( "p= "+ p );
		
		
		// 4. Enable one Person to be copied to another and test by coding: Person p2= new Person(p)
		//	  Check that p and p2 actually refer to two different objects
		Person p2= new Person(p);
		System.out.println( "p2= "+ p2 );
		System.out.println( " p == p2 should be false: "+ (p==p2) );
		
		
		// 5. Provide a suitable Person.equals() method and test it
		System.out.println( "p should be equal to p2: "+ p.equals(p2) );
		
		
		// 6. If time, create and display an array of Person objects
		Person[] friends= {p, p2};
		System.out.println( "My friends:" );
		for (Person x: friends) {
			System.out.println( " "+ x );
		}
		
		// 7. If time, change the age field and getAge() method to something more suitable
		//    hint: research the Java8 API for LocalDate

	}

}
