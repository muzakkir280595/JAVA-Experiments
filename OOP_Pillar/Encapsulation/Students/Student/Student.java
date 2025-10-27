package OOP_Pillar.Encapsulation.Students.Student;

public class Student {
    // Private instance variables (data hiding)
    private String name;
    private int age;

    // Public constructor
    public Student(String name, int age) {
        this.name = name;
        // Use the setter to enforce validation during object creation
        setAge(age); 
    }

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method with validation (controlled access)
    public void setAge(int age) {
        if (age > 0) { // Validation check
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be a positive number.");
        }
    }
}
