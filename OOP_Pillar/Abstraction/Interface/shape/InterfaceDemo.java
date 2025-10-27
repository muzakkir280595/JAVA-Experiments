package OOP_Pillar.Abstraction.Interface.shape;

// Interface (Contract)
interface Drawable {
    // Methods are implicitly public and abstract
    void draw();
    double calculateArea();
}

// Class implementing the interface
class Circle implements Drawable {
    private double radius = 5.0;

    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Another class implementing the interface
class Rectangle implements Drawable {
    private double length = 4.0;
    private double width = 6.0;

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Drawable shape1 = new Circle();
        Drawable shape2 = new Rectangle();

        // The main method only interacts with the 'Drawable' contract (abstraction)
        shape1.draw();
        System.out.println("Area: " + shape1.calculateArea());

        shape2.draw();
        System.out.println("Area: " + shape2.calculateArea());
    }
}