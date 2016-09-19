package inheritance;

public class Bike extends Vehicle {

	public Bike(String make, String model) { 
		super(make, model);
	}

	public void carry( int metres ) {
//		rider.exert (metres / 3)	// How many pounds does rider lose?!
	}

	@Override
	public void alertWalkers() {
		System.out.println( "Ding!" );
	}
	
	@Override
	public void showModel() {
		super.showModel();
		System.out.println( " Bike");
	}

}
