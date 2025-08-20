package Student_Nested_If_Else;

//School.java
public class School {
 public static void main(String[] args) {
     // A high-achieving student with good attendance
     Student john = new Student();
     john.name = "John";
     john.score = 95;
     john.attendedClasses = true;
     john.evaluatePerformance();

     System.out.println("--------------------");

     // A talented but inconsistent student
     Student mary = new Student();
     mary.name = "Mary";
     mary.score = 82;
     mary.attendedClasses = false;
     mary.evaluatePerformance();

     System.out.println("--------------------");
     
     // A student who struggles despite attending classes
     Student lisa = new Student();
     lisa.name = "Lisa";
     lisa.score = 65;
     lisa.attendedClasses = true;
     lisa.evaluatePerformance();
 }
}
