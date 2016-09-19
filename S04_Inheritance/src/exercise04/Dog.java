package exercise04;

public class Dog extends Animal {

	String name;	/// 1.
	
	public Dog(String name, int wt) {
		super(wt);			/// 1.
		this.name= name;	/// 1.
	}

	@Override
	public String toString() {	/// 1.
		return "Dog [name=" + name + ", getWeight()=" + getWeight() + "]";
	}

	@Override
	public void sayHi() {	/// 2.
		System.out.println( "Woof!" );
	}

}
