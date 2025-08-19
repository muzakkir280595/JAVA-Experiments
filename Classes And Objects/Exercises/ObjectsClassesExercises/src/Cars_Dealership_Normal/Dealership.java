package Cars_Dealership_Normal;

//Dealership.java
public class Dealership {

	public static void main (String[] args) {
		//Creating the first Car object.
		Car myCar = new Car();
		myCar.brand = "Toyota";
		myCar.model = "Camry";
		myCar.year = 2022;
		
		System.out.println("My first car is a "+myCar.brand+" "+myCar.model);
		myCar.startEngine();
		
		//Creating the second Car Objects.
		Car newCar = new Car();
		newCar.brand = "Honda";
		newCar.model = "Civic";
		newCar.year = 2024;
		
		System.out.println("My second car is a "+newCar.brand+" "+newCar.model);
		newCar.drive();
	}
}
