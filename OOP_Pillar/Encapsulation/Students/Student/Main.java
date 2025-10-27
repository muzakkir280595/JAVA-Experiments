package OOP_Pillar.Encapsulation.Students.Student;

public class Main {
    public static void main(String[] args) {
        // Create a new Student object
        Student student1 = new Student("Alice", 20);

        // Access data using public getter methods
        System.out.println("Student Name: " + student1.getName()); // Output: Student Name: Alice
        System.out.println("Student Age: " + student1.getAge());   // Output: Student Age: 20

        // Attempt to modify data using public setter methods
        student1.setAge(25);
        System.out.println("New Age: " + student1.getAge());       // Output: New Age: 25

        // Attempt to set an invalid age
        student1.setAge(-5); // Output: Invalid age. Age must be a positive number.
        System.out.println("Age after invalid attempt: " + student1.getAge()); // Output: Age after invalid attempt: 25
    }
}
