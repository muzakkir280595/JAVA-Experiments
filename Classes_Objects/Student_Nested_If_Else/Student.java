package Student_Nested_If_Else;

// Student.java
public class Student {
    // Properties
    String name;
    int score; // From 0 to 100
    boolean attendedClasses; // true if attended regularly, false otherwise

    // Method with nested if-else
    public void evaluatePerformance() {
        System.out.println("Evaluating " + name + "'s performance...");
        
        // Outer if-else: checks the student's score
        if (score >= 90) {
            System.out.println("Grade: A - Excellent! 🌟");
            
            // Nested if-else: checks if the A-student also attended classes
            if (attendedClasses) {
                System.out.println("Your perfect attendance shows great dedication.");
            } else {
                System.out.println("Despite poor attendance, your high score is impressive.");
            }
        } else if (score >= 70) {
            System.out.println("Grade: B - Good job! 👍");
            
            // Nested if-else: checks if the B-student attended classes
            if (attendedClasses) {
                System.out.println("Consistent effort is paying off.");
            } else {
                System.out.println("There is room for improvement in attendance to reach your full potential.");
            }
        } else {
            System.out.println("Grade: C or lower - More effort is needed. 😕");
            
            // Nested if-else: checks if the student with a low score attended classes
            if (attendedClasses) {
                System.out.println("Even with good attendance, your scores are low. Consider seeking help.");
            } else {
                System.out.println("Poor attendance likely contributed to this low score.");
            }
        }
    }
}