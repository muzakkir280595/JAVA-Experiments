package carsDealership;

//Car.java
public class Car {

	// Properties (fields)
	String brand;
	String model;
	int year;
	
	// Methods (Behaviors)
	public void startEngine() {
		System.out.println(brand+" "+model+" engine started");
	}
	
	public void drive() {
		System.out.println("The "+brand+" is driving");
	}

}
