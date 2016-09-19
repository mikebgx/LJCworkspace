/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package exercise04;

/**
 *  Solution to Exercise 4. Inheritance
 */
public class Inheritance {
	public static void main(String[] args) {
		
		// Using the Person and Cat classes that you developed earlier (or solution S03_Association if you prefer),
		// implement the following:
		
		// 1. A Person can choose whether to have a Cat or Dog, both of which are `kinds of` Animal.
		//	  So create new classes for Animal and Dog, and add the `extends` keyword as appropriate
		//	  All Animals have a weight and can eat, so move this state & behaviour from the Cat class into the Animal class.
		//	  Add a constructor to the Animal class which takes an int for the Animal's weight.
		//	  The `name` field might also be considered common but leave it in the Cat and Dog classes for now.
		//	  Test that Cat and Dog inherit the eat() functionality by coding like:
		//	Cat c= new Cat( "Sid", 6 ); syso; c.eat( 6 ); And likewise for a Dog
		//	    Note you may need to change sub-class code that references superclass fields such as `weight`, to call a getter instead.
		Cat c= new Cat( "Sid", 6 );
		System.out.println( c );
		c.eat( 10 );
		System.out.println( c );
		Dog d= new Dog( "Fido", 21 );
		System.out.println( d );
		d.eat( 20 );
		System.out.println( d );
		
		
		// 2. All Animals can announce their presence so add an abstract void sayHi() method to the Animal class
		//	  and implement it in the Cat and Dog classes by printing "woof" etc.
		//	  Test by coding like:
		//	Animal a= d; a.sayHi(); a= c; a.sayHi();
		//	  Notice that the same code a.sayHi() does two different things, that's polymorphism!
		Animal a= d;
		a.sayHi();
		a= c;
		a.sayHi();
		
		// 3. Change the Person class, renaming any ...Cat... fields and methods to ..Pet..
		//	  Hint: Use your IDE's Refactoring mechanism eg Eclipse> Right-click> Refactor> Rename
		//	  Test by creating a Person and a few Animals, and adding them as pets to the Person.
		//	  Then display the Person including their pets (add code to Person.toString() so as to display all of their pets)
		Person p= new Person();
		p.addPet( c );
		p.addPet( d );
		System.out.println( p );
		
	}

}
