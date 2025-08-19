package Dog_If_Else;

// DogPark.java
public class DogPark {
	public static void main(String[] args) {
		// Create an energetic dog object.
		Dog happyDog = new Dog();
		happyDog.name = "Max";
		happyDog.breed = "Golden Retriever";
		happyDog.energyLevel = 9; //High Energy
		
		System.out.println(happyDog.name + " the " + happyDog.breed + " arrives at the park.");
		happyDog.bark(); //This will trigger the first if condition
		
		System.out.println("--------------------");
		
		// Create a calm dog object
		Dog calmDog = new Dog();
		calmDog.name = "Buddy";
		calmDog.breed = "Beagle";
		calmDog.energyLevel = 5; //Medium Energy

        System.out.println(calmDog.name + " the " + calmDog.breed + " is relaxing on a bench.");
        calmDog.bark(); // This will trigger the else if condition

        System.out.println("--------------------");
		
		// Create a calm dog object
		Dog sleepyDog = new Dog();
		sleepyDog.name = "Rocky";
		sleepyDog.breed = "Bulldog";
		sleepyDog.energyLevel = 2; //Low Energy	
		
        System.out.println(sleepyDog.name + " the " + sleepyDog.breed + " just finished a long walk.");
        sleepyDog.bark(); // This will trigger the final else condition
		
	}
}
