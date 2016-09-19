package inheritance;

public abstract class Vehicle {

	private final String make;
	private final String model;

	public Vehicle() {
		this( "SomeMake", "SomeModel");
	}
	
	public Vehicle(String make, String model) {
		this.make = make;
		this.model = model;
	}

	public void showModel() {
		System.out.print( "I'm a shiny "+ make+ " "+ model+ " Vehicle ");
	}

	abstract public void alertWalkers();

}
