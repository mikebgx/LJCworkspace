package inheritance;

public class Car extends Vehicle {

	private int fuelLevel;

	public Car() {
		this( "SomeMake", "SomeModel" );
	}
	
	public Car(String make, String model) {
		super(make, model);
	}
	
	public void addFuel( int litres ) {
		fuelLevel+= litres;
	}

	@Override
	public void alertWalkers() {
		System.out.println( "Toot toot" );
	}
	
	@Override
	public void showModel() {
		super.showModel();
		System.out.println( " Car" );
	}
	
}
