package calculator;
class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Another overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));        // Calls the first method
        System.out.println(calc.add(2, 3, 4));     // Calls the second method
        System.out.println(calc.add(2.5, 3.5));    // Calls the third method
    }
}