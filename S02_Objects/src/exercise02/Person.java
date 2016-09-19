package exercise02;

public class Person {

	private final String name;
	int age;
	double height;
	
	public Person(String name, int age, double height) {
		this.name= name;
		this.age= age;
		this.height= height;
	}
	
	public Person() {
		name= "Somebody";
		//MORE: Research better alternative:  this("Somebody", 0, 0);
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


	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
	}

	public void eat(int portionSize) {
		height+= portionSize / 3.0;
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
