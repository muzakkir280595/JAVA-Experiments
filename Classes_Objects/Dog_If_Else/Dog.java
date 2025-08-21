package Dog_If_Else;

//Dog.java
public class Dog {
	// Properties
	String name;
	String breed;
	int energyLevel; // On scale of 1-10
	
	// Method with if-else
	public void bark() {
		if (energyLevel > 7) {
			System.out.println(name + " is barking excitedly! Woof Woof!");
		} else if (energyLevel > 4){
			System.out.println(name + " gives a calm bark. Ruff.");
		}else {
			System.out.println(name + " is too tired to bark. Zzz.");
		}
	}
	
}
