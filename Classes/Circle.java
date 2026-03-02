package Classes;

public class Circle {

    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        // Circle area formula: A=πr^2
        return Math.PI * (radius * radius);
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "Circle[radius = " + radius + ", color = " + color + "]";
    }
}

// A constructor in Java is a special method
// that runs when you create an object.
// It is mainly used to initialize the object’s data.

// It has the same name as the class
// It has no return type (not even void)
// It runs automatically when you use new