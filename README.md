# Circle_And_Square_Calculator

📌 Shape Abstraction in Java
This Java program demonstrates Abstraction using an abstract class (Shape) and two subclasses, Circle and Square, which implement their own version of the calculateArea() method.

# 🚀 Features
✅ Uses abstraction with an abstract class Shape.
✅ Implements polymorphism through dynamic method dispatch.
✅ Demonstrates inheritance with Circle and Square subclasses.


# 📝 Code Explanation
1️⃣ Abstract Class (Shape)
Declares an abstract method calculateArea(), which must be implemented by subclasses.
2️⃣ Subclasses (Circle & Square)
Circle has a radius attribute and implements calculateArea() using the formula:
Area = π * radius²
Square has a side attribute and implements calculateArea() using the formula:
Area = side * side
3️⃣ Main Class (Main)
Demonstrates runtime polymorphism by creating Shape references for Circle and Square.
Calls the calculateArea() method to compute and display the results.
