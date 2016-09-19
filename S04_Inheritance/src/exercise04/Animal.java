package exercise04;

//public class Animal {
public abstract class Animal {

	private int weight;

	public abstract void sayHi(); /// 2.

	public Animal(int weight) {
		this.weight= weight;
	}

	public void eat(int mealSize) {
		weight+= mealSize / 2;
	}

	public int getWeight() {	/// 1.
		return weight;
	}

}
