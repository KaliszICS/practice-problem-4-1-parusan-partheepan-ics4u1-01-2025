public class Main {
    public static void main(String[] args) {
        // Test Rectangle
        Rectangle rect = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle Area: " + rect.area());
        System.out.println("Rectangle Perimeter: " + rect.perimeter());
        
        // Test Circle
        Circle circle = new Circle(4.0);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Circumference: " + circle.circumference());
        
        // Test Person
        Person person = new Person("John Doe", 25, 180, 75, "Blue", "Brown");
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Age: " + person.getAge());
    }
}