package exercise04;

import java.util.Arrays;

public class Person {

	/// 3. Rename various "Cat" fields and methods to ...Pet.., change various variables from Cat to Animal

	private final String name;
	int age;
	double height;
	private Animal[] myPets;	
	private int numPets;
	private int bal;

	public Person(String name, int age, double height) {
		this.name= name;
		this.age= age;
		this.height= height;
		myPets= new Animal[3];		// Plenty for any sane person!!
	}

	public Person() {
		this( "Somebody", 0, 0 );
	}

	public Person(Person p) {
		name= p.name;
		age= p.age;
		height= p.height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}


	public void eat(int portionSize) {
		height+= portionSize / 3.0;
	}

	public void addPet(Animal c) { 
		myPets[numPets++]= c;
	}

		public void buyPetFood(int amt) {
		bal-= amt/5;
	}

	public Animal getPet(int i) { 
		return myPets[i];
	}


	@Override
	public String toString() {
		/// 3. and display Person's Pets:
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", myPets=" + Arrays.toString(myPets)
		+ ", numPets=" + numPets + ", bal=" + bal + "]";
	}
	
	public boolean equals(Object obj) {
		// Eclipse generated. 
		// MORE: Research Objects.equals() and .deepEquals()
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
