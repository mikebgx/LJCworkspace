package exercise04;

public class Cat extends Animal {

	private String name;
	
	public Cat(String name, int weight) {
		super(weight);	/// 1. 
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Cat [name=" + name + ", weight=" + getWeight() + "]"; /// 1. use getter instead of weight field
	}

	@Override
	public void sayHi() {	/// 2.
		System.out.println( "Miaw!" );
	}
	
}
