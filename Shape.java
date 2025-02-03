// Abstract class Shape
abstract class Shape {
    abstract double calculateArea(); // Abstract method
}

// Subclass: Circle
class Circle extends Shape {
    private double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implement calculateArea() method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass: Square
class Square extends Shape {
    private double side;

    // Constructor
    Square(double side) {
        this.side = side;
    }

    // Implement calculateArea() method
    @Override
    double calculateArea() {
        return side * side;
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);  // Circle with radius 5
        Shape square = new Square(4);  // Square with side 4

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Square Area: " + square.calculateArea());
    }
}
