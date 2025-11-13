public class Circle {
    private double radius;
    private static final double PI = 3.14;
    
    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Getter
    public double getRadius() {
        return radius;
    }
    
    // Methods
    public double area() {
        return PI * radius * radius;
    }
    
    public double circumference() {
        return 2 * PI * radius;
    }
}