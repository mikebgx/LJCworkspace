package exercise03;

public class Cat {

	private String name;
	private int weight;

	public Cat(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public void eat( int mealSize ) {
		weight+= mealSize / 2;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", weight=" + weight + "]";
	}
	
}
